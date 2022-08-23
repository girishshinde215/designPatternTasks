package com.ct.dao;

import java.util.List;

import com.ct.model.Director;
import com.ct.model.Movie;

public interface MovieDao {

	public List<Movie> getMovieDetails(String language);
	
	public List<Movie> getMoviesForDirector(int directorId);
	
	public void addMovie(Movie movie);
	
	public void updateRevenue(int movieId);
	
	public List<String> getDistinctLanguages();
	
	public List<Movie> getMovieAndDirectorName();
	
}
