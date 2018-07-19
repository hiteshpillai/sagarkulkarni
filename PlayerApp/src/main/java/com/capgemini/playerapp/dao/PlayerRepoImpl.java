package com.capgemini.playerapp.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.capgemini.playerapp.pojo.Player;

public class PlayerRepoImpl implements PlayerRepo{
	
	private Map<String, Player> players;

	public PlayerRepoImpl() {
	}
	
	public void setPlayers(Map<String, Player> players) {
		this.players = players;
	}

	public boolean savePlayer(Player player) {
		try {
			players.put(player.getName(), player);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	public Player findByName(String name) {
				return players.get(name);
			}

	public List<Player> findByGameName(String game) {
		Iterator it = players.entrySet().iterator();
		List<Player> playerList = new ArrayList();
		while(it.hasNext()) {
			Map.Entry<String, Player> ref = (Entry<String, Player>) it.next();
			Player temp = ref.getValue();
			if(temp.getGame().getName().equals(game)) {
				playerList.add(temp);
			}
		}
		return playerList;
	}
}
