
/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal {
    private String identificador;
    private String nombre;
    private double peso;
    private String tipo;
    private Fecha fechaNacimiento;

    public Animal(String identificador, String nombre, double peso, String tipo, Fecha fechaNacimiento) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.peso = peso;
        this.tipo = tipo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}