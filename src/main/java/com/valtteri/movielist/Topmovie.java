package com.valtteri.movielist;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Topmovie {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String director;
	private String year;
	private String money;
	
	public Topmovie(){}
	
	public Topmovie(String name, String director, String year, String money){
		super();
		this.name = name;
		this.director = director;
		this.year = year;
		this.money = money;
		
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
	public String getMoney(){
		return money;
	}
	public void setMoney(String money){
		this.money= money;
	}
	
	@Override
	public String toString(){
		return 
	"Top [" + "id=" + id + 
	", name=" + name + ", director=" +
	director + ", year=" + year  + ", money=" + money + "]";
	}
	
	
	
}

	

