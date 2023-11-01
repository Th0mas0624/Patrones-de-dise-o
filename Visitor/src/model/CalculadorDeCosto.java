package Visitor.src.model;

class CalculadorDeCosto implements Visitor {
    private double costoTotal = 0;

    @Override
    public void visit(Manzana manzana) {
        costoTotal += manzana.getPrecio();
    }

    @Override
    public void visit(Banano banano) {
        costoTotal += banano.getPrecio();
    }

    public double getCostoTotal() {
        return costoTotal;
    }
}