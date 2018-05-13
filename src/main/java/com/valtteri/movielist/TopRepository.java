package com.valtteri.movielist;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

	@Repository
	public interface TopRepository extends CrudRepository<Topmovie, Long> {

		List<Topmovie> findByDirector(String director);
	}

