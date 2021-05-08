package project;

import Adapter.MernisServiceAdapter;
import Concrete.GameManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Campaign campaign = new Campaign(432,"new year sells!",50);


        Gamer gamer = new Gamer(123,"Leyla","Matar","99999",
                LocalDate.of(2001,10,25));

        Game game = new Game (545,"Mobile Legend",119.99,"Aksiyon");
        

        GameManager gameManager = new GameManager(new MernisServiceAdapter());
        gameManager.Add(game);



        SaleManager saleManager = new SaleManager();
        saleManager.Sell(gamer,game);
        saleManager.sellWithCampaign(game,gamer,campaign);
    }
}
