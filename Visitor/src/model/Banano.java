package Visitor.src.model;

class Banano implements Visitable {
    private double precio;

    public Banano(double precio) {
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
