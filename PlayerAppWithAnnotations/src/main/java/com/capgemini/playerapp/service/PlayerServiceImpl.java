package com.capgemini.playerapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.playerapp.dao.PlayerRepo;
import com.capgemini.playerapp.pojo.Player;

@Service(value = "service")
public class PlayerServiceImpl implements PlayerService{
	
	private PlayerRepo repo;

	@Autowired
	public PlayerServiceImpl(PlayerRepo repo) {
		this.repo = repo;
	}

	public String addPlayer(Player player) {
		if(repo.savePlayer(player)){
			return "Succesfully Added";
		}
		return "Unsuccessfull";
	}

	public Player getPlayerByName(String name) {
		return repo.findByName(name);
	}

	public List<Player> getPlayersByName(String gameName) {
		return repo.findByGameName(gameName);
	}

	
	
}
