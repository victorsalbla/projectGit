/*
 Autor: Víctor Salgado Blanco
 Fecha: 04/02/2020
 pide el dni (numeros) y di la letra
 */
package projectgit;

import java.util.Scanner;


public class ProjectGit {
    static Scanner keyboard = new Scanner(System.in);
    
    
    
    public static void main(String[] args) {
        //preguntar dni
        System.out.println("What's yout ID number?");
        int dni=keyboard.nextInt();
        char letter= DNIletter(dni);
        System.out.println(dni+":"+letter);
    }
    
    //función que recibe dni y devuelve la letra
    private static char DNIletter(int dni){
        char letter='T';
        String letters="TRWAGMYFPDXBNJZSQVHLCKE";
        int res=dni%23;
        letter = letters.charAt(res);
        return letter;
    }
    
}
