package ejercicio4Fila2;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[]args){
        //  EXAMEN TERMINADO
        BaseDeDatos baseDeDatos = new BaseDeDatos();
        List<Usuario> usuarioList = new ArrayList<>();

        usuarioList.add(new Usuario(3,"Lucas","12/07/21","arquitecto"));
        usuarioList.add(new Usuario(5,"Maria","02/07/21","obrero"));
        usuarioList.add(new Usuario(1,"Pepe","30/07/21","zapatero"));
        usuarioList.add(new Usuario(2,"Santiago","10/07/21","basurero"));

        // En mi solucion, hice que se ordenaran por todas las maneras posibles, tanto por nombre, profesion, nacimiento,
        //  que serian alfabeticamente, y el ci que lo ordena de menor a mayor, como se ve en los siguientes ejemplos.

        baseDeDatos.setList(usuarioList);
        baseDeDatos.setOrdenamiento(new OrdenarCi());
        baseDeDatos.establecerOrdenamiento();

        System.out.println();
        System.out.println("***************************");
        System.out.println();

        baseDeDatos.setOrdenamiento(new OrdenarNombre());
        baseDeDatos.establecerOrdenamiento();

        System.out.println();
        System.out.println("***************************");
        System.out.println();

        baseDeDatos.setObjetivo1("profesion");
        baseDeDatos.setOrdenamiento(new OrdenarNaciOProfes());
        baseDeDatos.establecerOrdenamiento();



    }
}
