import domain.Dog;
import domain.InterfaceAnimal;
import domain.Penguin;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        InterfaceAnimal ia = new Dog("Barks","Malamut",true, 20,"Alaska"),
                       ia2 = new Penguin("Peng","Adelie",true,"Antarctica");
        //call the methods
        ia.speak();
        ia2.speak();
        System.out.println("Can the Dog fly? " +  ia.canFly());
        System.out.println("Can the penguin fly? " + ia2.canFly());

        System.out.println(ia);
        System.out.println(ia2);


    }
}
