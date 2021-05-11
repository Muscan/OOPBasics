package domain;

public class Dog implements InterfaceAnimal{
    private String sound, race;
    private boolean isTrained;
    private int maxAge;
    private String habitat;
    //public static String dogNumber;

    /**
     *
     * @param sound - the sound the dog makes
     * @param race - the race the dog has
     * @param isTrained - is trained True/False
     * @param maxAge - average life expectancy for the dog
     * @param habitat - natural habit
     */
    //the keyword "this" refers to current object field
    public Dog(String sound, String race, boolean isTrained, int maxAge, String habitat) {
        this.sound = sound;
        this.race = race;
        this.isTrained = isTrained;
        this.maxAge = maxAge;
        this.habitat = habitat;
        //dogNumber+= "-adding glowesd+";
    }

    /**
     *
     * @return String
     */
    //override let's you overwrite over an existing method/keyword
    @Override
    public String toString() {
        return "Dog{" +
                "sound='" + sound + '\'' +
                ", race='" + race + '\'' +
                ", isTrained=" + isTrained +
                ", maxAge=" + maxAge +
                ", habitat='" + habitat + '\'' +
                '}';
    }

    public Dog(String sound, String race) {
        this.sound = sound;
        this.race = race;
    }

    @Override
    public void speak() {
        System.out.println("This dog says: " + this.sound);
    }

    @Override
    public String getRace() {
        return this.race;
    }


    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public boolean isTrained() {
        return false;
    }

    @Override
    public int maxAge() {
        return this.maxAge;
    }

    @Override
    public String getHabitat() {
        return this.habitat;
    }
}
