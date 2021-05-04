package GameDemoProject.Concrete;

import GameDemoProject.Abstract.GameService;
import GameDemoProject.Entities.Game;

public class GameManager implements GameService {
	public void addGame(Game game) {
		System.out.println(game.getName()+"eklendi");
	}
	public void deleteGame(Game game) {
		System.out.println(game.getName()+"eklendi");
	}
	public void updateGame(Game game) {
		System.out.println(game.getName()+"eklendi");
	}
}

