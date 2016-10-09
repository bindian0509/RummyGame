package com.bharat.rummy.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bharat.rummy.domain.Game;
import com.bharat.rummy.jdbc.GameRowMapper;

public class GameDaoImpl implements GameDao {

	@Autowired
	DataSource dataSource;

	public void create(Game game) {

		String sql = "INSERT INTO game " + "(player_id_1, player_id_2, player_id_3, status, game_result) " + "VALUES "
				+ "(?,?,?,?,?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(sql, new Object[] { game.getFirstPlayer(), game.getSecondPlayer(), game.getThirdPlayer(),
				game.getStatus(), game.getResult() });

	}

	@Override
	public Game getGame(String gameId) {
		List<Game> gameList = new ArrayList<Game>();
		String sql = "select * from game where game_id= " + gameId;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		gameList = jdbcTemplate.query(sql, new GameRowMapper());
		return gameList.get(0);
	}

}
