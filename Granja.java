
/**
 * Write a description of class Granja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Granja {
    private Animal[] listaAnimales;
    private int contadorGallinas;
    private int contadorVacas;
    private int contadorCerdos;
    private int contadorAnimales;

    public Granja(int capacidadMaxima) {
        listaAnimales = new Animal[capacidadMaxima];
        contadorGallinas = 0;
        contadorVacas = 0;
        contadorCerdos = 0;
        contadorAnimales = 0;
    }

    public void agregarAnimal(Animal animal) {
        listaAnimales[contadorAnimales] = animal;
        contadorAnimales++;
        
    
        switch (animal.getTipo()) {
            case "Gallina":
                contadorGallinas++;
                break;
            case "Vaca":
                contadorVacas++;
                break;
            case "Cerdo":
                contadorCerdos++;
                break;
            default:
                break;
        }
    }

   public int calcularEdadAnimal(Animal animal) {
    Fecha fechaNacimiento = animal.getFechaNacimiento();
    Fecha fechaActual = Fecha.obtenerFechaActual();
    
    int edadAnios = fechaActual.getAnio() - fechaNacimiento.getAnio();
    int edadMeses = fechaActual.getMes() - fechaNacimiento.getMes();
    int edadDias = fechaActual.getDia() - fechaNacimiento.getDia();

    if (edadMeses < 0 || (edadMeses == 0 && edadDias < 0)) {
        edadAnios--;
    }
    
    return edadAnios;
}
    public int contarGallinas() {
        return contadorGallinas;
    }

    public int contarVacas() {
        return contadorVacas;
    }

    public int contarCerdos() {
        return contadorCerdos;
    }
}