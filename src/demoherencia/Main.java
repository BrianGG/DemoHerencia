/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherencia;

import java.util.Scanner;


/**
 *
 * @author El Bryan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿Que cuenta desea abrir?");
            System.out.println("1 = Bancaria");
            System.out.println("2 = Ahorro");
            System.out.println("3 = Cheques");
            int cuenta = entrada.nextInt();
        
        if (cuenta == 1){    
        System.out.println("Proporcione el numero de la cuenta.");
        int numeroDeCuenta = entrada.nextInt();
        System.out.println("Proporcione el nombre del cliente.");
        String cliente = entrada.next();
        CuentaBancaria cuentaBancaria = 
                new CuentaBancaria(numeroDeCuenta,cliente);
        int contador = 0;
        while (contador == 0){
            System.out.println("¿Que accion desea realizar?");
            System.out.println("1 = Depositar");
            System.out.println("2 = Retirar");
            System.out.println("3 = Finalizar");
            int accion = entrada.nextInt();
            if (accion == 1){
                System.out.println("¿Cuanto dinero deseas depositar?");
                double cantidad = entrada.nextDouble();
                cuentaBancaria.Depositar(cantidad);
            }
            if (accion == 2){
                System.out.println("¿Cuanto dinero deseas retirar?");
                double cantidad = entrada.nextDouble();
                cuentaBancaria.Retirar(cantidad);
            }
            if (accion == 3){
                System.out.println("Fin");
                contador = 1;
            }
            double saldo = cuentaBancaria.getSaldo();
            System.out.println(+saldo);
            }   
        }
        
        if(cuenta == 2){
            System.out.println("Proporcione el numero de la cuenta.");
            int numeroDeCuenta = entrada.nextInt();
            System.out.println("Proporcione el nombre del cliente.");
            String cliente = entrada.next();
            CuentaDeAhorro nuevaCuenta = 
                    new CuentaDeAhorro(numeroDeCuenta,cliente);
            
            System.out.println(nuevaCuenta.getSaldo());
           nuevaCuenta.Depositar(200);
            System.out.println(nuevaCuenta.getSaldo());
            nuevaCuenta.corteMensual();
            System.out.println(nuevaCuenta.getSaldo());    
            nuevaCuenta.Retirar(500);
            System.out.println(nuevaCuenta.getSaldo());
            nuevaCuenta.corteMensual();
            System.out.println(nuevaCuenta.getSaldo());
        }
        
        if (cuenta == 3){    
        System.out.println("Proporcione el numero de la cuenta.");
        int numeroDeCuenta = entrada.nextInt();
        System.out.println("Proporcione el nombre del cliente.");
        String cliente = entrada.next();
        CuentaDeCheques cuentaDeCheques = 
                new CuentaDeCheques(numeroDeCuenta,cliente);
        int contador = 0;
        while (contador == 0){
            System.out.println("¿Que accion desea realizar?");
            System.out.println("1 = Depositar");
            System.out.println("2 = Retirar");
            System.out.println("3 = Finalizar");
            int accion = entrada.nextInt();
            if (accion == 1){
                System.out.println("¿Cuanto dinero deseas depositar?");
                double cantidad = entrada.nextDouble();
                cuentaDeCheques.Depositar(cantidad);
            }
            if (accion == 2){
                System.out.println("¿Cuanto dinero deseas retirar?");
                double cantidad = entrada.nextDouble();
                cuentaDeCheques.Retirar(cantidad);
            }
            if (accion == 3){
                System.out.println("Fin");
                contador = 1;
            }
            double saldo = cuentaDeCheques.getSaldo();
            System.out.println(+saldo);
            }   
        }
    }
    
}      
