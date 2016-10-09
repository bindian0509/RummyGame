package com.bharat.rummy.dao;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bharat.rummy.domain.Player;
import com.bharat.rummy.jdbc.PlayerRowMapper;

public class PlayerDaoImpl implements PlayerDao {
	
	private static Logger _logger = Logger.getLogger(PlayerDaoImpl.class);
	@Autowired
	DataSource dataSource;
	public void insertData(Player player) {

		String sql = "INSERT INTO player "
				+ "(player_name, created_time, email, password, status, type) " + "VALUES "
				+ "(?,?,?,?,?,?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(sql,
				new Object[] { player.getPlayerName(), 
						System.currentTimeMillis(), 
						player.getPlayerEmail(), 
						player.getPlayerPassword(),
						"NEW", 
						player.getPlayerType() });

	}

	public List<Player> getPlayerList() {
		
		List<Player> playerList = new ArrayList<Player>();
		String sql = "select player_id, player_name, games_played, score, from_unixtime(created_time/1000), email, password, status, type  from player";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		playerList = jdbcTemplate.query(sql, new PlayerRowMapper());
		return playerList;
		
	}
	
	@Override
	public Player getPlayer(String id) {
		List<Player> playerList = new ArrayList<Player>();
		String sql = "select player_id, player_name, games_played, score, from_unixtime(created_time/1000), email, password, status, type  from player where player_id= " + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		playerList = jdbcTemplate.query(sql, new PlayerRowMapper());
		return playerList.get(0);
	}
	
	@Override
	public boolean loginPlayer(String email, String password) {
		List<Player> playerList = new ArrayList<Player>();
		String sql = "select * from player where email= '" + email+ "' and password='"+ password+"'";
		_logger.info(sql);
		System.out.println(sql);
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		playerList = jdbcTemplate.query(sql, new PlayerRowMapper());
		System.out.println(Arrays.deepToString(playerList.toArray()));
		if(playerList.size() == 0)
			return false;
		if(playerList.get(0).getPlayerId() > 0) {
			return true;
		} else {
			return false;
		}
	}
}
