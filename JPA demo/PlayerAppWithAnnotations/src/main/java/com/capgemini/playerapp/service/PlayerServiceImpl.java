package com.capgemini.playerapp.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Service;

import com.capgemini.playerapp.dao.PlayerRepo;
import com.capgemini.playerapp.dao.PlayerRepoJpaImpl;
import com.capgemini.playerapp.pojo.Player;

@Service(value = "service")
public class PlayerServiceImpl implements PlayerService{
	
	private PlayerRepoJpaImpl repo;

/*	@Autowired
	public PlayerServiceImpl(PlayerRepo repo) {
		this.repo = repo;
	}*/
	
	public void setRepo(PlayerRepoJpaImpl jparepo) {
		this.repo = jparepo;
	}

	public String addPlayer(Player player) {
		if(repo.savePlayer(player)){
			return "Succesfully Added";
		}
		return "Unsuccessfull";
	}

	public List<Player> getPlayerByName(String name) {
		return repo.findByName(name);
	}

	public List<Player> getPlayersByName(String gameName) {
		return repo.findByGameName(gameName);
	}


	
}
