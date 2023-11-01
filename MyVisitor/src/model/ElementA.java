package MyVisitor.src.model;

public class ElementA  implements Element{

    public String metodo(){
        return "Elemento A ";
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    

}
