package ejercicio2Fila2;

public class Mediator implements IMediator{
    private Administrativo administrativo;
    private Alumno alumno;
    private Profesor profesor;

    public void setAdministrativo(Administrativo administrativo) {
        this.administrativo = administrativo;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public void send(String message, PersonaDelColegio personaDelColegio) {
        if (personaDelColegio==administrativo){
            administrativo.messageReceived(message);
            profesor.messageReceived(message);
            alumno.messageReceived(message);
        } else if (personaDelColegio==profesor){
            profesor.messageReceived(message);
            alumno.messageReceived(message);
        }else if (personaDelColegio==alumno){
            if (alumno.getaQuienQuiereEnviar().equals("profesor")){
                profesor.messageReceived(message);
            } else if(alumno.getaQuienQuiereEnviar().equals("administrativo")){
                administrativo.messageReceived(message);
            } else if (alumno.getaQuienQuiereEnviar().equals("alumno")){
                alumno.messageReceived(message);
            }else{
                System.out.println("incorrecto");
            }
        }
    }
}
