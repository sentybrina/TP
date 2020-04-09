import javax.xml.bind.JAXB;
import java.io.File;

public class Manager {
    private static final File file = new File("state.xml");

    private Manager(){}

    public static State getState(){
        return JAXB.unmarshal(file, State.class);
    }

    public static void setState(State state){
        JAXB.marshal(state, file);
    }

}
