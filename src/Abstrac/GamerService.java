package Abstrac;

import Entities.Gamer;

public interface GamerService {
    void Add(Gamer gamer) throws Exception;
    void Delete(Gamer gamer);
    void Update(Gamer gamer);
}
