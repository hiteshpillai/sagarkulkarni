package com.capgemini.playerapp.dao;

import java.util.List;
import java.util.Map;

import com.capgemini.playerapp.pojo.Player;

public interface PlayerRepo {

	public boolean savePlayer(Player player);
	public Player findByName(String name);
	public List<Player> findByGameName(String game);
	public void setPlayers(Map<String, Player> players); 
}
