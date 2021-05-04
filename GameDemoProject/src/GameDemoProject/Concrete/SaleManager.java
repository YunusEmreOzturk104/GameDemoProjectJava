package GameDemoProject.Concrete;

import GameDemoProject.Abstract.SaleService;
import GameDemoProject.Entities.Campaign;
import GameDemoProject.Entities.Game;
import GameDemoProject.Entities.Gamer;
import GameDemoProject.Entities.Sale;

public class SaleManager implements SaleService {
	public void Gamers(Sale sale,Game game,Gamer gamer,Campaign campaign) {
		System.out.println(sale.getId()+" satýþ kodlu ürün "+gamer.getFirstName()+" kiþiye "+campaign.getName()+" ile "+game.getName()+" oyunundan "+" satýþý yapýlmýþtýr");
		
	}
	public void addSale(Sale sale) {
		System.out.println(sale.getId()+"eklendi");
	}
	public void deleteSale(Sale sale) {
		System.out.println(sale.getId()+"silindi");
	}
	public void updateSale(Sale sale) {
		System.out.println(sale.getId()+"güncellendi");
	}
	
}
