package MyVisitor.src.model;

public class ElementB implements Element{

    public String metodo(){
        return "Elemento B ";
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
