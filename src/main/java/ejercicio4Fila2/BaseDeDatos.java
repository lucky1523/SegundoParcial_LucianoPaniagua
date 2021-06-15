package ejercicio4Fila2;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
    private IOrdenamiento ordenamiento;
    private List<Usuario> list = new ArrayList<>();
    private String objetivo1;
    public BaseDeDatos(){

    }

    public String getObjetivo1() {
        return objetivo1;
    }

    public void setObjetivo1(String objetivo1) {
        this.objetivo1 = objetivo1;
    }

    public void add(Usuario usuario){
        list.add(usuario);
    }
    public IOrdenamiento getOrdenamiento() {
        return ordenamiento;
    }

    public void setOrdenamiento(IOrdenamiento ordenamiento) {
        this.ordenamiento = ordenamiento;
    }

    public List<Usuario> getList() {
        return list;
    }

    public void setList(List<Usuario> list) {
        this.list = list;
    }

    public void establecerOrdenamiento(){
        this.ordenamiento.busqueda(this.list,objetivo1);
    }
}
