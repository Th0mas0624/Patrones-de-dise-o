import java.util.ArrayList;

public class Composite implements Component{

    private ArrayList<Component> components= new ArrayList<>();
    private int n = 0;
    @Override
    public int operacion() {
        for(int i=0; i<components.size(); i++){
            n += components.get(i).operacion();
        }
        return n;
    }

    public void add(Component c){
        components.add(c);
    }

    public void remove(Component c){
        components.remove(c);
    }

    public ArrayList<Component> getComponents(){
        return components;
    }
    
}
