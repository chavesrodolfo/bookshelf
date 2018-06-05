package io.github.chavesrodolfo.books;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.flywaydb.core.Flyway;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bendb.dropwizard.jooq.JooqBundle;
import com.bendb.dropwizard.jooq.JooqFactory;

import io.dropwizard.Application;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;
import io.github.chavesrodolfo.books.filter.ApplicationFilter;
import io.github.chavesrodolfo.books.health.BookHealthCheck;
import io.github.chavesrodolfo.books.resources.BookResource;


public class App extends Application<BookConfiguration> {
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) throws Exception {
		new App().run(args);
	}

	@Override
	public void initialize(Bootstrap<BookConfiguration> bootstrap) {
		
		bootstrap.addBundle(new SwaggerBundle<BookConfiguration>() {
			@Override
			protected SwaggerBundleConfiguration getSwaggerBundleConfiguration(BookConfiguration configuration) {
				return configuration.swaggerBundleConfiguration;
			}
		});
		
		bootstrap.addBundle(new JooqBundle<BookConfiguration>() {
			@Override
			public DataSourceFactory getDataSourceFactory(BookConfiguration configuration) {
				return configuration.getDataSourceFactory();
			}

			@Override
			public JooqFactory getJooqFactory(BookConfiguration configuration) {
				return configuration.getJooqFactory();
			}
		});
	}

	@Override
	public void run(BookConfiguration bookConfiguration, Environment environment) throws Exception {
		LOGGER.info("Running application " + bookConfiguration.getAppName());

		environment.servlets().addFilter("Custom-Filter", ApplicationFilter.class)
				.addMappingForUrlPatterns(java.util.EnumSet.allOf(javax.servlet.DispatcherType.class), true, "/*");

		environment.healthChecks().register("appName", new BookHealthCheck(bookConfiguration.getAppName()));

		try {
			Class.forName(bookConfiguration.getDataSourceFactory().getDriverClass()).newInstance();
			Connection conn = DriverManager.getConnection(bookConfiguration.getDataSourceFactory().getUrl(),
					bookConfiguration.getDataSourceFactory().getUser(),
					bookConfiguration.getDataSourceFactory().getPassword());
			org.jooq.Configuration conf = new DefaultConfiguration().set(conn).set(SQLDialect.HSQLDB);
			
			environment.jersey().register(new BookResource(conf, conn));

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			LOGGER.error("Error getting database connection");
		}
		
        Flyway flyway = new Flyway();

        flyway.setDataSource(bookConfiguration.getDataSourceFactory().getUrl(), 
        		bookConfiguration.getDataSourceFactory().getUser(), 
        		bookConfiguration.getDataSourceFactory().getPassword());
        flyway.clean();
        flyway.setSchemas("PUBLIC");
        flyway.migrate();

	}

}
