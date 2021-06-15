package ejercicio1Fila2;

public class GeneradorVersionCodigo {
    private String state;
    private int conVersiones;

    public GeneradorVersionCodigo() {
        this.conVersiones = 1;
    }

    public void crearVersionamiento(String state, AlamcenArchivos alamcenArchivos) {
        int contadorPalab = 0;
        for (String palabras : state.split(" ")) {
            contadorPalab++;
        }
        System.out.println("numero de palabras: " + contadorPalab);
        if (contadorPalab >= 5) {
            setState(state);
            alamcenArchivos.createVersion("version" + conVersiones++, createVersion());
        }
    }

    public void setState(String state) {
        System.out.println("****** set state **********");
        System.out.println("contenido del archivo: " + state);
        this.state = state;
    }

    public Memento createVersion() {
        System.out.println("********* Creando state ************");
        System.out.println("contenido del archivo: " + state);
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento memento){
        this.state= memento.getState();
        System.out.println("********* restaurando el state  ************");
        System.out.println("Archivo restaurado: " + state);
    }
}
