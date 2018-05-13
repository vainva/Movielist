package com.valtteri.movielist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;






@SpringBootApplication
public class MovielistApplication {
	private static final Logger log = LoggerFactory.getLogger(MovielistApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MovielistApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner movieList(MovieRepository repository, TopRepository toprepository, UserRepository userRepository){
		return (args) -> {
			repository.save(new Movie ("The Godfather", "Francis Ford Coppola", "1972"));
			repository.save(new Movie("Ponterosa","Mika & Pasi Kemmo","2001"));
			repository.save(new Movie("Raiders of the Lost Ark","Steven Spielberg","1981"));
			repository.save(new Movie("Blade Runner","Ridley Scott","1982"));
			repository.save(new Movie("Alien","Ridley Scott","1979"));
			repository.save(new Movie("The Terminator","James Cameron","1984"));
			repository.save(new Movie("Terminator 2: Judgment Day","James Cameron","1991"));
			repository.save(new Movie("Star Wars – A New Hope","George Lucas","1977"));
			
			toprepository.save(new Topmovie("Avatar","James Cameron","2009","$2,787,965,087"));
			toprepository.save(new Topmovie("Titanic","James Cameron","1997","$2,187,463,944"));
			toprepository.save(new Topmovie("Star Wars: The Force Awakens","J. J. Abrams","2015","$2,068,223,624"));
			toprepository.save(new Topmovie("Jurassic World","Colin Trevorrow","2015","$1,671,713,208"));
			toprepository.save(new Topmovie("The Avengers","Joss Whedon","2012","$1,518,812,988"));
			toprepository.save(new Topmovie("Furious 7","James Wan","2015","$1,516,045,911"));
			toprepository.save(new Topmovie("Avengers: Age of Ultron","Joss Whedon","2015","$1,405,403,694"));
			toprepository.save(new Topmovie("Harry Potter and the Deathly Hallows – Part 2","David Yates","2011","$1,341,511,219"));
			toprepository.save(new Topmovie("Black Panther","Ryan Coogler","2018","$1,339,985,495"));
			toprepository.save(new Topmovie("Star Wars: The Last Jedi","Rian Johnson","2017","$1,332,422,051"));
			
			userRepository.save(new User("user", "user@email.com", "$2a$04$PbsJ5t.rUYnUoc9pdrGHxuBuunlFFJiOPbrg8vhxIwH2dlFxTkL7q", "USER"));
			
			log.info ("fetch all Movies");
			for (Movie movie : repository.findAll()){
				log.info(movie.toString());
			}
		};
	}
	
}
