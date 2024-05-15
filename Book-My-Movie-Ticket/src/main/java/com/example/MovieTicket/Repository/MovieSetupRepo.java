package com.example.MovieTicket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MovieTicket.Entity.MovieEntity;

public interface MovieSetupRepo extends JpaRepository<MovieEntity,String> {

}
