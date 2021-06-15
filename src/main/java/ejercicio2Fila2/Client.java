package ejercicio2Fila2;

public class Client {
    public static void main (String[] args){
        Mediator mediator= new Mediator();
        Administrativo administrativo= new Administrativo(mediator);
        Alumno alumno= new Alumno(mediator);
        Profesor profesor= new Profesor(mediator);

        mediator.setAdministrativo(administrativo);
        mediator.setAlumno(alumno);
        mediator.setProfesor(profesor);

        administrativo.send("hola a todos");
        System.out.println("*******");
        alumno.setaQuienQuiereEnviar("profesor");
        alumno.send("hola profesor");
        System.out.println("*******");
        profesor.send("hola colegas y estudiantes");
    }
}
