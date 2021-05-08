package Concrete;

import Abstrac.GameService;
import Adapter.MernisServiceAdapter;
import Entities.Game;

public class GameManager implements GameService {
    public GameManager(MernisServiceAdapter mernisServiceAdapter) {

    }

    @Override
    public void Add(Game game) {
        System.out.println("Game Added : " +game.getGameName());
    }

    @Override
    public void Delete(Game game) {
        System.out.println("Game Deleted : " +game.getGameName());
    }

    @Override
    public void Update(Game game) {
        System.out.println("Game Updated : " +game.getGameName());
    }
}
