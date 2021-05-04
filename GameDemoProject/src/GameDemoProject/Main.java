package GameDemoProject;
import GameDemoProject.Concrete.CampaignManager;
import GameDemoProject.Concrete.GameManager;
import GameDemoProject.Concrete.GamerCheckManager;
import GameDemoProject.Concrete.GamerManager;
import GameDemoProject.Concrete.SaleManager;
import GameDemoProject.Entities.Campaign;
import GameDemoProject.Entities.Game;
import GameDemoProject.Entities.Gamer;
import GameDemoProject.Entities.Sale;

public class Main {
	public static void main(String[] args) {
		Gamer gamer1 = new Gamer(1, "Yunus", "Öztürk", "Türkiye","3456327743","01.08.2002");
		Gamer gamer2 = new Gamer(2, "Zehra", "Özdemir", "Türkiye","232737474","16.01.2003");
		Gamer[] gamers = {gamer1,gamer2};
		for (Gamer gamer : gamers) {
			System.out.println(gamer.getId()+" "+gamer.getFirstName()+" "+gamer.getLastName()+" "+gamer.getCountry()+" "+gamer.getTcNo()+" "+gamer.getBirthDate());
		}
		GamerManager gamerManager=new GamerManager();
		gamerManager.addGamer(gamer2);
		gamerManager.updateGamer(gamer1);
		Campaign campaign1 = new Campaign(1, "Yaz kampanyasý", "mukemmel bir indirim geliyor", 50);
		Campaign campaign2 = new Campaign(2, "kýþ kampanyasý", "Soðuk hava sýcak indirim", 40);
		CampaignManager campaignManager = new CampaignManager();
		Campaign[] campaigns = {campaign1,campaign2};
		for (Campaign campaign : campaigns) {
			System.out.println(campaign.getId()+" "+campaign.getName()+" "+campaign.getDetail()+" %"+campaign.getDiscount()+"indirim");
		}
		campaignManager.addCampaign(campaign1);
		campaignManager.addCampaign(campaign2);
	
	   Game game1 = new Game("Pes");
	   Game game2 = new Game("Fifa");
	   Game[] games = {game1,game2};
	   for (Game game : games) {
		System.out.println(game.getName());
	}        
	   GameManager gameManager = new GameManager();
	   gameManager.addGame(game2);
	   gameManager.deleteGame(game1);
	   Sale sale = new Sale(1,"23324");
	   SaleManager saleManager = new SaleManager();
	   saleManager.addSale(sale);
	   saleManager.Gamers(sale, game2, gamer2, campaign2);
	   GamerCheckManager gamerCheckManager = new GamerCheckManager();
	   gamerCheckManager.checkIfRealPerson(gamer2);
	   gamerCheckManager.checkIfRealPerson(gamer1);
    }	
}
