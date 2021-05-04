package GameDemoProject.Abstract;
import GameDemoProject.Entities.Game;

public interface GameService {
	public void addGame(Game game);
	public void deleteGame(Game game);
	public void updateGame(Game game);
}
