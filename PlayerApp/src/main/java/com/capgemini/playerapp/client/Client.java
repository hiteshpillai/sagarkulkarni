package com.capgemini.playerapp.client;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.playerapp.dao.PlayerRepo;
import com.capgemini.playerapp.dao.PlayerRepoImpl;
import com.capgemini.playerapp.pojo.Game;
import com.capgemini.playerapp.pojo.Player;
import com.capgemini.playerapp.service.PlayerService;
import com.capgemini.playerapp.service.PlayerServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		Map<String, Player> players = new HashMap<String, Player>();
		PlayerRepo repo = new PlayerRepoImpl();
		repo.setPlayers(players);
		PlayerService service = new PlayerServiceImpl(repo);
		
		Player p1 = new Player();
		Game g1 = new Game();
		p1.setName("Hitesh");
		g1.setName("PUBG");
		p1.setGame(g1);
		System.out.println(service.addPlayer(p1));
		
		Player p2 = new Player();
		Game g2 = new Game();
		p2.setName("Abhishek");
		g2.setName("DOTA");
		p2.setGame(g2);
		System.out.println(service.addPlayer(p2));
		
		Player p3 = new Player();
		Game g3 = new Game();
		p3.setName("BLC");
		g3.setName("Lawn Tennis");
		p3.setGame(g3);
		System.out.println(service.addPlayer(p3));
		
		Player ref = service.getPlayerByName("Hitesh");
		System.out.println(ref);
		
		List<Player> refList = service.getPlayersByName("DOTA");
		System.out.println(refList);
	}
	
}
