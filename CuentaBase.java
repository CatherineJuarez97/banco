/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto4;

/**
 *
 * @author katst
 */
//clase cuenta Base
   public class CuentaBase{
   //atributos
     double montoActual; 
     double apertura; 
     double cantidad;
     double interes;
     double saldo; 
     
     //métodos
     private double saldo() {
        return montoActual;
    } // Fin del método saldo  
     public void sumaInteres (){
         montoActual = montoActual + montoActual*0.15; 
     } //Fin metodo interes 
     
     public void invertir (){
     montoActual = montoActual + montoActual*0.10;
     }// fin metodo inversión 
        
     public void retirar(double cantidad) {
        montoActual = montoActual - cantidad;
    } // Fin del método retirar
     public void depositar(double cantidad) {
        montoActual = montoActual + cantidad;
    } // Fin del método depositar 
     
     
     // Consultamos el saldo
        double totalCuenta = Cuenta1.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta);
        

        // Hacemos un ingreso en la cuenta
        double ingreso = 350.25;
        System.out.println("Se ingresan en la cuenta: " + ingreso);
        Cuenta1.depositar(ingreso);
        
    
     }