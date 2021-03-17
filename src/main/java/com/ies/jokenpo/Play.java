package com.ies.jokenpo;

public class Play {
	public GameOptions firstChoice;
	public Player firstPlayer;
	public GameOptions secondChoice;
	public Player secondPlayer;
	
	public void addPlay(GameOptions play, Player player) {
		if(isFirst(player)) {
			firstChoice = play;
			firstPlayer = player;
		} else {
			secondChoice = play;
			secondPlayer = player;
		}
	}

	private boolean isFirst(Player player) {
		return player == Game.playerOne;
	}

}
