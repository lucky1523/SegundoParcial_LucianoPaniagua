package ejercicio2Fila2;



public abstract class PersonaDelColegio {
    protected IMediator mediator;

    public PersonaDelColegio(IMediator mediator){
        this.mediator=mediator;
    }

    public abstract void send(String message);
    public abstract void messageReceived(String message);
}
