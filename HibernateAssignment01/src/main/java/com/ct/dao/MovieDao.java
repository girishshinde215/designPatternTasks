package com.ct.dao;

import com.ct.model.Movie;

public interface MovieDao {

	public void addMovie(Movie movie);
	
	public void deleteMovie(int movieId);
	
	public void updateMovie(int movieId);
	
	public Movie getMovie(int movieId);
}
