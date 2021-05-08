package Concrete;

import Abstrac.CampaignService;
import Entities.Campaign;

public class CamaignManager implements CampaignService {
    @Override
    public void Add(Campaign campaign) {
        System.out.println("Campaign Added : " +campaign.getCampaignName());
    }

    @Override
    public void Delete(Campaign campaign) {
        System.out.println("Campaign Deleted : " +campaign.getCampaignName());
    }

    @Override
    public void Update(Campaign campaign) {
        System.out.println("Campaign Updated : " +campaign.getCampaignName());
    }
}
