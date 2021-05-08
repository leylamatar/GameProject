package Concrete;

import Abstrac.GamerCheckService;
import Abstrac.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {

    GamerCheckService gamerCheckService;

    public GamerManager(GamerCheckService gamerCheckService){
        this.gamerCheckService = gamerCheckService;
    }

    @Override
    public void Add(Gamer gamer) throws Exception {
        if(gamerCheckService.CheckIfRealPerson(gamer)){
            System.out.println("Gamer Added : " +gamer.getFirstName());
        }else {
            System.out.println("not a valid person");
        }
    }

    @Override
    public void Delete(Gamer gamer) {

            System.out.println("Gamer Deleted : " +gamer.getFirstName());
    }

    @Override
    public void Update(Gamer gamer) {
        System.out.println("Gamer Updated : " +gamer.getFirstName());

    }
}
