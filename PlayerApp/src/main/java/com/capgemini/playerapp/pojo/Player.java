package com.capgemini.playerapp.pojo;

public class Player {

	private String name;
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
	@Override
	public String toString() {
		return "Player [name=" + name + ", game=" + game + "]";
	}
	
	
	
}
