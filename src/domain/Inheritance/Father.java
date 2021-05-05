package domain.Inheritance;

public class Father {
    public int height;

    public Father(int _height){
        this.height = _height;
    }

    @Override
    public String toString(){
        return "Height: " + height + "\n";
    }
}
