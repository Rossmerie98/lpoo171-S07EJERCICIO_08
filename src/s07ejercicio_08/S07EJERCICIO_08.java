/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio_08;

import java.util.Scanner;
/**
 *
 * @author freddypc2
 */
public class S07EJERCICIO_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner reader = new Scanner(System.in);
        System.out.println("Escribe tu nombre de usuario: ");
        String nombre1 = reader.nextLine(); 
        System.out.println("Escribe tu password: ");
        String password = reader.nextLine();                
        
        if (nombre1.equals("emily") && password.equals("cat")) {
            System.out.println("Has iniciado sesión en el sistema!");
        }
        else {
            System.out.println("Nombre de usuario o contraseña incorrecta! ");
        }
        
        
        
    }
    
}
