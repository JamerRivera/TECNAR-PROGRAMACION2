/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculo;

/**
 *
 * @author jamer
 */
public class automovil {
    
   protected  String fabricacion;
    protected String chasis;
   protected String motor;
  
  public automovil (String fabricacion,String chasis,String motor){
      this.fabricacion=fabricacion;
      this.chasis=chasis;
      this.motor=motor;
      
     
    
    
  }

    /**
     * @return the fabricacion
     */
    public String getFabricacion() {
        return fabricacion;
    }

    /**
     * @param fabricacion the fabricacion to set
     */
    public void setFabricacion(String fabricacion) {
        this.fabricacion = fabricacion;
    }

    /**
     * @return the chasis
     */
    public String getChasis() {
        return chasis;
    }

    /**
     * @param chasis the chasis to set
     */
    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    /**
     * @return the motor
     */
    public String getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }
 
  
  
  
  }
  
  
  
  
  
  
  


    

