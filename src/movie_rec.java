import java.util.Scanner;

public class movie_rec {
	
	public static void main(String[] args) {
		String[][] movies = {
			{ "1", "Horror", "Event Horizon"},
			{ "2", "Action", "Pacific Rim"},
			{ "3", "Drama", "Scent of a Woman"},
			{ "4", "Science Fiction", "Interstellar"}
		};
		Scanner input_movie = new Scanner(System.in);
		System.out.println(
				"Hi there, I can help you find great movies to watch. \n"
				+ "Please type a number cooresponding to your desired genre.");
		for (int i = 0; i<movies.length; i++) {
			System.out.println(movies[i][0] + ". " + movies[i][1]);
		}
		int toCheckValue = -1;
		while (toCheckValue != 0)	{
			
			try {
				String num_input = input_movie.nextLine();
				toCheckValue = Integer.parseInt(num_input);
				Check(movies, toCheckValue);}
			catch (Exception NumberFormatException) {
				System.out.println("Please enter a valid number");
			}
			if (toCheckValue != 0) {
				System.out.println("\nWould you like another recommendation? (press 0 to end)");
			}
		}	
	}

	 private static void Check(String[][] movies, int choice) {
	 	for(int i = 0; i<movies.length; i++) {
	 		int movie_int = Integer.parseInt(movies[i][0]);
			if ( movie_int  ==  choice) {
				System.out.println("I would recommend you watch " + movies[i][2]);
			}
		}	
	}
}