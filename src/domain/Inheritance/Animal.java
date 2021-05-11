package domain.Inheritance;

public abstract class Animal {
    //abstract method cannot be implemented in a ABSTRACT CLASS
    public abstract void animalSound();
    public void sleep(){
        System.out.println("This is a regular method example from an abstract class");
    }
}
