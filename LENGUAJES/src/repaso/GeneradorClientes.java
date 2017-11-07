/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.ArrayList;

/**
 *
 * @author T-102
 */
public class GeneradorClientes {
    
    public ArrayList<Cliente> generarCliente(){
            
            ArrayList<Cliente> clientes = new ArrayList<Cliente>(); 
            Direccion D1 = new Direccion("15", "Ecatepec", 44566, "Ecatepec");
            Direccion D2 = new Direccion("18", "San Cristobal", 44596, "Ecatepec");
            Direccion D3 = new Direccion("Puebla", "Tulpetlac", 24596, "GAM");
            
            Cliente cl1 = new Cliente("Juan",23,"Juan@gmail.com",D1);
            Cliente cl2 = new Cliente("Pedro",28,"Pedro@gmail.com",D2);
            Cliente cl3 = new Cliente("Juana",24,"Juana@gmail.com",D3);
            
            clientes.add(cl1);
            clientes.add(cl2);
            clientes.add(cl3);
            
            return clientes;
}
    
    
}
