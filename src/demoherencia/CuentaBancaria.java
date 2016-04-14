/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherencia;
/**
 *
 * @author El Bryan
 */
public class CuentaBancaria {
    private int numeroDeCuenta;
    private String cliente;
    private double saldo;
    
    public CuentaBancaria (int numeroDeCuenta, String cliente){
        this.cliente = cliente;
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo =0.0;
    }
    private void NumeroDeCuenta(int numeroDeCuenta){
        this.numeroDeCuenta = numeroDeCuenta;
    }
    
    private void Cliente(String cliente){
        this.cliente = cliente;
    }
    
    public void Depositar(double cantidad){
        if (this.puedeDepositar(cantidad)){
            this.saldo = saldo + cantidad;
        }
        else {
            System.out.println("No se puede hacer el deposito.");
        }
    }
    
    public void Retirar(double cantidad){
        if (this.puedeRetirar(cantidad)){
            this.saldo = saldo - cantidad;
        }
        else {
            System.out.println("No se puede hacer el retiro.");
        }
    }
    
    public boolean puedeDepositar(double cantidad){
        boolean siPuedeDepositar = false;
        if (cantidad > 0) {
            siPuedeDepositar = true;
        }
        return siPuedeDepositar;
    }
    
    public boolean puedeRetirar(double cantidad){
        boolean siPuedeRetirar = false;
        if (cantidad < this.saldo){
            siPuedeRetirar = true;
        }
        return siPuedeRetirar;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    

    
            
    
    
}
