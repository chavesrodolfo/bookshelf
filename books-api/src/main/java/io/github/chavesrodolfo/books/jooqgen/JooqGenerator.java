package io.github.chavesrodolfo.books.jooqgen;

import org.jooq.util.GenerationTool;
import org.jooq.util.jaxb.Configuration;
import org.jooq.util.jaxb.Database;
import org.jooq.util.jaxb.Generate;
import org.jooq.util.jaxb.Generator;
import org.jooq.util.jaxb.Jdbc;
import org.jooq.util.jaxb.Target;

public class JooqGenerator {

	public static void main(String[] args) throws Exception {
		Configuration configuration = new Configuration()
		    .withJdbc(new Jdbc()
		        .withDriver("com.mysql.jdbc.Driver")
		        .withUrl("jdbc:mysql://localhost:3306/books")
		        .withUser("root")
		        .withPassword(""))
		    .withGenerator(new Generator()
		        .withName("org.jooq.util.DefaultGenerator")
		        .withDatabase(new Database()
		            .withName("org.jooq.util.mysql.MySQLDatabase")
		            .withIncludes(".*")
		            .withExcludes("")
		            .withInputSchema("books"))
		        .withTarget(new Target()
		            .withPackageName("io.github.chavesrodolfo.books.generatedclasses")
		            .withDirectory("src/main/java"))
		        .withGenerate(new Generate()
//		        	      .withJpaAnnotations(true)
//		        	      .withDaos(true)
//		        	      .withValidationAnnotations(true)
		        	      .withPojos(true)));
//		        	      .withSpringAnnotations(true)));

		GenerationTool.generate(configuration);
	}
}