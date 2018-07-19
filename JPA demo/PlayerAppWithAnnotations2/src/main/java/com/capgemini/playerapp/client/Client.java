package com.capgemini.playerapp.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.capgemini.playerapp.dao.PlayerRepo;
import com.capgemini.playerapp.dao.PlayerRepoJpaImpl;
import com.capgemini.playerapp.pojo.Game;
import com.capgemini.playerapp.pojo.Player;
import com.capgemini.playerapp.service.PlayerService;
import com.capgemini.playerapp.service.PlayerServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("beanConfig.xml");
		
		PlayerServiceImpl service = ctx.getBean("service", PlayerServiceImpl.class);
		
		
		
		Game g1 = new Game();
		g1.setName("Kabaddi");
		g1.setId(1);
		
		Player p1 = new Player();
		p1.setName("Lalu");
		p1.setId(1);
		p1.setGame(g1);
		
		service.addPlayer(p1);
		
		Game g2 = new Game();
		g2.setName("PUBG");
		g2.setId(2);
		
		Player p2 = new Player();
		p2.setName("Hitesh");
		p2.setId(2);
		p2.setGame(g2);
		service.addPlayer(p2);
		
		
		System.out.println(service.getPlayerByName("Hitesh"));
		
		
		/*Player ref = service.getPlayerByName("Hitesh");
		System.out.println(ref);*/
		
		Player ref = service.getPlayersByName("DOTA");
		System.out.println(ref);
	}
	
}
