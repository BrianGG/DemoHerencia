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
        String nombre = entrada.next();
        System.out.println("Proporcione el apellido del cliente.");
        String apellido = entrada.next();
        Cliente cliente = new Cliente(nombre, apellido);
        
        CuentaBancaria cuentaBancaria = 
                new CuentaBancaria(numeroDeCuenta, cliente);
        int contador = 0;
        while (contador == 0){
            System.out.println("¿Que accion desea realizar?");
            System.out.println("1 = Introducir datos personales");
            System.out.println("2 = Proporcionar los datos del cliente");
            System.out.println("3 = Depositar");
            System.out.println("4 = Retirar");
            System.out.println("5 = Finalizar");
            int accion = entrada.nextInt();
            
            if (accion == 1){
                System.out.println("Porporcione su fecha de nacimiento.");
                String fechaDeNacimiento;
                fechaDeNacimiento = entrada.nextLine();
                fechaDeNacimiento = entrada.nextLine();
                
                System.out.println("Porporcione su direccion.");
                String direccion = entrada.nextLine();
               
                System.out.println("Porporcione su acupacion.");
                String acupacion= entrada.nextLine();
                
                System.out.println("Proporcione su telefono.");
                String telefono= entrada.nextLine();
                
                System.out.println("Proporcione su email.");
                String email= entrada.nextLine();
                
                
                cliente.setFechaDeNacimiento(fechaDeNacimiento);
                cliente.setDireccion(direccion);
                cliente.setAcupacion(acupacion);
                cliente.setTelefono(telefono);
                cliente.setEmail(email);
            }
            
            if (accion == 2){
                System.out.println("El numero de la cuenta del cliente es: " 
                        +cuentaBancaria.getNumeroDeCuenta());
                System.out.println("El nombre del cliente es: " 
                        +cliente.getNombre());
                System.out.println("El apellido del cliente es: " 
                        +cliente.getApellido());
                System.out.println("La fecha de nacimiento del cliente es: "
                        +cliente.getFechaDeNacimiento());
                System.out.println("El cliente vive en: " 
                        +cliente.getDireccion());
                System.out.println("El cliente trabaja como: " 
                        +cliente.getAcupacion());
                System.out.println("El numero telefonico del cliente es: "
                        +cliente.getTelefono());
                System.out.println("El correo electronico es: "
                        +cliente.getEmail());
            }
            
            if (accion == 3){
                System.out.println("¿Cuanto dinero deseas depositar?");
                double cantidad = entrada.nextDouble();
                cuentaBancaria.Depositar(cantidad);
            }
            if (accion == 4){
                System.out.println("¿Cuanto dinero deseas retirar?");
                double cantidad = entrada.nextDouble();
                cuentaBancaria.Retirar(cantidad);
            }
            if (accion == 5){
                System.out.println("Fin");
                contador = 1;
            }
            double saldo = cuentaBancaria.getSaldo();
            System.out.println(+saldo);
            }   
        }
        else {
            System.out.println("Cuenta no disponible.");
        }
                
        
        //Codigo de CuentaDeAhorro y CuentaDeCheques
    /*    if(cuenta == 2){
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
    */
    }
    
}  
