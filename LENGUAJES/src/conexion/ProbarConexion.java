/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

/**
 *
 * @author T-102
 */

import java.sql.*;
import java.util.HashSet;

public class ProbarConexion {
    
    public static void main(String[] args) {
        Connection con=null;
        try{
        con = Conexion.conectarse("root", "");
        System.out.println("Te conectaste !!");
        //Aqui vienen los queries de mysql
        
            System.out.println("Te conectaste muy bien");
            //Con la conexion que se llama con vamos a generar una sentencia
            //la cual es una clase
            //Statement st = con.createStatement();
            //Generamos una tabla
               // st.execute("create table tablita(id integer primary key, nombre varchar(40))");
               
               //caso:1 INSERT
        //PreparedStatement st =con.prepareStatement("update tablita set nombre=? where id=?");
        PreparedStatement st =con.prepareStatement("insert into tablita values(?,?)");
                          st.setInt(1,1);
                          st.setString(2,"Juan C");
                          st.execute();
                          st.close();
                          System.out.println("Registro Insertado");  

            //Tambien se cierran las sentencias al igual que las conexiones
                st.close();
                
                System.out.println("Tabla generada con exito");
                
        
        }catch (ClassNotFoundException e){
            System.out.println("No se cargo bien el driver");
        }catch(SQLException e){
            System.out.println("Un error de sql"+e.getMessage());
        }finally{
            try {
                if (con!=null)
                    con.close();
                System.out.println("Ya se cerro todo :D :3 !!");
            } catch (SQLException ex) {
            }
        }
    }
    
}
