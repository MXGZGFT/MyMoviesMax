package com.gfttraining.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gfttraining.entities.EntityCastAndCrew;
import com.gfttraining.entities.EntityGenre;
import com.gfttraining.entities.EntityImages;
import com.gfttraining.entities.EntityMovie;
import com.gfttraining.services.MyMoviesService;
import com.gfttraining.entities.EntityKeywords;

@RestController
public class MyMovieController {
	
	@Autowired
	MyMoviesService myMoviesService;
	
	@GetMapping("api/genre/movie/list")
		public List<EntityGenre> returnGenres() throws IOException{
			return myMoviesService.findAllGenreMovieList();
		}
	
	@GetMapping("api/movie/popular")
	public List<EntityMovie> returnPopularMovies() throws IOException{
		return myMoviesService.findPopularMovies();
	}
	
	@GetMapping("api/movie/top_rated")
	public List<EntityMovie> returnTopRatedMovies() throws IOException{
		return myMoviesService.findTopRatedMovies();
	}
	@GetMapping("api/movie/{movie_id}")
	public EntityMovie returnMovie(@PathVariable Integer movie_id) throws IOException{
		return myMoviesService.findMovie(movie_id);
	}
	@GetMapping("api/movie/{movie_id}/credits")
	public List<EntityCastAndCrew> returnMovieCredits(@PathVariable Integer movie_id) throws IOException{
		return myMoviesService.findMovieCredits(movie_id);
	}
	@GetMapping("api/movie/{movie_id}/images")
	public List<EntityImages> returnMovieImages(@PathVariable Integer movie_id) throws IOException{
		return myMoviesService.findMovieImages(movie_id);
	}
	@GetMapping("api/movie/{movie_id}/keywords")
	public List<EntityKeywords> returnKeywords(@PathVariable Integer movie_id) throws IOException{
		return myMoviesService.findMovieKeywords(movie_id);
	}
	@GetMapping("api/movie/{movie_id}/recommendations")
	public List<EntityMovie> returnRecommendations(@PathVariable Integer movie_id) throws IOException{
		return myMoviesService.findMovieRecommendations(movie_id);
	}
	@GetMapping("api/movie/{movie_id}/similar")
	public List<EntityMovie> returnSimilar(@PathVariable Integer movie_id) throws IOException{
		return myMoviesService.findMovieSimilar(movie_id);
	}
}
