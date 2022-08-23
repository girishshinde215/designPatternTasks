package com.ct.dao;

import java.util.List;

import com.ct.model.Director;
import com.ct.model.Movie;

public interface MovieDao {

	public int highestRevenueGenerated(String language);
	
	public int lowestRevenueGenerated(String language);
	
	public long sumofRevenues(String language);
	
	public double avaerageOfRevenue(String language);
	
	public long numberOfMovies(String language);
	
}
