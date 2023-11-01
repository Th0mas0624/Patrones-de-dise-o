package Visitor.src.model;

class Manzana implements Visitable {
    private double precio;

    public Manzana(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}