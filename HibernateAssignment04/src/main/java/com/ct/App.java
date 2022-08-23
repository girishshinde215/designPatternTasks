package com.ct;

import com.ct.dao.MovieDao;
import com.ct.dao.MovieDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
         
    	MovieDao dao = new MovieDaoImpl();
    	System.out.println(dao.highestRevenueGenerated("English"));
    	
// ------------------------------------------------------------------------------------------
    	
//    	MovieDao dao = new MovieDaoImpl();
//    	System.out.println(dao.lowestRevenueGenerated("Hindi"));
    	
// ------------------------------------------------------------------------------------------
    	
//    	MovieDao dao = new MovieDaoImpl();
//    	System.out.println(dao.sumofRevenues("Hindi"));
    	
// ------------------------------------------------------------------------------------------
    	
//    	MovieDao dao = new MovieDaoImpl();
//    	System.out.println(dao.avaerageOfRevenue("Hindi"));
    	
// ---------------------------------------------------------------------------------------------
    	
//    	MovieDao dao = new MovieDaoImpl();
//    	System.out.println(dao.numberOfMovies("Hindi"));
//    	
    }
}
