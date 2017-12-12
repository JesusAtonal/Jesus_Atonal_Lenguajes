/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasofinal;

/**
 *
 * @author T-102
 */
public class ProbarCLiente {
    public static void main(String[] args) {
        Direccion d=new Direccion(1, 55130l, "Europa", "Ecatepec");
        Cliente c =new Cliente(1, "Jesus", 21, d);
        PersistenciaCliente pc=new PersistenciaCliente();
        
        try{
            System.out.println(pc.guardarCliente(c, d));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
