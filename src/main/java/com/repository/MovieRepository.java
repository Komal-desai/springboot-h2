package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Movie;
import com.entity.MovieId;

@Repository
public interface MovieRepository extends JpaRepository<Movie, MovieId>{
	
	public Movie findRatingById(Long id);
	

}
