package MyVisitor.src.model;

import MyVisitor.ConcreteVisitors;

public class Launcher {
    public static void main(String[] args) {
        ConcreteVisitors c = new ConcreteVisitors();

        ElementA a = new ElementA();
        ElementB b = new ElementB();

        a.accept(c);
        b.accept(c);

        System.out.println(c.getMensaje());
    }
}
