package com.capgemini.playerapp.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.playerapp.dao.PlayerRepo;
import com.capgemini.playerapp.dao.PlayerRepoJpaImpl;
import com.capgemini.playerapp.pojo.Game;
import com.capgemini.playerapp.pojo.Player;

@Service(value = "service")
public class PlayerServiceImpl implements PlayerService{
	
	@Autowired
	private PlayerRepo repo;

/*	@Autowired
	public PlayerServiceImpl(PlayerRepo repo) {
		this.repo = repo;
	}*/

	public String addPlayer(Player player) {
		repo.save(player);
			return "Succesfully Added";
	}

	public Player getPlayerByName(String name) {
		return repo.findPlayerByName(name);
	}

	public Player getPlayersByName(String gameName) {
		Game ref = repo.findByGameName(gameName);
		return repo.findPlayerByGameId(ref.getId());
		
	}


	
}
