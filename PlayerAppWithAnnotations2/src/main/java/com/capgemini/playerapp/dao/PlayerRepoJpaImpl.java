package com.capgemini.playerapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.playerapp.pojo.Game;
import com.capgemini.playerapp.pojo.Player;

//@Repository(value="jparepo")
public class PlayerRepoJpaImpl{

//	@PersistenceContext
	private EntityManager em;
	
	public PlayerRepoJpaImpl() {
	}
	
	
//	@Transactional
	public boolean savePlayer(Player player) {
		em.merge(player);
		return true;
	}

	public List<Player> findByName(String name) {
		TypedQuery<Player> qry = em.createQuery("SELECT p FROM Player p WHERE p.name=:name", Player.class);
		qry.setParameter("name", name);
		return qry.getResultList();
	}

	public List<Player> findByGameName(String game) {
		TypedQuery<Game> qry1 = em.createQuery("SELECT g FROM Game g WHERE g.name=:name", Game.class);
		qry1.setParameter("name", game);
		Game ref = qry1.getSingleResult();
		TypedQuery<Player> qry2 = em.createQuery("SELECT p FROM Player p WHERE p.game_id=:g_id", Player.class);
		qry2.setParameter("g_id", ref.getId());
		return qry2.getResultList();
	}

}
