package GameDemoProject.Concrete;

import GameDemoProject.Abstract.GamerCheckService;
import GameDemoProject.Entities.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public  void checkIfRealPerson(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" kiþisini sistem doðruladý");
	}

}
