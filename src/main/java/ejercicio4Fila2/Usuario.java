package ejercicio4Fila2;

public class Usuario {
    private int ci;
    private String nombre;
    private String nacimiento;
    private String profesion;

    public Usuario(int ci,String nombre,String nacimiento,String profesion){
        this.ci=ci;
        this.nacimiento=nacimiento;
        this.nombre=nombre;
        this.profesion=profesion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }
    public void showInfo(){
        System.out.println("carnet de identidad : "+ ci);
        System.out.println("nombre del usuario: "+nombre);
        System.out.println("fecha de nacimiento: " +nacimiento);
        System.out.println("fecha de profesion: " +profesion);
    }
}
