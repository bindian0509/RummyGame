package com.bharat.rummy.dao;

import java.util.List;

import com.bharat.rummy.domain.Player;

public interface PlayerDao {
	public void insertData(Player player);

	public List<Player> getPlayerList();

//	public void updateData(Player player);
//
//	public void deleteData(String id);

	public Player getPlayer(String id);
	
	public int loginPlayer(String email, String password);
	
	public List<Player> getPlayerRankings();
	
	public boolean validateLogin(Player player);
}
