package ejercicio2Fila2;

public class Profesor extends PersonaDelColegio{
    private String nombre;
    private int ci;
    public Profesor(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {

    }

    @Override
    public void messageReceived(String message) {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
}
