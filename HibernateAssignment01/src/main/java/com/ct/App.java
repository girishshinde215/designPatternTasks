package com.ct;

import java.util.Scanner;

import com.ct.dao.MovieDaoImpl;
import com.ct.model.Movie;

public class App {
	public static void main(String[] args) {

		System.out.println("Press 1 to insert a movie: \nPress 2 to delete a movie: \nPress 3 to update a movie: \n"
				+ "Press 4 to get a movie:  ");

		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		int choice = scanner.nextInt();

		Movie movie = new Movie();
		MovieDaoImpl daoImpl = new MovieDaoImpl();

		if (choice == 1) {

			System.out.println("Enter Movie Name");
			String movieName = scanner.next();
			System.out.println("Enter Movie Language");
			String movieLanguage = scanner2.nextLine();
			System.out.println("Enter Released in Year");
			int releasedIn = scanner.nextInt();
			System.out.println("Enter Revenue in Dollars");
			int revenue = scanner.nextInt();

			movie.setMovieName(movieName);
			movie.setLanguage(movieLanguage);
			movie.setReleasedIn(releasedIn);
			movie.setRevenueInDollars(revenue);

			daoImpl.addMovie(movie);
		} else if (choice == 2) {
			System.out.println("Enter movie id you want to delete");
			int movieId = scanner.nextInt();

			daoImpl.deleteMovie(movieId);
		} else if (choice == 3) {
			System.out.println("Enter movie ID you want to update");
			int movied = scanner.nextInt();

			daoImpl.updateMovie(movied);
		} else if (choice == 4) {
			System.out.println("Enter movie ID you want to get");
			int movied = scanner.nextInt();
			System.out.println(daoImpl.getMovie(movied));
		}
	}
}
