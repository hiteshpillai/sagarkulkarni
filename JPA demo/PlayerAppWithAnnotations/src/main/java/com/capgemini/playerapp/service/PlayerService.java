package com.capgemini.playerapp.service;

import java.util.List;

import com.capgemini.playerapp.pojo.Player;

public interface PlayerService {

	public String addPlayer(Player player);
	public List<Player> getPlayerByName(String name);
	public List<Player> getPlayersByName(String gameName);
	
}
