package domain;

import java.io.Serializable;

public interface InterfaceAnimal {
    void speak();
    String getRace();
    void emptyMethod();
    boolean canFly();
    boolean isTrained();
    int maxAge();
    String getHabitat();
    String toString();
    //declared a method in the interface and implemented it in the classes

}
