package DomainTests;

import domain.Dog;
import org.junit.jupiter.api.Test;


public class DogTests {

    @Test
    public void getRace_DogExists_returnsTheRace(){
        Dog ia = new Dog("Barks","Malamut",true, 20,"Alaska");
        assert(ia.getRace().equals("Malamut"));


}
