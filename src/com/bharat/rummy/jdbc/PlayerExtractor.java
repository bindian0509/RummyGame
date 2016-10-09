package com.bharat.rummy.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;


import com.bharat.rummy.domain.Player;

public class PlayerExtractor  implements ResultSetExtractor<Player>{

	

	public Player extractData(ResultSet resultSet) throws SQLException,
			DataAccessException {
		
		Player player = new Player();
		
		player.setPlayerId(resultSet.getInt(1));
		player.setPlayerName(resultSet.getString(2));
		player.setGamesPlayed(resultSet.getInt(3));
		player.setScore(resultSet.getInt(4));
		player.setCreationTime(resultSet.getString(5));
		player.setPlayerEmail(resultSet.getString(6));
		player.setPlayerPassword(resultSet.getString(7));
		player.setStatus(resultSet.getString(8));
		player.setPlayerType(resultSet.getString(9));
		
		return player;
	}
}
