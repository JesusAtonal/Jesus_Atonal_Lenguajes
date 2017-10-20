/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T-102
 */
public class GeneradorUsuario {
    
    public static void main(String[] args) {
        Usuario u1=new Usuario();
        u1.setEdad(23);
        u1.setEmail("rapidclimate@gmail.com");
        u1.setNombre("Juan");
         
        Usuario u2=new Usuario();
        u2.setEdad(23);
        u2.setEmail("rapid1climate@gmail.com");
        u2.setNombre("Pedro");
        
        Usuario u3=new Usuario();
        u3.setEdad(25);
        u3.setEmail("rapid2climate@gmail.com");
        u3.setNombre("Maria");
        
        Usuario u4=new Usuario();
        u4.setEdad(19);
        u4.setEmail("rapid3climate@gmail.com");
        u4.setNombre("Fer");
        
        Usuario u5=new Usuario();
        u5.setEdad(26);
        u5.setEmail("rapid4climate@gmail.com");
        u5.setNombre("Gonzalo");
        
        //gereraremos un arreglo mutable
        ArrayList<Usuario> usuarios= new ArrayList<Usuario>();
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        usuarios.add(u5);

//vamos a iterarlo para ver los nombres
for (Usuario u:usuarios){
    System.out.println("Nombre "+u.getNombre());
}
        
    }
    
}
