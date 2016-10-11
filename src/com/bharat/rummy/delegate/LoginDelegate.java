package com.bharat.rummy.delegate;

import java.sql.SQLException;

import com.bharat.rummy.services.PlayerService;

public class LoginDelegate {

	private PlayerService playerService;

	public PlayerService getPlayerService() {
		return this.playerService;
	}

	public void setUserService(PlayerService playerService) {
		this.playerService = playerService;
	}

	public int isValidUser(String username, String password) {
		return playerService.loginPlayer(username, password);
	}
}
