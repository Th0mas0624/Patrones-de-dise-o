import java.util.List;

public class ConcreteIterator implements Iterator{

    private List<Nombres> collection;
    private int posActual = 0;

    public ConcreteIterator(List<Nombres> collection){
        this.collection = collection;
    }
    @Override
    public Nombres getNext() {
        if(this.hasMore()){
            return collection.get(posActual++);
        }else{
            return null;
        }
    }

    @Override
    public boolean hasMore() {
        
        return posActual < collection.size();
    }
    
}
