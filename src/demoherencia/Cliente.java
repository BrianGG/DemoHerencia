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
public class Cliente {
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String direccion;
    private String acupacion;
    private String telefono;
    private String email;
    
    Cliente(String nombre,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //Getter
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getFechaDeNacimiento(){
        return fechaDeNacimiento;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getAcupacion(){
        return acupacion;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getEmail(){
        return email;
    }
    
    //Setter
    public void setFechaDeNacimiento(String fechaDeNacimiento){
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setAcupacion(String acupacion){
        this.acupacion = acupacion;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public void setEmail(String email){
        this.email = email;
}
    }
