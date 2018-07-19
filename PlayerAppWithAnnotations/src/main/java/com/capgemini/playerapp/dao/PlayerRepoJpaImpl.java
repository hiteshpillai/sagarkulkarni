package com.capgemini.playerapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.playerapp.pojo.Game;
import com.capgemini.playerapp.pojo.Player;

@Repository(value="jparepo")
public class PlayerRepoJpaImpl implements PlayerRepo{

	private EntityManager em;
	
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	@Override
	public boolean savePlayer(Player player) {
		em.getTransaction().begin();
		em.persist(player);
		em.getTransaction().commit();
		return true;
	}

	@Override
	public List<Player> findByName(String name) {
		TypedQuery<Player> qry = em.createQuery("SELECT p FROM Player p WHERE p.name=:name", Player.class);
		qry.setParameter("name", name);
		return qry.getResultList();
	}

	@Override
	public List<Player> findByGameName(String game) {
		TypedQuery<Game> qry1 = em.createQuery("SELECT g FROM Game g WHERE g.name=:name", Game.class);
		qry1.setParameter("name", game);
		Game ref = qry1.getSingleResult();
		TypedQuery<Player> qry2 = em.createQuery("SELECT p FROM Player p WHERE p.game_id=:g_id", Player.class);
		qry2.setParameter("g_id", ref.getId());
		return qry2.getResultList();
	}

}
