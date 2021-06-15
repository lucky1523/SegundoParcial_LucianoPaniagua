package ejercicio1Fila2;

public class Client {
    public static void main(String[]args){
        //  EXAMEN TERMINADO
        AlamcenArchivos alamcenArchivos = new AlamcenArchivos();
        GeneradorVersionCodigo generador = new GeneradorVersionCodigo();

        String archivo;

        archivo="este documento es una prueba";
        generador.crearVersionamiento(archivo,alamcenArchivos);
        archivo="el exito solo depende de tu esfuerzo";
        generador.crearVersionamiento(archivo,alamcenArchivos);
        archivo="prologo";
        generador.crearVersionamiento(archivo,alamcenArchivos);
        archivo="este documento fue actualizado satisfactoriamente";
        generador.crearVersionamiento(archivo,alamcenArchivos);

        generador.restoreFromMemento(alamcenArchivos.getMemeno("version1"));
        
    }
}
