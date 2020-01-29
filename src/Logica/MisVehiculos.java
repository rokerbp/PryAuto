package Logica;
import java.util.Scanner;
//import javax.swing.JOptionPane;

/**
 *
 * @author rodrigo
 */
public class MisVehiculos {
    
    
    
    public static void main(String[] args) {
    
    // ** Funcion para pedir datos por GUI **
    /*String matricula = JOptionPane.showInputDialog("Ingrese Matricula");
    String marca = JOptionPane.showInputDialog("Ingrese Marca");
    String modelo = JOptionPane.showInputDialog("Ingrese Modelo");
    String color = JOptionPane.showInputDialog("Ingrese Color");
    double tarifa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese tarifa"));
    int puertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese # Puertas"));
    boolean marchaAutomatica = Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese Caja Automatica"));
    String cc = JOptionPane.showInputDialog("Ingrese CC");
    String nombre = JOptionPane.showInputDialog("Ingrese Nombre");
    String apellidos = JOptionPane.showInputDialog("Ingrese Apellido");
    */

    
    // **Funcion para pedir datos por consola **
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese Datos");
    System.out.println("Ingrese matricula");
    String matricula = entrada.nextLine();
    System.out.println("Ingrese marca");
    String marca = entrada.nextLine();
    System.out.println("Ingrese modelo");
    String modelo = entrada.nextLine();
    System.out.println("Ingrese color");
    String color = entrada.nextLine();
    System.out.println("Ingrese tarifa");
    double tarifa = entrada.nextDouble();
    System.out.println("Ingrese # puertas");
    int puertas = entrada.nextInt();
    System.out.println("Ingrese marcha Automatica");
    boolean marchaAutomatica = entrada.nextBoolean();
    entrada.nextLine();
    System.out.println("Ingrese cc");
    String cc = entrada.nextLine();
    System.out.println("Ingrese nombre");
    String nombre = entrada.nextLine();
    System.out.println("Ingrese apellidos");
    String apellidos = entrada.nextLine();
    
    
    Vehiculo vehiculo1 = new Vehiculo ("BSA 192",
                                        "Chevrolet",
                                        "Corsa",
                                        "Blanco",
                                        100.0);
    
    Vehiculo vehiculo2 = new Vehiculo (matricula,
                                        marca,
                                        modelo,
                                        color,
                                        tarifa);
    
    Turismo miTurismo = new Turismo ("SDQ 345",
                                    "Kia",
                                    "Sorento",
                                    "Negro",
                                    180.0,
                                    4,
                                    false);
    
    Turismo miTurismo2 = new Turismo (matricula,
                                    marca,
                                    modelo,
                                    color,
                                    tarifa,
                                    puertas,
                                    marchaAutomatica);

    Cliente cliente1 = new Cliente ("1083223432",
                                    "Ramon",
                                    "Córdoba");
    
    Cliente cliente2 = new Cliente (cc,
                                    nombre,
                                    apellidos);
    
    VehiculoAlquilado alquiler1 = new VehiculoAlquilado(cliente2,
                                                        vehiculo2,
                                                        11,
                                                        11,
                                                        2019,
                                                        2
                                                        );

    System.out.println("****Vehiculo Alquilado****");
    System.out.println("Cliente :" + alquiler1.getCliente().getCc() +
            " " + alquiler1.getCliente().getNombre() +
            " " + alquiler1.getCliente().getApellidos());
    System.out.println("Vehiculo: " + alquiler1.getVehiculo().getMatricula() +
            " " + alquiler1.getVehiculo().getMarca() +
            " " + alquiler1.getVehiculo().getModelo());
    System.out.print("***Segunda impresion herencia***\n" +
                    miTurismo2.getAtributos() + "\n");
    
    }
    
}
