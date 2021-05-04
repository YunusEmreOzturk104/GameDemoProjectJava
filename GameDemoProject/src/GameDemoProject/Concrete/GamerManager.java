package GameDemoProject.Concrete;

import GameDemoProject.Abstract.GamerService;
import GameDemoProject.Entities.Gamer;

public class GamerManager implements GamerService {
	public void addGamer(Gamer gamer) {
		System.out.println(gamer.getId()+" nolu "+gamer.getFirstName()+" "+gamer.getFirstName()+"  eklendi");
	}
	public void deleteGamer(Gamer gamer) {
		System.out.println(gamer.getId()+" nolu "+gamer.getFirstName()+" "+gamer.getFirstName()+"  silindi");
	}
	public void updateGamer(Gamer gamer) {
		System.out.println(gamer.getId()+" nolu "+gamer.getFirstName()+" "+gamer.getFirstName()+"  güncellendi");
	}
}
