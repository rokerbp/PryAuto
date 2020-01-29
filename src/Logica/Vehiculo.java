package Logica;

/**
 *
 * @author rodrigo
 */
public class Vehiculo {
    
    /**
     * @param args the command line arguments
     */
    
    
    // **Atributos**
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;
    //private double tarifa = 0.0; //atributo de clase
    //boolean disponible = false; //atributo de clase
    
    // **Constructor de la clase vehiculo**
    public Vehiculo (
            String matricula,
            String marca,
            String modelo,
            String color,
            double tarifa
                    ){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = false;
    }
    
    // Sobrecarga de constructor
    public Vehiculo(
            String matricula,
            String marca,
            String modelo,
            String color
             ){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = 0.0;
        this.disponible = false;
    }
    
    // **Setters and Getters**

    public String getMatricula() {
        return matricula;
    }
    
    /*public void setMatricula(String matricula) {
        this.matricula = matricula;
    }*/

    public String getMarca() {
        return marca;
    }

    /*public void setMarca(String marca) {
        this.marca = marca;
    }*/

    public String getModelo() {
        return modelo;
    }

    /*public void setModelo(String modelo) {
        this.modelo = modelo;
    }*/

    public String getColor() {
        return color;
    }

    /*public void setColor(String color) {
        this.color = color;
    }*/

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    // **método para obtener todos los datos de un vehículo **
    public String getAtributos() {
        return "Matrícula: " + this.matricula +
                "\nModelo: " + this.marca + " " + this.modelo +
                "\nColor: " + this.color +
                "\nTarifa: " + this.tarifa +
                "\nDisponible: " + this.disponible;
    }
    
    // sobrecarga de método aplicando un descuento
    public String getAtributos(double porcentajeDescuento){
        return "Matrícula: " + this.matricula +
                "\nModelo: " + this.marca + " " + this.modelo +
                "\nColor: " + this.color +
                "\nTarifa: " + 
                ((100.0 - porcentajeDescuento)/100)*tarifa +
                "\nDisponible: " + this.disponible; 
    }  

    /*public static void main(String[] args) {
        // TODO code application logic here
        
        Vehiculo vehiculo1 = new Vehiculo ("SQS 423",
                                   "VW",
                                   "GTI",
                                   "Blanco",
                                   100.5);
        
        Vehiculo vehiculo2 = new Vehiculo ("HJS 324",
                                   "JD",
                                   "LANCER",
                                   "Negro");
        
        System.out.print(vehiculo2.getAtributos(20));
    }*/
    
}