package com.ies.jokenpo;

public class Game {
	public Player playerOne;
	public Player playerTwo;
	
	public Game(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}
	
	public Player getPlayerOne() {
		return playerOne;
	}
}
