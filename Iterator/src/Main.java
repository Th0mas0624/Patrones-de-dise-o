public class Main {
    public static void main(String[] args) {
        ConcreteConllection miColeccion = new ConcreteConllection();
        miColeccion.add("1");
        miColeccion.add("2");
        miColeccion.add("3");

        Iterator iterator = miColeccion.crearIterator();

        while (iterator.hasMore()) {
            String objeto = iterator.getNext();

            System.out.println(objeto);
        }
    }
}
