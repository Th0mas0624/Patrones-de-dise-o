import java.util.HashMap;
import java.util.Map;

class GestorPrototipos {
    private Map<String, Prototype> prototipos = new HashMap<>();

    public void agregarPrototipo(String key, Prototype prototipo) {
        prototipos.put(key, prototipo);
    }

    public Prototype obtenerClon(String key) {
        return prototipos.get(key).clone();
    }
}