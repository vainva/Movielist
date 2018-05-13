package com.valtteri.movielist;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {

	List<Movie> findByDirector(String director);
}
