package com.bharat.rummy.domain;


public class Game {
	
	private int gameId; 
	private int firstPlayer;
	private int secondPlayer;
	private int thirdPlayer;
	private String lastUpdateTime; 
	private String gameStartTime;
	private String gameEndTime;
	private String status;
	private String result;
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public int getFirstPlayer() {
		return firstPlayer;
	}
	public void setFirstPlayer(int firstPlayer) {
		this.firstPlayer = firstPlayer;
	}
	public int getSecondPlayer() {
		return secondPlayer;
	}
	public void setSecondPlayer(int secondPlayer) {
		this.secondPlayer = secondPlayer;
	}
	public int getThirdPlayer() {
		return thirdPlayer;
	}
	public void setThirdPlayer(int thirdPlayer) {
		this.thirdPlayer = thirdPlayer;
	}
	public String getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public String getGameStartTime() {
		return gameStartTime;
	}
	public void setGameStartTime(String gameStartTime) {
		this.gameStartTime = gameStartTime;
	}
	public String getGameEndTime() {
		return gameEndTime;
	}
	public void setGameEndTime(String gameEndTime) {
		this.gameEndTime = gameEndTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	

}
