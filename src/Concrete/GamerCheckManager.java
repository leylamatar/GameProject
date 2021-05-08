package Concrete;

import Abstrac.GamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements GamerCheckService {
    @Override
    public boolean CheckIfRealPerson(Gamer gamer) {
        return true;
    }
}
