package ejercicio5Fila2;

import java.util.ArrayList;
import java.util.List;

public class Reiniciar implements IStateComputadora{
    public Reiniciar(){

    }

    @Override
    public void handler(Computadora computadora) {
        System.out.println("******** Estado: Reiniciadno ******");
        List<Integer> lista = new ArrayList<>();
        computadora.limpiarProgramas(lista);
        computadora.setConsumoCPU(0);
        computadora.setConsumoMemoriaRam(0);
        System.out.println("List Programas: "+computadora.getListProgramas().size());
        System.out.println("Consumo CPU: "+computadora.getConsumoCPU());
        System.out.println("Consumo Memoria Ram: "+computadora.getConsumoMemoriaRam());
        System.out.println("********");
    }
}
