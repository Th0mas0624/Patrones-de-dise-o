package MyVisitor;

import MyVisitor.src.model.ElementA;
import MyVisitor.src.model.ElementB;
import MyVisitor.src.model.Visitor;

public class ConcreteVisitors implements Visitor{

    String mensaje = "";
    @Override
    public void visit(ElementA a) {
       mensaje += a.metodo();
    }

    @Override
    public void visit(ElementB b) {
       mensaje += b.metodo();
    }
    
    public String getMensaje(){
        return mensaje;
    }
}
