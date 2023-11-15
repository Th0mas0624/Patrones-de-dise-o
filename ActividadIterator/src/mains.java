public class mains {
    public static void main(String[] args) {
    	
        Modulos modulo = new Modulos("modulo");
        iterator iModulo = modulo.createIterator();
        Modulos modulo1 = new Modulos("modulo1");
        iterator iModulo1 = modulo1.createIterator();
        Modulos modulo2 = new Modulos("modulo2");
        iterator iModulo2 = modulo1.createIterator();
        
        iModulo.add(modulo1);
        iModulo.add(modulo2);
        
        while (iModulo.hasMore()) {
            Modulos objeto = (Modulos) iModulo.getNext();
            
            System.out.println(objeto.getNombre());
        }
        
    }
}
