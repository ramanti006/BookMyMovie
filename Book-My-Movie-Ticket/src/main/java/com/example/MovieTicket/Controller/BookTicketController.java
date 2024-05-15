package com.example.MovieTicket.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.MovieTicket.Entity.UserEntity;
import com.example.MovieTicket.Repository.BookTicketRepo;

@RestController
public class BookTicketController {
	
	@Autowired
	private BookTicketRepo repo;
	
	@PostMapping("/bookMovie")
	public UserEntity bookMovie(@RequestBody UserEntity us )
	{
		
		 return repo.save(us);
		
	}

}
