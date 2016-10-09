package com.bharat.rummy.jdbc;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bharat.rummy.domain.Player;


public class PlayerRowMapper implements RowMapper<Player> {
	@Override
	public Player mapRow(ResultSet resultSet, int line) throws SQLException {
		PlayerExtractor playerExtractor = new PlayerExtractor();
		return playerExtractor.extractData(resultSet);
	}

}
