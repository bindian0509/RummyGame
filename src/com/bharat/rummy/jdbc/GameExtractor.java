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
		
		game.setGameId(resultSet.getInt(1));
		game.setFirstPlayer(resultSet.getInt(2));
		game.setSecondPlayer(resultSet.getInt(3));
		game.setThirdPlayer(resultSet.getInt(4));
		game.setLastUpdateTime(resultSet.getString(5));
		game.setGameStartTime(resultSet.getString(6));
		game.setGameEndTime(resultSet.getString(7));
		game.setStatus(resultSet.getString(8));
		game.setResult(resultSet.getString(9));
		
		return game;
	}
}
