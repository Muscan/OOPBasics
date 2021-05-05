package domain;

public class Penguin implements InterfaceAnimal{
    private String sound, race;
    private boolean isTrained;
    private String habitat;


    public Penguin(String sound, String race, boolean isTrained,String habitat) {
        this.sound = sound;
        this.race = race;
        this.isTrained = isTrained;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "sound='" + sound + '\'' +
                ", race='" + race + '\'' +
                ", isTrained=" + isTrained +
                ", habitat='" + habitat + '\'' +
                '}';
    }

    @Override
    public void speak() {
        System.out.println("This penguin says: " + this.sound);
    }

    @Override
    public String getRace() {
        return this.race;
    }

    @Override
    public void emptyMethod() {
    }

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public boolean isTrained() {
        return this.isTrained;
    }

    @Override
    public int maxAge() {
        return 0;
    }

    @Override
    public String getHabitat() {
        return this.habitat;
    }

}
