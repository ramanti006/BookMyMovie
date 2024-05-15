package com.example.MovieTicket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MovieTicket.Entity.UserEntity;

@Repository
public interface BookTicketRepo extends JpaRepository<UserEntity,Integer> {

}
