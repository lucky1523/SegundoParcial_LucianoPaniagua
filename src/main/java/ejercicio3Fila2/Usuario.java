package ejercicio3Fila2;

public class Usuario implements IUsuario{
    private String suscripcion;
    private Persona persona;
    public Usuario(String suscripcion,Persona persona){
        this.persona=persona;
        this.suscripcion=suscripcion;
    }
    @Override
    public void update(String message, Publicacion publicacion) {
        System.out.println("***********");
        persona.showInfo();
        System.out.println(message);
        publicacion.showInfo();
    }

    @Override
    public String getTipo() {
        return this.suscripcion;
    }
}
