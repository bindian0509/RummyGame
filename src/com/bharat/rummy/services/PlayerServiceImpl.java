package com.bharat.rummy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bharat.rummy.dao.PlayerDao;
import com.bharat.rummy.domain.Player;

public class PlayerServiceImpl implements PlayerService {
	@Autowired
	PlayerDao playerdao;

	@Override
	public void insertData(Player user) {
		playerdao.insertData(user);
	}

	@Override
	public List<Player> getPlayerList() {
		return playerdao.getPlayerList();
	}

	@Override
	public Player getPlayer(String id) {
		return playerdao.getPlayer(id);
	}

	@Override
	public boolean loginPlayer(String email, String password) {
		return playerdao.loginPlayer(email, password);
	}

}
