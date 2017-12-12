/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasofinal;
import java.sql.*;

/**
 *
 * @author T-102
 */
public class Conexion {

    public static Connection conectarse(String login, String password) throws SQLException, ClassNotFoundException{
       //Primero Escribimos el url de MYSQL
     String url="jdbc:mysql://localhost:3306/mysql";
     //Ahora hacemos el cargo con el codigo del driver
     //
     Class.forName("com.mysql.jdbc.Driver");
     Connection con = DriverManager.getConnection(url, login, password);
        
     return con;
    }
    
}
