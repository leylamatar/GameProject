package Adapter;

import Abstrac.GamerCheckService;
import Entities.Gamer;
import MernisService.AFHKPSPublicSoap;

import java.util.Locale;

public class MernisServiceAdapter implements GamerCheckService {

    @Override
    public boolean CheckIfRealPerson(Gamer gamer) throws Exception {
        AFHKPSPublicSoap user = new AFHKPSPublicSoap();

        return user.TCKimlikNoDogrula(Long.valueOf(gamer.getNationaltityid()),
                gamer.getFirstName().toUpperCase(),gamer.getLastName().toUpperCase(),
                gamer.getDateOfBirth().getYear());
    }
}
