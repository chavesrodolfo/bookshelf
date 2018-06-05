package io.github.chavesrodolfo.books.jooqgen;

import org.jooq.util.GenerationTool;
import org.jooq.util.jaxb.Configuration;
import org.jooq.util.jaxb.Database;
import org.jooq.util.jaxb.Generate;
import org.jooq.util.jaxb.Generator;
import org.jooq.util.jaxb.Jdbc;
import org.jooq.util.jaxb.Target;

public class JooqGeneratorH2 {

	public static void main(String[] args) throws Exception {
		Configuration configuration = new Configuration()
		    .withJdbc(new Jdbc()
		        .withDriver("org.h2.Driver")
		        .withUrl("jdbc:h2:~/test")
		        .withUser("sa")
		        .withPassword("sa"))
		    .withGenerator(new Generator()
		        .withName("org.jooq.util.DefaultGenerator")
		        .withDatabase(new Database()
		            .withName("org.jooq.util.h2.H2Database")
		            .withIncludes(".*")
		            .withExcludes("")
		            .withInputSchema("PUBLIC"))
		        .withTarget(new Target()
		            .withPackageName("io.github.chavesrodolfo.books.generatedclasses")
		            .withDirectory("src/main/java"))
		        .withGenerate(new Generate()
		        	      .withPojos(true)
		        	      .withPojosEqualsAndHashCode(true)
		        	      .withPojosToString(true)));

		GenerationTool.generate(configuration);
	}
}