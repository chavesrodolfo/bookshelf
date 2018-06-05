package io.github.chavesrodolfo.books;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.bendb.dropwizard.jooq.JooqFactory;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;

public class BookConfiguration extends Configuration {

	@JsonProperty
	@NotEmpty
	private String appName;

	@JsonProperty("swagger")
	public SwaggerBundleConfiguration swaggerBundleConfiguration;

	@JsonProperty
	@NotNull
	private JooqFactory jooqFactory = new JooqFactory();

	@JsonProperty
	@NotNull
	private DataSourceFactory dataSourceFactory;

	public JooqFactory getJooqFactory() {
		return jooqFactory;
	}

	public DataSourceFactory getDataSourceFactory() {
		return dataSourceFactory;
	}

	public String getAppName() {
		return appName;
	}

	public SwaggerBundleConfiguration getSwaggerBundleConfiguration() {
		return swaggerBundleConfiguration;
	}
}