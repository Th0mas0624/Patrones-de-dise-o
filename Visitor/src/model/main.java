package Visitor.src.model;

public class main {
    public static void main(String[] args) {
        Manzana manzana = new Manzana(2.0);
        Banano banano = new Banano(1.5);

        CalculadorDeCosto calculador = new CalculadorDeCosto();

        manzana.accept(calculador);
        banano.accept(calculador);

        System.out.println("El costo total es: " + calculador.getCostoTotal());
    }
}
