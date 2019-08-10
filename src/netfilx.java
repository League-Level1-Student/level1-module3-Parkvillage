package _05_netflix;

public class netfilx {
	
public static void main(String[] args) {
	Movie movie1= new Movie("Aquaman", 4 );
	Movie movie2= new Movie("Bahuballi 2", 6 );
	Movie movie3= new Movie("Jumanji", 4 );
	Movie movie4= new Movie("Black Panther", 5 );
	Movie movie5= new Movie("Monsters inc.", 3 );
	
	System.out.println(movie1.getTicketPrice());
	
	
	
	
	NetflixQueue netQ= new NetflixQueue();
	netQ.addMovie(movie1);
	netQ.addMovie(movie2);
	netQ.addMovie(movie3);
	netQ.addMovie(movie4);
	netQ.addMovie(movie5);
	netQ.sortMoviesByRating();
	
	netQ.printMovies();
	System.out.println("the best movie was "+ netQ.getBestMovie());
	System.out.println("the second best movie was "+ netQ.getMovie(1));
	
}
}
