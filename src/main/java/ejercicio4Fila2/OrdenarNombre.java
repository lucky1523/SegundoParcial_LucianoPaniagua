package ejercicio4Fila2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenarNombre implements IOrdenamiento {
    @Override
    public void busqueda(List<Usuario> usuarioList, String objetivo) {
            System.out.println("Ordenando por el nombre: ");
            int cnt =usuarioList.size();
            Collections.sort(usuarioList, new Comparator<Usuario>() {
                @Override
                public int compare(Usuario o1, Usuario o2) {
                    return o1.getNombre().compareTo(o2.getNombre());
                }
            });
            for (int i =0; i<cnt;i++) {
               usuarioList.get(i).showInfo();
            }
        }
    }

