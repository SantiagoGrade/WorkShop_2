package Alquiler_Embarcaciones;

public class Capitan {
    protected String nombre;
    protected String apellido;
    protected String matriculaNavegacion;

    protected Capitan(String nombre, String apellido, String matriculaNavegacion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaNavegacion = matriculaNavegacion;
    }
}
