package com.bchollywood.movies;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Movie {
	
	@JsonIgnore
	@ManyToOne
	private Account account;
	
	@Id
	@GeneratedValue
	private Long id;

	public String title;
	public String director;
	public String year;
	public int runningTime;
	public boolean watched;
	
	Movie() {}
	
	public Movie(Account account, String title, String director, 
			String year, int runningTime, boolean watched) {
		this.account = account;
		this.title = title;
		this.director = director;
		this.year = year;
		this.runningTime = runningTime;
		this.watched = false;
	}
	
	public Account getAccount() {
		return account;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDirector() {
		return director;
	}

	public String getYear() {
		return year;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public boolean isWatched() {
		return watched;
	}

}
