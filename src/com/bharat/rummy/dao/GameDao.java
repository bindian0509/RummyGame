package com.bharat.rummy.dao;

import java.util.List;

import com.bharat.rummy.domain.Game;

public interface GameDao {

	
	public void newGame (String playerId);
	
	public void startGame (Game game);
	
	public List<Game> getGamesFromPlayerId (String playerId);
		
	
}
