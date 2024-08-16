/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculo;

/**
 *
 * @author jamer
 */
public class vehiculomain extends automovil {
    private String marca;
    private String placa;
    private double precio;
    public vehiculomain (String fabricacion,String chasis,String motor,String marca,String placa,double precio){
            super(fabricacion,chasis,motor);
            this.marca=marca;
            this.placa=placa;
            this.precio=precio;
            
    }
    
     public void mostrarDatos() {
        System.out.println("Detalles del automovil:");
        System.out.println("Marca: " + getMarca());
        System.out.println("placa: " + getPlaca());
        System.out.println("Precio: $" + getPrecio());
         System.out.println("fecha de fabricacion:"+ fabricacion);
         System.out.println("numero de chasis"+ chasis);
         System.out.println("numero de motor:"+ motor );
     
     
     
     
     }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
        
    
    
    
    
}
