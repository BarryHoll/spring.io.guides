package com.bchollywood.movies;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long>{
	
	Collection<Account> findByUsername(String username);
	
}
