package ejercicio3Fila2;

public class Publicacion {
    private String tipo;
    private String descripcion;

    public Publicacion(String tipo,String descripcion){
        this.descripcion=descripcion;
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void showInfo(){
        System.out.println("descripcion de la publicacion: "+ descripcion);
    }
}
