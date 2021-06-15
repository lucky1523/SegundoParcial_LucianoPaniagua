package ejercicio5Fila2;

public class Client {
    public static void main(String[]args){
        //  EXAMEN TERMINADO
        IStateComputadora state = new Apagado();
        Computadora computadora= new Computadora();
        computadora.setState(state);
        computadora.request();


        state = new Reiniciar();
        computadora.setState(state);
        computadora.request();


        state= new Prendido();
        computadora.setState(state);
        computadora.request();
    }
}
