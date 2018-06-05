package io.github.chavesrodolfo.books.resources;


import java.sql.Connection;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.jooq.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codahale.metrics.annotation.Timed;

import io.github.chavesrodolfo.books.representations.Bookshelf;
import io.github.chavesrodolfo.books.services.BookshelfService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value = "books")
@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

	private static final Logger LOGGER = LoggerFactory.getLogger(BookResource.class);
	
	private BookshelfService bookShelfService;

	public BookResource(Configuration conf, Connection conn) {
		bookShelfService = new BookshelfService(conf, conn);
	}

	@POST
	@Timed
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Finds Books by part of its title or description.", 
		notes = "You can find all books not using 'q' (query param) or filter some results using a 'q' param on the request.", 
		response = Bookshelf.class, 
		responseContainer = "List")
	@ApiImplicitParams({
	    @ApiImplicitParam(name = "q", value = "Query param", required = false, dataType = "string"),
	  })
	public Bookshelf locate(@QueryParam("q") String q) {
		LOGGER.info("Locating books like -> " + q);
		
		Bookshelf bookshelf = bookShelfService.locateBooks(q);
		
		LOGGER.info("Located " + bookshelf.getBookShelf().size() + " books");
		
		return bookshelf;
	}
	
}