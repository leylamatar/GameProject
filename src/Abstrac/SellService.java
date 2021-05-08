package Abstrac;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SellService {
    void Sell(Gamer gamer , Game game);
    void sellWithCampaign(Game game, Gamer gamer, Campaign campaign);
}
