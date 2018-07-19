package com.capgemini.playerapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemini.playerapp.pojo.Game;
import com.capgemini.playerapp.pojo.Player;

public interface PlayerRepo extends JpaRepository<Player, Integer>{

	/*public boolean savePlayer(Player player);
	public List<Player> findByName(String name);
	public List<Player> findByGameName(String game);
	//public void setPlayers(Map<String, Player> players); 
*/
	@Query(value="SELECT p FROM Player p WHERE p.name=?1")//p.name=:name then use ...Name(@Param(value="name") String name)
	public Player findPlayerByName(String name);
	
	@Query(value="SELECT g FROM Game g WHERE g.name=?1")
	public Game findByGameName(String gameName);
	
	@Query(value="SELECT p FROM Player p WHERE p.game_id=?1")
	public Player findPlayerByGameId(int id);
}
