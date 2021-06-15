package ejercicio2Fila2;

public class Alumno extends PersonaDelColegio{
    private int numMatricula;
    private String nombre;
    private String aQuienQuiereEnviar;

    public Alumno(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO - El alumno recibio el mensaje > "+message);
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

    public String getaQuienQuiereEnviar() {
        return aQuienQuiereEnviar;
    }

    public void setaQuienQuiereEnviar(String aQuienQuiereEnviar) {
        this.aQuienQuiereEnviar = aQuienQuiereEnviar;
    }
}
