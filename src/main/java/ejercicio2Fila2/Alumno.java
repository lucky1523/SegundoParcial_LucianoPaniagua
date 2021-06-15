package ejercicio2Fila2;

public class Alumno extends PersonaDelColegio{
    private int numMatricula;
    private String nombre;

    public Alumno(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {

    }

    @Override
    public void messageReceived(String message) {

    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
