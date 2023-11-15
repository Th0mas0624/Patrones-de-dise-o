import java.util.ArrayList;
import java.util.List;

public class Modulos implements collection{

    private List<collection> modulos = new ArrayList<>();
    public String nombre;
    
    public Modulos(String nombre){
        this.nombre = nombre;
    }
    @Override
    public iterator createIterator() {
        return new ModulosIterator(modulos);
    }
    
    public String getNombre() {
    	return nombre;
    }
}
