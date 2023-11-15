import java.util.List;

public class ModulosIterator implements iterator{
    
    private List<collection> modulos;
    private int posActual=0;

    public ModulosIterator(List<collection> modulos){
        this.modulos = modulos;
    }
    @Override
    public collection getNext() {
        if(this.hasMore()){
        	
            return (collection) modulos.get(posActual++);
        }else{
            return null;
        }
    }

    @Override
    public boolean hasMore() {
        return posActual < modulos.size();
    }

    @Override
    public void add(collection c) {
        modulos.add(c);
    }
    
}
