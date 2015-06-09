package com.bchollywood.movies;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bchollywood.movies.MovieListServiceApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MovieListServiceApplication.class)
@WebAppConfiguration
public class MovieListServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
