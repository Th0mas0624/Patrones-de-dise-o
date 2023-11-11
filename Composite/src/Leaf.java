public class Leaf implements Component{

    private int n=0;
    @Override
    public int operacion() {
        n += 1;
        return n;
    }

    
}