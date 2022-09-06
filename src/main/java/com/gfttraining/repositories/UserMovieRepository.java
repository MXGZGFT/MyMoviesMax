package com.gfttraining.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gfttraining.entities.EntityUserMovie;

@Repository
public interface UserMovieRepository extends JpaRepository<EntityUserMovie, Integer> {
	Optional<EntityUserMovie> findByUseridandMovie(Integer userid,Integer movieid);
	Optional<EntityUserMovie> findFavorite(Integer userid,Integer movieid);
}
