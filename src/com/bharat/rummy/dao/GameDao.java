package com.bharat.rummy.dao;

import com.bharat.rummy.domain.Game;

public interface GameDao {

	
	public void create (Game game);
	
	public Game getGame (String gameId);
		
	
}
