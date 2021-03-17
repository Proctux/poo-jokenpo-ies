package com.ies.jokenpo;

public class Game {
	static Player playerOne;
	static Player playerTwo;
	
	public void addPlayer(Player player) {
		if (playerOne == null) {
			playerOne = player;
		} else {
			playerTwo = player;
		}
	}
}
