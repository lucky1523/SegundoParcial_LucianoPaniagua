package ejercicio5Fila2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Apagado implements IStateComputadora{
    private int cantidadProgramasAbiertos;
    private int cantidadProgramasAbiertos2;
    public Apagado(){

    }

    @Override
    public void handler(Computadora computadora) {
        System.out.println("******* Estado: Apagado ********");
        cantidadProgramasAbiertos = new Random().nextInt(10);
        cantidadProgramasAbiertos2 = new Random().nextInt(10);
        List<Integer> lista = new ArrayList<>();
        computadora.setListProgramas(lista);
        computadora.setConsumoCPU(cantidadProgramasAbiertos);
        computadora.setConsumoMemoriaRam(cantidadProgramasAbiertos2);
        computadora.limpiarProgramas(lista);
        System.out.println("List Programas: "+computadora.getListProgramas().size());
        System.out.println("Consumo CPU: "+computadora.getConsumoCPU());
        System.out.println("Consumo Memoria Ram: "+computadora.getConsumoMemoriaRam());
        System.out.println("********");
    }
}
