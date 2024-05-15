package com.example.MovieTicket.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.MovieTicket.Entity.MovieEntity;
import com.example.MovieTicket.Repository.MovieSetupRepo;
import com.example.MovieTicket.Service.MovieTicketService;

@RestController
public class MovieSetUpController {
	
	@Autowired
	private MovieSetupRepo mvrepo;
	
	@Autowired
	private MovieTicketService ms;
	
	@PostMapping("/setMovies")
	public String setMovies(@RequestBody MovieEntity mv)
	{
		//ms.createMovie(mv.getMovieid(), mv.getMoviename(), mv.getTime(), mv.getAvailableSeat());
	    mvrepo.save(mv);
		return "Successful";
	}

}
