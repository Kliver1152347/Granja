import java.util.Date;
/**
 * Write a description of class Fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

   
    public Fecha() {
 
        this.dia = 0;
        this.mes = 0;
        this.anio = 0;
    }
    
    
  public static Fecha obtenerFechaActual() {
        java.util.Date fechaActual = new java.util.Date();
        int dia = fechaActual.getDate();
        int mes = fechaActual.getMonth() + 1; 
        int anio = fechaActual.getYear() + 1900; 
        return new Fecha(dia, mes, anio);
    }

  
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }
    
}