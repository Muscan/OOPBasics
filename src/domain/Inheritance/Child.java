package domain.Inheritance;

import java.io.Serializable;
import java.util.EmptyStackException;

public class Child extends Father{
    private String name;

    /**
     *
     * @param height - parameter for the father class constructor
     * @param name - parameter for the
     * super - refers to the "father" class,
     * and it`s used in the constructor with the "father" constructor properties
     */
    public Child(int height, String name){
        super(height);
        this.name = name;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + "\n" + super.toString();
    }
}

/*
//todo: double intheritance
class Cousin extends  Child {
    public int age;

    public Cousin(int h, String n, int a){
        super(h,n);
        this.age = a;
    }
}
*/


