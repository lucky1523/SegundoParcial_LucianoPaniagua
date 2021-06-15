package ejercicio4Fila2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenarNaciOProfes implements IOrdenamiento {
    @Override
    public void busqueda(List<Usuario> usuarioList, String objetivo) {
        if (objetivo.equals("nacimiento")) {
            System.out.println("Ordenando por el nacimiento: ");
            int cnt = usuarioList.size();

                Collections.sort(usuarioList, new Comparator<Usuario>() {
                    @Override
                    public int compare(Usuario o1, Usuario o2) {
                        return o1.getNombre().compareTo(o2.getNacimiento());
                    }
                });
                for (int i = 0; i < cnt; i++) {
                    usuarioList.get(i).showInfo();
                }

        } else if (objetivo.equals("profesion")){
            System.out.println("Ordenando por el profesion: ");
            int cnt = usuarioList.size();

                Collections.sort(usuarioList, new Comparator<Usuario>() {
                    @Override
                    public int compare(Usuario o1, Usuario o2) {
                        return o1.getProfesion().compareTo(o2.getProfesion());
                    }
                });
                for (int i = 0; i < cnt; i++) {
                    usuarioList.get(i).showInfo();
                }

        }
    }
}
