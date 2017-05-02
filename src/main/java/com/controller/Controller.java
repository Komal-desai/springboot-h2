package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Movie;
import com.service.MovieService;



@RestController
@RequestMapping(path = "/movie", produces = MediaType.APPLICATION_JSON_VALUE)
public class Controller {

	@Autowired
	MovieService service;

	@RequestMapping(path = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public Movie saveMovie(@RequestBody Movie movie) {
//		Movie movie = new Movie(null, "bahubali", 10L);
		return service.save(movie);

	}

	@RequestMapping(path = "/{movieId}/rating", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Movie getRating(@PathVariable Long  movieId) {
		return service.getRatingByMovieId(movieId);

	}
	
	
	@RequestMapping(path = "/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Movie> getAll() {
		return service.getAllMovies();

	}
}
