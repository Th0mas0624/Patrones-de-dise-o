import java.util.List;

public class ConcreteIterator implements Iterator{

    private List<String> collection;
    private int posActual = 0;

    public ConcreteIterator(List<String> collection){
        this.collection = collection;
    }
    @Override
    public String getNext() {
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
