package ejercicio1Fila2;

import java.util.HashMap;
import java.util.Map;

public class AlamcenArchivos {
    private Map<String,Memento> stateSaved = new HashMap<>();

    public void createVersion(String numVersion, Memento memento){
        stateSaved.put(numVersion,memento);
    }
    public Memento getMemeno(String numVersion){
        return stateSaved.get(numVersion);
    }
}
