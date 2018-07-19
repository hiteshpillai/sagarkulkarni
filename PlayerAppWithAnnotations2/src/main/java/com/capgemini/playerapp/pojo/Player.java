package com.capgemini.playerapp.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "PlayerClass")
@Entity
public class Player {

	@Id
	private int id;
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Game game;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", game=" + game + "]";
	}
	
	
	
	
}
