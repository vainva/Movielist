package com.valtteri.movielist;

import java.util.List;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TopController {
	@Autowired
	@Id
	
	
	private TopRepository toprepository;
	
	@RequestMapping(value="/topmovie", method = RequestMethod.GET)
	public @ResponseBody List <Topmovie> TopMovieListRest(){
		return (List<Topmovie>) toprepository.findAll();
	}
	
	@RequestMapping(value ="/top10movies")
	public String top10List(Model model){
		model.addAttribute("topmovies", toprepository.findAll());
		return"top10movies";
	}
	
	
	
	
}
