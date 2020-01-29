package Logica;

/**
 *
 * @author rodrigo
 */
public class Turismo extends Vehiculo {
    
    private int puertas;
    private boolean marchaAutomatica;

    public Turismo(String matricula,
                   String marca,
                   String modelo,
                   String color,
                   double tarifa,
                   int puertas,
                   boolean marchaAutomatica) {
        super(matricula,
                marca,
                modelo,
                color,
                tarifa);
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
    }

    public int getPuertas() {
        return puertas;
    }

    public boolean getMarchaAutomatica() {
        return marchaAutomatica;
    }

    public String getAtributos() {
        return super.getAtributos() +
                "\nPuertas: " + this.puertas +
                "\nMarcha Automatica: " + this.marchaAutomatica;
    }

}
