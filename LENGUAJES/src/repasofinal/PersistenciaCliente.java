/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasofinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author T-102
 */
public class PersistenciaCliente {
    
    public String guardarCliente(Cliente c, Direccion d){
     
        Connection con=null;  
        String mensaje="";
        
    try{
        
    con =    conexion.Conexion.conectarse("root", "");
                System.out.println("Te conectaste !!");
    //Aqui vienen queris de mysql
    
     System.out.println("Teconectaste muy bien !!!!!");
      //Caso 1 INSERT
      PreparedStatement std=con.prepareStatement("insert into direccion values(?,?,?,?)");
      std.setInt(1,d.getId());
      std.setInt(2, (int) d.getCp());
      std.setString(3, d.getCalle());
      std.setString(4,d.getMunicipio());
      
      std.execute();
      
       PreparedStatement stc=con.prepareStatement("insert into cliente values(?,?,?,?)");
      stc.setInt(1,c.getId());
      stc.setString(2, c.getNombre());
      stc.setInt(3,c.getEdad());
      stc.setInt(4,d.getId());
      stc.execute();
   
      mensaje="Registro insertado";
     //Tambien se cierran las centencias al igual que las condiciones
     
     std.close();
     stc.close();

       // System.out.println("Tabla generada con exito");
        
    }catch(ClassNotFoundException e){
        mensaje="Nos se cargo bien el driver";
    }catch(SQLException e){
        System.out.println("Un error de SQL "+e.getMessage());
    }finally{
        
         try {
             if (con!=null)con.close();           
             System.out.println("Ya se cerro todo");
         } catch (SQLException ex) {
             mensaje=ex.getMessage();
         }
    }
        return mensaje;
    }
    
    public void buscarClienteporId(){
        
    }
    
    public void actualizarCliente(){
        
    }
    
    public void buscarTodoslosClientes(){
        
    }
    
    public void borarCliente(){
        
    }
    
}
