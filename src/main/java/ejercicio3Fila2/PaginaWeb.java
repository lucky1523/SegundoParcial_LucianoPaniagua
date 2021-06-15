package ejercicio3Fila2;

import java.util.ArrayList;
import java.util.List;

public class PaginaWeb implements IPaginaWeb{
    private List<IUsuario> usuarioList = new ArrayList<>();
    private List<Publicacion> publicacions = new ArrayList<>();
    public void anadirPublicacion(Publicacion publicacion){
        publicacions.add(publicacion);
        this.notifyObserver(publicacion);
    }

    @Override
    public void attach(IUsuario usuario) {
        usuarioList.add(usuario);
    }

    @Override
    public void deattach(IUsuario usuario) {
        usuarioList.remove(usuario);
    }

    @Override
    public void notifyObserver(Publicacion publicacion) {
        for (IUsuario usuario:usuarioList) {
            if(usuario.getTipo().equals(publicacion.getTipo())){
                usuario.update("post nuevo: "+publicacion.getTipo(),publicacion);
            }
        }
    }
}
