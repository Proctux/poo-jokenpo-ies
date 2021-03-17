package com.ies.jokenpo;

public class Game {
	public Player playerOne;
	public Player playerTwo;
	
	public void addPlayer(Player player) {
		if (playerOne == null) {
			playerOne = player;
		} else {
			playerTwo = player;
		}
	}
	
	public Player getPlayerOne() {
		return playerOne;
	}
}
