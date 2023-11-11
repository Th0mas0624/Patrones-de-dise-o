import java.util.ArrayList;
import java.util.List;

public class ConcreteConllection {
    private List<Nombres> colletion = new ArrayList<>();

    public void add(Nombres objeto){
        colletion.add(objeto);
    }

    public Iterator crearIterator(){
        return new ConcreteIterator(colletion);
    }

}
