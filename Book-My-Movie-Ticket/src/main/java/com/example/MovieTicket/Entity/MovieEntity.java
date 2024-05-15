package com.example.MovieTicket.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TodayMovies")
public class MovieEntity {
	
	@Id
	private int movieid;
	
	@Column(name = "Name")
	private String moviename;
	private String time;
	private int availableSeat;
	
//	@ManyToOne
//	private UserEntity user;
	
	
	public MovieEntity() {
		super();
	}

public MovieEntity(int movieid, String moviename, String time, int availableSeat) {
	super();
	this.movieid = movieid;
	this.moviename = moviename;
	this.time = time;
	this.availableSeat = availableSeat;
}

public int getMovieid() {
	return movieid;
}

public void setMovieid(int movieid) {
	this.movieid = movieid;
}

public String getMoviename() {
	return moviename;
}

public void setMoviename(String moviename) {
	this.moviename = moviename;
}

public String getTime() {
	return time;
}

public void setTime(String time) {
	this.time = time;
}

public int getAvailableSeat() {
	return availableSeat;
}

public void setAvailableSeat(int availableSeat) {
	this.availableSeat = availableSeat;
}

@Override
public String toString() {
	return "MovieEntity [movieid=" + movieid + ", moviename=" + moviename + ", time=" + time + ", availableSeat="
			+ availableSeat + "]";
}

	
	
	

}
