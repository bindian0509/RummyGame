package com.bharat.rummy.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bharat.rummy.domain.Game;
import com.bharat.rummy.jdbc.GameRowMapper;
import com.bharat.rummy.jdbc.PlayerRowMapper;

public class GameDaoImpl implements GameDao {

	@Autowired
	DataSource dataSource;

	@Override
	public void newGame(String playerId) {

		String sql = "INSERT INTO game " + "(player_id_1, status, game_result) " + "VALUES "
				+ "(?,?,?,?,?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(sql, new Object[] { playerId, "NEW", "FRESH" });

	}
	
	@Override
	public void startGame (Game game) {
		
	}
	
	@Override
	public List<Game> getGamesFromPlayerId (String playerId) {
		List<Game> gameList = new ArrayList<Game>();
		String sql = "select * from game where player_id_1="+playerId+" OR player_id_2="+playerId+" OR player_id_3="+playerId;
		System.out.println(sql);
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		gameList = jdbcTemplate.query(sql, new GameRowMapper());
		return gameList;
	}

	
	/*
	@Override
	public Game getGame(String gameId) {
		List<Game> gameList = new ArrayList<Game>();
		String sql = "select * from game where game_id= " + gameId;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		gameList = jdbcTemplate.query(sql, new GameRowMapper());
		return gameList.get(0);
	}*/

}
