package DomainTests;

import domain.Dog;
import org.junit.jupiter.api.Test;


public class DogTests {

    @Test
    public void getRace_DogExists_returnsTheRace(){
        Dog ia = new Dog("Barks","Malamut",true, 20,"Alaska");
        assert(ia.getRace().equals("Malamut"));

    }
    @Test
    public void getTrained_DogExists_isTrained(){
        Dog ia = new Dog("Hau", "Husky", false, 14,"Siberia");
        assert(ia.isTrained() == false);
    }
    @Test
    public void getMaxAge_DogExists_lowerThan20_True(){
        Dog ia = new Dog("Hau", "Husky", false, 14,"Siberia");
        assert (ia.maxAge() != 20);
    }
}
