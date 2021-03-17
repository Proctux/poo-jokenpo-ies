package com.ies.jokenpo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JokenpoTest {
	
	@Test
	public void rockSmashesScissors() throws Exception {
		Player playerLuiz = new Player("Luiz");
		Player playerMarcos = new Player("Marcos");
		Game game = new Game(playerLuiz, playerMarcos); // Poderia colocar os jogadores aqui.
		Play play = new Play(game);
		
		play.addPlay(GameOptions.ROCK, playerMarcos);
		play.addPlay(GameOptions.SCISSORS, playerLuiz);
		Results result = new Results(play);
		
		assertEquals("Player two wins, rock smashes scissors", result.getWinner());
	}
	
	@Test
	public void scissorsCutPaper() throws Exception {
		Player playerLuiz = new Player("Luiz");
		Player playerMarcos = new Player("Marcos");
		Game game = new Game(playerLuiz, playerMarcos);
		Play play = new Play(game);
		
		play.addPlay(GameOptions.PAPER, playerMarcos);
		play.addPlay(GameOptions.SCISSORS, playerLuiz);
		Results result = new Results(play);
		
		assertEquals("Player one wins, scissors cut paper", result.getWinner());
	}
	
	@Test
	public void paperCoversRock() throws Exception {
		Player playerLuiz = new Player("Luiz");
		Player playerMarcos = new Player("Marcos");
		Game game = new Game(playerLuiz, playerMarcos);
		Play play = new Play(game);
		
		play.addPlay(GameOptions.PAPER, playerMarcos);
		play.addPlay(GameOptions.ROCK, playerLuiz);
		Results result = new Results(play);
		
		assertEquals("Player two wins, paper covers rock", result.getWinner());
	}
	
	@Test
	public void drawGame() throws Exception {
		Player playerLuiz = new Player("Luiz");
		Player playerMarcos = new Player("Marcos");
		Game game = new Game(playerLuiz, playerMarcos);
		Play play = new Play(game);
		
		play.addPlay(GameOptions.PAPER, playerMarcos);
		play.addPlay(GameOptions.PAPER, playerLuiz);
		Results result = new Results(play);
		
		assertEquals("We have a draw!", result.getWinner());
	}
}
