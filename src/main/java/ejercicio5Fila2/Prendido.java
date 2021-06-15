package ejercicio5Fila2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Prendido implements IStateComputadora{
    /*
    cuando está en prendido el consumo de recurso va incrementando en 5% en relación a los programas
    abiertos (cantidad randómica de programas son abiertos cuando está en este estado)
     */
    private int cantidadProgramasAbiertos;
    private int cantidadProgramasAbiertos2;
    public Prendido(){

    }

    public int getCantidadProgramasAbiertos() {
        return cantidadProgramasAbiertos;
    }

    public void setCantidadProgramasAbiertos(int cantidadProgramasAbiertos) {
        this.cantidadProgramasAbiertos = cantidadProgramasAbiertos;
    }

    @Override
    public void handler(Computadora computadora) {
        System.out.println("******** Estado: Prendido ********");
        cantidadProgramasAbiertos = new Random().nextInt(20);
        cantidadProgramasAbiertos2 = new Random().nextInt(20);
        List<Integer> lista = new ArrayList<>();
        List<String> listaString = new ArrayList<>();
        lista.add(cantidadProgramasAbiertos);

        int numProgramas=1;
        for(int i = 1 ;i <= cantidadProgramasAbiertos;i++){
            listaString.add("Programa"+numProgramas);
            System.out.println("Programa"+numProgramas);
            numProgramas++;
        }
        computadora.setListProgramas(lista);
        computadora.setConsumoCPU(cantidadProgramasAbiertos*5);
        computadora.setConsumoMemoriaRam(cantidadProgramasAbiertos2*5);
        System.out.println(cantidadProgramasAbiertos+ "*5" + " ------>");
        System.out.println("CPU "+ computadora.getConsumoCPU() + "%");
        System.out.println("Memoria Ram "+ computadora.getConsumoMemoriaRam()+ "%");
        System.out.println(" Programas abiertos "+ computadora.getListProgramas().get(0));
        System.out.println("********");
    }
}
