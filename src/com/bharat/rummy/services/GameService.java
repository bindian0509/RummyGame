package com.bharat.rummy.services;

import com.bharat.rummy.domain.Game;
import java.util.List;


public interface GameService {
	
	public void newGame (String playerId);
	
	public void startGame (Game game);
	
	public List<Game> getGamesFromPlayerId (String playerId);
	
	

}
