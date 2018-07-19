package com.capgemini.playerapp.service;

import java.util.List;

import com.capgemini.playerapp.pojo.Player;

public interface PlayerService {

	public String addPlayer(Player player);
	public Player getPlayerByName(String name);
	public Player getPlayersByName(String gameName);
	
}
