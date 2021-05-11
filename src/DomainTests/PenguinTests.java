package DomainTests;
import domain.Penguin;
import org.junit.jupiter.api.Test;

public class PenguinTests {
    @Test
    public void getSound_PenguinExists_ReturnsTheSound(){
        Penguin pe = new Penguin("piu","Adeline",true,"Cluj");
        assert(pe.getSound().equals("piu"));
    }

    @Test
    public void toString_PengiunExists_ReturnsPenguinAsString(){
        Penguin pe = new Penguin("piu","Adeline",true,"Cluj");

        //todo: test toString using the result from System.out.println(pe.toString());
        assert(pe.toString().equals("Penguin{sound='piu', race='Adeline', isTrained=true, habitat='Cluj'}"));
    }
    @Test
    public void maxAge_PenguinExists_Return9(){
        Penguin pe = new Penguin("Tzic", "Brandenbyro", false, "Zoo Munich");
        assert (pe.maxAge() == 9);
    }

    @Test
    public void maxAge_PenguinExists_Return9_false(){
        int errorCounter = 0;
        Penguin pe = new Penguin("Tzic", "Brandenbyro", false, "Zoo Munich");
        try{
            assert (pe.maxAge() == 10);
        }catch(AssertionError e){
            errorCounter++;
            assert (e.toString().equals("java.lang.AssertionError"));
        }
        finally {
            if(errorCounter == 0)
                System.out.println("Test works");
            else
                System.out.println("Send to testers");
        }
    }


}
