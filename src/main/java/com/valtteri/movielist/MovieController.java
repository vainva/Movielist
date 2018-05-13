package com.valtteri.movielist;

import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MovieController {
	@Autowired
	@Id
	
	private MovieRepository repository;
	
	@RequestMapping(value="/movie", method = RequestMethod.GET)
	public @ResponseBody List <Movie> MovieListRest(){
		return (List<Movie>) repository.findAll();
	}
	@RequestMapping(value="/movie/{id}", method = RequestMethod.GET)
	public Optional<Movie> findById(@PathVariable(value = "id") Long id)	{
		return repository.findById(id);
	}
	@RequestMapping(value="/movielist")
	public String movieList(Model model){
		model.addAttribute("movies", repository.findAll());
		return "movielist";
	}
	
	@RequestMapping(value ="/delete/{id}", method = RequestMethod.GET)
	public String deleteMovie(@PathVariable("id") Long id){
		repository.deleteById(id);
		return "redirect:../movielist";
	}
	@RequestMapping(value ="/save", method = RequestMethod.POST)
	public String saveMovie(Movie movie){
		repository.save(movie);
		return "redirect:/movielist";
	}
	
	@RequestMapping(value ="/addmovie")
	public String addMovie(Model model){
		model.addAttribute("movie", new Movie());
		return "addmovie";
	}
	
}
