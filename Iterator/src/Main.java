public class Main {
    public static void main(String[] args) {
        ConcreteConllection miColeccion = new ConcreteConllection();
        Nombres miguel= new Nombres("miguel");
        Nombres carlos= new Nombres("carlos");
        Nombres juan= new Nombres("juan");
        miColeccion.add(miguel);
        miColeccion.add(carlos);
        miColeccion.add(juan);

        Iterator iterator = miColeccion.crearIterator();

        while (iterator.hasMore()) {
            Nombres objeto = iterator.getNext();
            
            System.out.println(objeto.getNombre());
        }
    }
}
