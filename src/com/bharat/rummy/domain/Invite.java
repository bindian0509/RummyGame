package com.bharat.rummy.domain;

public class Invite {
	
	private int inviteId;
	private int requestingPlayerId;
	private int receivingPlayerId;
	private int gameId;
	private String status;
	private String lastUpdateTime;
	private String startTime;
	
	public int getInviteId() {
		return inviteId;
	}
	public void setInviteId(int inviteId) {
		this.inviteId = inviteId;
	}
	public int getRequestingPlayerId() {
		return requestingPlayerId;
	}
	public void setRequestingPlayerId(int requestingPlayerId) {
		this.requestingPlayerId = requestingPlayerId;
	}
	public int getReceivingPlayerId() {
		return receivingPlayerId;
	}
	public void setReceivingPlayerId(int receivingPlayerId) {
		this.receivingPlayerId = receivingPlayerId;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	

}
