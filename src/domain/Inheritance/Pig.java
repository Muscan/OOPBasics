package domain.Inheritance;

//!important! If the word "CLASS" is in the deffinition of the class,
// for inheritance you use EXTENDS
//If not, it most probably is INTERFACE and you use IMPLEMENTS
public class Pig extends Animal{
    public void animalSound(){
        System.out.println("Here is the implementation for the abstract method");
    }
}
