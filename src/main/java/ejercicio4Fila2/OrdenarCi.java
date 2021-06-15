package ejercicio4Fila2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenarCi implements IOrdenamiento{
    List<Usuario> list2 = new ArrayList<>();
    @Override
    public void busqueda(List<Usuario> usuarioList,String objetivo) {
        System.out.println("Ordenando por el ci: ");

        Collections.sort(usuarioList, new Comparator<Usuario>() {
            @Override
            public int compare(Usuario p1, Usuario p2) {

                return new Integer(p1.getCi()).compareTo(new Integer(p2.getCi()));

            }

        });
        for (Usuario usuario:usuarioList) {
            usuario.showInfo();
        }


    }

}
