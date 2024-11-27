package Models;

/**
 * Clase Carro que representa una entidad Carro con atributos para marca y
 * anio.
 */
public class Carro {
    // Atributos de la clase
    String marca; 
    int anio; 

    public String getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    /**
     * Constructor para crear una nueva instancia de Carro con un marca y anio
     * específicos.
     * 
     * @param marca Nombre del carro.
     * @param anio  Año del carro.
     */
    public Carro(String marca, int anio) {
        this.marca = marca; // Asigna el marca pasado al atributo marca de la clase
        this.anio = anio; // Asigna la anio pasada al atributo anio de la clase
    }

    
    

}