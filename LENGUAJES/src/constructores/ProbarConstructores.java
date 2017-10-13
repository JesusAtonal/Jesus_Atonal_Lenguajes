/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

import javax.swing.JFrame;

/**
 *
 * @author T-102
 */
public class ProbarConstructores {
    
    public static void main(String[] args) {
        
        //Creamos un objeto de la clase Animal 
        Animal algo=new Animal();
        int x=2;
        //algo.setEdad(5);
        System.out.println(x);
        System.out.println(algo.getEdad());
        System.out.println(algo.getNombre());
        System.out.println(algo.isMuerde());
        
        Animal otro=new Animal(8);
        System.out.println(otro.getEdad());
        
        //vamos a usar un constructor de una clase que no hemos hecho nosotros
        JFrame ventana=new JFrame("Hola Mundo");
            ventana.setSize(300,300);
            ventana.setVisible(true);
                
    }
            
    
}
