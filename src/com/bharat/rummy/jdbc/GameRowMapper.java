package com.bharat.rummy.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bharat.rummy.domain.Game;


public class GameRowMapper  implements RowMapper<Game> {
	@Override
	public Game mapRow(ResultSet resultSet, int line) throws SQLException {
		GameExtractor gameExtractor = new GameExtractor();
		return gameExtractor.extractData(resultSet);
	}

}
