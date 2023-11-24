package Exercise1;

import java.util.Comparator;

import ForExercises.BoardGame;

public class EditCode extends Code{

	public static void main(String[] args) {
		loopVersion();
		streamVersion();
	}
	private static void streamVersion() {
		BoardGame bestGame = BoardGame.GAMES
				.stream()
				.filter(g -> g.name.contains("a"))
				.max(Comparator.comparingDouble(g1 -> g1.rating)).get();
			System.out.println(bestGame.name);
	}
}
