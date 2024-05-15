package com.example.MovieTicket.Entity;



import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity {
	
	@Id
	private int userid;
	
	@Column(name = "Name")
	private String username;
	
	@Column(name = "PhoneNo")
	private String phoneno;
	
	@Column(name = "EmailId")
	private String useremailid;
	
	@Column(name = "AgeEliigble")
	private int age;
	
	@Column(name = "TicketNumber")
	private String confirmationnumber;
	
	
	
//	@ManyToMany(cascade = CascadeType.ALL)
//	private List<MovieEntity> movie;

	public UserEntity() {
		super();
	}

	public UserEntity(int userid, String username, String phoneno, String useremailid, int age,
			String confirmationnumber, List<MovieEntity> movie) {
		super();
		this.userid = userid;
		this.username = username;
		this.phoneno = phoneno;
		this.useremailid = useremailid;
		this.age = age;
		this.confirmationnumber = confirmationnumber;
		//this.movie = movie;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getUseremailid() {
		return useremailid;
	}

	public void setUseremailid(String useremailid) {
		this.useremailid = useremailid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getConfirmationnumber() {
		return confirmationnumber;
	}

	public void setConfirmationnumber(String confirmationnumber) {
		this.confirmationnumber = confirmationnumber;
	}

//	public List<MovieEntity> getMovie() {
//		return movie;
//	}
//
//	public void setMovie(List<MovieEntity> movie) {
//		this.movie = movie;
//	}

	@Override
	public String toString() {
		return "UserEntity [userid=" + userid + ", username=" + username + ", phoneno=" + phoneno + ", useremailid="
				+ useremailid + ", age=" + age + ", confirmationnumber=" + confirmationnumber + ", movie=" + "movie"
				+ "]";
	}
	
	
	
}
