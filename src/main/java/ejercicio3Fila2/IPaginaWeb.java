package ejercicio3Fila2;

public interface IPaginaWeb {
    void attach(IUsuario usuario);
    void deattach(IUsuario usuario);
    void notifyObserver(Publicacion publicacion);
}
