package com.example.MovieTicket.Service;

import org.springframework.stereotype.Service;

import com.example.MovieTicket.Entity.MovieEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
public class MovieTicketService {
	
	 @PersistenceContext
	 private EntityManager entityManager;

	 public void createMovie(int movieid, String moviename, String time, int availableSeat) {
	    	MovieEntity movie = new MovieEntity();
	        movie.setMovieid(movieid);
	        movie.setMoviename(moviename);
	        movie.setTime(time);
	        movie.setAvailableSeat(availableSeat);
	        entityManager.persist(movie);

}
	
}
