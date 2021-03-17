package com.ies.jokenpo;

public class Results {
	public Play play;
	
	public Results(Play play) {
		this.play = play;
	}

	public String getWinner() {
		ConvertPlayIntoNumber firstPlayValue = new ConvertPlayIntoNumber();
		ConvertPlayIntoNumber secondPlayValue = new ConvertPlayIntoNumber();
		
		Integer valueOne = firstPlayValue.convert(play.firstChoice);
		Integer valueTwo = secondPlayValue.convert(play.secondChoice);
		
		Calculator calculator = new Calculator(valueOne, valueTwo);
		var result = calculator.decreaseValue();
		
		if(result == 0) {
			return "We have a draw!";
		}
		
		var winner =  playerOneWinsWhen(result);
		
		if(winner == null) {
			winner = playerTwoWinsWhen(result);
		}
		
		return winner;
	}
	
	public String playerOneWinsWhen(Integer result) {
		if(result == -5) {
			return "Player one wins, rock smashes scissors";
		} else if (result == 2){
			return "Player one wins, scissors cut paper";
		} else if (result == 3) {
			return "Player one wins, paper covers rock";
		}
		return null;
	}
	
	public String playerTwoWinsWhen(Integer result) {
		if (result == -3) {
			return "Player two wins, paper covers rock";
		} else if (result == -2) {
			return "Player two wins, scissors cut paper";
		} else if (result == 5) {
			return "Player two wins, rock smashes scissors";
			
		}
		return null;
	}
}
