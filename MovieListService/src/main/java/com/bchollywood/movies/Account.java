package com.bchollywood.movies;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Account {
	
	@OneToMany(mappedBy = "account")
	private Set<Movie> movies = new HashSet<>();
	
	@Id
	@GeneratedValue
	private Long id;
	
	public Set<Movie> getMovies() {
		return movies;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getUsername() {
		return username;
	}
	
	@JsonIgnore
	public String password;
	public String username;
	
	public Account(String name, String password) {
		this.username = name;
		this.password = password;
	}
	
	Account() {}

}
