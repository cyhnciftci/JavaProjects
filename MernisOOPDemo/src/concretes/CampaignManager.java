package concretes;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println("Kampanya eklendi: "+ campaign.getCampaignName());
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println("Kampanya güncellendi: "+ campaign.getCampaignName());
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println("Kampanya silindi: "+ campaign.getCampaignName());
		
	}

}
