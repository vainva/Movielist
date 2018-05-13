package com.valtteri.movielist;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Movie {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String director;
	private String year;
	
	public Movie(){}
	
	public Movie(String name, String director, String year){
		super();
		this.name = name;
		this.director = director;
		this.year = year;
		
		
	}
	
	public Long getId(){
		return id;
	}
	public void setId(Long id){
		this.id = id;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getDirector(){
		return director;
	}
	public void setDirector(String director){
		this.director = director;
	}
	
	public String getYear(){
		return year;
	}
	public void setYear(String year){
		this.year= year;
	}
	
	@Override
	public String toString(){
		return 
	"Movie [" + "id=" + id + 
	", name=" + name + ", director=" +
	director + ", year=" + year  +"]";
	}
	
	
	
}
