/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author rodrigo
 */
public class VehiculoAlquilado {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int diaAlquiler;
    private int mesalquiler;
    private int anoAlquiler;
    private int totalDiasAlquiler;
    
    public VehiculoAlquilado(Cliente cliente,
                            Vehiculo vehiculo,
                            int diaAlquiler,
                            int mesAlquiler,
                            int anoAlquiler,
                            int totalDiasAlquiler){
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.diaAlquiler = diaAlquiler;
        this.mesalquiler = mesAlquiler;
        this.anoAlquiler = anoAlquiler;
        this.totalDiasAlquiler = totalDiasAlquiler;
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public Vehiculo getVehiculo(){
        return this.vehiculo;
    }
}
