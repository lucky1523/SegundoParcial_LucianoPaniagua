package ejercicio3Fila2;

public class Persona {
    private String nombre;
    private String ci;
    public Persona( String nombre,String ci){
        this.ci=ci;
        this.nombre=nombre;

    }
    public void showInfo(){
        System.out.println("nombre de cuenta "+ nombre);
        System.out.println("id cuenta " + ci);
    }
}
