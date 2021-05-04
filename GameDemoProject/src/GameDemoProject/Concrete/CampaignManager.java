package GameDemoProject.Concrete;

import GameDemoProject.Abstract.CampaignService;
import GameDemoProject.Entities.Campaign;

public class CampaignManager implements CampaignService {
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getName()+" eklendi");
	}
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getId()+" "+campaign.getName()+" silindi");
	}
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getName()+" güncellendi");
	}
}
