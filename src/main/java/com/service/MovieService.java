package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Movie;
import com.repository.MovieRepository;

@Service
public class MovieService {

@Autowired 
private MovieRepository repository;
	
	public Movie save(Movie movie)
	{
		return repository.save(movie);
	}
	
	
	public Movie getRatingByMovieId(Long movieId)
	{
		return repository.findRatingById(movieId);
	}
	
	
	public List<Movie> getAllMovies()
	{
		return repository.findAll();
	}
}

