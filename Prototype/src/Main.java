public class Main {
    public static void main(String[] args) {
        // Crear instancias de prototipos
        ObjetoConcreto prototipo1 = new ObjetoConcreto("Prototipo 1");
        ObjetoConcreto prototipo2 = new ObjetoConcreto("Prototipo 2");

        // Agregar prototipos al gestor
        GestorPrototipos gestor = new GestorPrototipos();
        gestor.agregarPrototipo("prototipo1", prototipo1);
        gestor.agregarPrototipo("prototipo2", prototipo2);

        // Clonar prototipos
        Prototype clon1 = gestor.obtenerClon("prototipo1");
        Prototype clon2 = gestor.obtenerClon("prototipo2");

        // Modificar los clones si es necesario
        if (clon1 instanceof ObjetoConcreto) {
            ((ObjetoConcreto) clon1).setDescripcion("Clon 1 modificado");
        }

        if (clon2 instanceof ObjetoConcreto) {
            ((ObjetoConcreto) clon2).setDescripcion("Clon 2 modificado");
        }

        // Imprimir resultados
        System.out.println("Prototipo 1: " + prototipo1.getDescripcion());
        System.out.println("Clon 1: " + ((ObjetoConcreto) clon1).getDescripcion());

        System.out.println("Prototipo 2: " + prototipo2.getDescripcion());
        System.out.println("Clon 2: " + ((ObjetoConcreto) clon2).getDescripcion());
    }
}