package ejercicio3Fila2;

public class Client {
    public static void main (String[] args){
        //  EXAMEN TERMINADO
        PaginaWeb paginaWeb = new PaginaWeb();
        Usuario u1 = new Usuario("video",(new Persona("juan","12345")));
        Usuario u2 = new Usuario("imagen",(new Persona("maria","76543")));
        Usuario u3 = new Usuario("video",(new Persona("felipe","8765")));
        Usuario u4 = new Usuario("imagen",(new Persona("pedro","23456")));
        Usuario u5 = new Usuario("video",(new Persona("luis","098765")));

        paginaWeb.attach(u1);
        paginaWeb.attach(u2);
        paginaWeb.attach(u3);
        paginaWeb.attach(u4);
        paginaWeb.attach(u5);

        paginaWeb.anadirPublicacion(new Publicacion("video","video de deportes"));
        paginaWeb.anadirPublicacion(new Publicacion("imagen","amaneci feliz"));
        paginaWeb.anadirPublicacion(new Publicacion("video","reproduciendo reel"));
        paginaWeb.anadirPublicacion(new Publicacion("imagen","imagen de amistad"));
        paginaWeb.anadirPublicacion(new Publicacion("video","trailer de una pelicula"));
    }
}
