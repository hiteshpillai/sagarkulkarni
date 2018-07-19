package com.capgemini.playerapp.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value =  "GameClass")
@Scope(value="Singleton")
public class Game {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Game [name=" + name + "]";
	}
	
	
	
}
