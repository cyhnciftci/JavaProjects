package concretes;

import abstracts.SaleService;
import entities.Campaign;
import entities.Games;
import entities.User;

public class SaleManager implements SaleService {

	@Override
	public void sellGame(User user, Campaign campaign, Games games) {
		System.out.println("Kullan�c� "+user.getFirstName()+games.getGameName()+"adli oyun aliyor");
		System.out.println("Uygulanan kampanya : "+ campaign.getCampaignName());
		System.out.println("Kampanya �ncesi fiyat : " + games.getUnitPrice());
		System.out.println("�ndirimli fiyat : "+ (games.getUnitPrice()-(games.getUnitPrice()*campaign.getDiscount())));
		System.out.println("Kullan�c� "+ user.getFirstName()+games.getGameName()+"oyununu aldi.");
		
	}

}
