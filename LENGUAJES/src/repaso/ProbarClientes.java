/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author T-102
 */
public class ProbarClientes {
    
    public static void main(String[] args) {
        
        GeneradorClientes client = new GeneradorClientes();
        
        for(Cliente c:client.generarCliente()){
            System.out.println("Nombre: "+c.getNombre()+" Edad: "+c.getEdad()+" Email: "+c.getEmail());
            System.out.println(" Calle: "+c.getDireccion().getCalle()+" Colonia: "+c.getDireccion().getColonia());
            System.out.println(" CP: "+c.getDireccion().getCp()+" Municipio: "+c.getDireccion().getMunicipio()); 
        }
    }
} 
