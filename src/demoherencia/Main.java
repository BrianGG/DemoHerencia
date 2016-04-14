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
                System.out.println("GG IZI");
                contador = 1;
            }
            double saldo = cuentaBancaria.getSaldo();
            System.out.println(+saldo);
        }
    }
    
}
