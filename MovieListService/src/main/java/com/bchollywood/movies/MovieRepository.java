package com.bchollywood.movies;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
	Collection<Movie> findByAccountUsername(String username);
	
}
