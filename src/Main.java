import domain.Dog;
import domain.Inheritance.Child;
import domain.Inheritance.Father;
import domain.InterfaceAnimal;
import domain.Penguin;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Dog ia = new Dog("Barks","Malamut",true, 20,"Alaska");

//        Penguin ia2 = new Penguin("Peng","Adelie",true,"Antarctica");
//
//        System.out.println("The object before using setEverything");
//        System.out.println(ia2);
//        System.out.println("The sound AFTER using setEverything");
//        ia2.setEverything(false,"Sample.mp4","Transilvania","Emperor");
//        System.out.println(ia2);
//        System.out.println("Prints only the race of the dog" + ia2.getRace());


        //Child c = new Child(175,"John Sohn");
        //c.name = "Now I changed the name because the modifier was public"
        //System.out.println(c);

        //simple Abstraction example
        InterfaceAnimal d = new Dog("","",true,1,""), pe = new Penguin("Tzic", "Brandenbyro", false, "Zoo Munich");
        ArrayList<InterfaceAnimal> listDeAnimale = new ArrayList<>();
        listDeAnimale.add(d);
        listDeAnimale.add(pe);
        for (int i = 0; i < listDeAnimale.size(); i++) {
            System.out.println(listDeAnimale.get(i));
        }






























        ArrayList<Integer> a;
    }
}
