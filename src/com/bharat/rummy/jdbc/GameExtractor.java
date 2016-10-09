package com.bharat.rummy.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.bharat.rummy.domain.Game;

public class GameExtractor implements ResultSetExtractor<Game>{

	

	public Game extractData(ResultSet resultSet) throws SQLException,
			DataAccessException {
		
		Game game = new Game();
		
		game.setGameId(resultSet.getInt(0));
		game.setFirstPlayer(resultSet.getInt(1));
		game.setSecondPlayer(resultSet.getInt(2));
		game.setThirdPlayer(resultSet.getInt(3));
		game.setLastUpdateTime(resultSet.getString(4));
		game.setGameStartTime(resultSet.getString(5));
		game.setGameEndTime(resultSet.getString(6));
		game.setStatus(resultSet.getString(7));
		game.setResult(resultSet.getString(8));
		
		return game;
	}
}
