package com.bharat.rummy.services;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


import com.bharat.rummy.dao.GameDao;
import com.bharat.rummy.domain.Game;


public class GameServiceImpl implements GameService{

	@Autowired
	GameDao gamedao;
	
	
	@Override
	public void newGame (String playerId) {
		gamedao.newGame(playerId);
	}
	
	@Override
	public void startGame(Game game) {
		gamedao.startGame(game);
	}
	
	@Override
	public List<Game> getGamesFromPlayerId (String playerId) {
		return gamedao.getGamesFromPlayerId(playerId);
	}
}
