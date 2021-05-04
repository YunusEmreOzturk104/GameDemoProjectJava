package GameDemoProject.Abstract;

import GameDemoProject.Entities.Gamer;

public interface GamerService {
	public void addGamer(Gamer gamer);
	public void deleteGamer(Gamer gamer);
	public void updateGamer(Gamer gamer);
}
