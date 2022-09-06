package com.gfttraining.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gfttraining.entities.EntityUserMovie;
import com.gfttraining.repositories.UserMovieRepository;

@Service
public class MyMoviesUserMovieService {
 @Autowired
 private UserMovieRepository userMovieRepository;
 
public Optional<EntityUserMovie> findOne(Integer userid,Integer movieid){
	return userMovieRepository.findByUseridandMovie(userid,movieid);
 }
 public Boolean findFavorites(Integer userid,Integer movieid) {
	EntityUserMovie b = userMovieRepository.findByUseridandMovie(userid,movieid).get();
	return b.isFavorite();
 }
 public Integer findPersonalRating(Integer userid,Integer movieid) {
	EntityUserMovie b = userMovieRepository.findByUseridandMovie(userid,movieid).get();
	return b.getPersonal_rating();
 }
 public String findNotes(Integer userid,Integer movieid) {
	EntityUserMovie b = userMovieRepository.findByUseridandMovie(userid,movieid).get();
	return b.getNotes();
 }
} 
