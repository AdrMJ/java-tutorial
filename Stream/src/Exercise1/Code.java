package Exercise1;

import ForExercises.BoardGame;

public class Code {
	protected static void loopVersion() {
		double highestRanking = 0;
		BoardGame bestGame = null;
	    	for (BoardGame game : BoardGame.GAMES) {
	    		if (game.name.contains("a")) {
	    			if (game.rating > highestRanking) {
	    				highestRanking = game.rating;
	    				bestGame = game;
	                }
	            }
	        }
	        System.out.println(bestGame.name);
	    }
}