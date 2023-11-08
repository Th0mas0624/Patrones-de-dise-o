import java.util.ArrayList;
import java.util.List;

public class ConcreteConllection {
    private List<String> colletion = new ArrayList<>();

    public void add(String objeto){
        colletion.add(objeto);
    }

    public Iterator crearIterator(){
        return new ConcreteIterator(colletion);
    }

}
