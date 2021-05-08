package Concrete;

import Abstrac.SellService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SellService {
    @Override
    public void Sell(Gamer gamer, Game game) {

        System.out.println("user : "+gamer.getFirstName()+ " " +gamer.getLastName());
        System.out.println("game : " + game.getGameName());
        System.out.println("price : " +game.getPrice());
        System.out.println("Sold!");


    }

    @Override
    public void sellWithCampaign(Game game, Gamer gamer, Campaign campaign) {
        System.out.println("user : "+gamer.getFirstName()+ " " +gamer.getLastName());
        System.out.println("game : " + game.getGameName());
        System.out.println("price With Campaign : " + (game.getPrice()-campaign.getDiscountAmount()));
        System.out.println("Used :" +campaign.getCampaignName());


    }
}
