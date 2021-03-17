package com.ies.jokenpo;

public class ConvertPlayIntoNumber {
	public Integer convert(GameOptions play) {
		if(play == GameOptions.ROCK) {
			return 0;
		} else if (play == GameOptions.PAPER) {
			return 3;
		} else {
			return 5;
		}
	}
}
