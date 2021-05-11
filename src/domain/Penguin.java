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

    /**
     *
     * @param sound - new value for the sound of the animal
     */
    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }


    public String getSound(){ return this.sound;}

    public void setEverything(boolean trained, String _sound, String _habitat, String _race){
        this.isTrained = trained;
        this.sound = _sound;
        this.habitat = _habitat;
        this.race = _race;
    }

    public void setHabitat(String habitat) {
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
    public boolean canFly() {
        return true;
    }

    @Override
    public boolean isTrained() {
        return this.isTrained;
    }

    @Override
    public int maxAge() {
        return 9;
    }

    @Override
    public String getHabitat() {
        return this.habitat;
    }

}
