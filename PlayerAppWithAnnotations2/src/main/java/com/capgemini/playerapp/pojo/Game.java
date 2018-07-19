package com.capgemini.playerapp.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value =  "GameClass")
@Entity
public class Game {

	@Id
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + "]";
	}

	
	
	
	
}
