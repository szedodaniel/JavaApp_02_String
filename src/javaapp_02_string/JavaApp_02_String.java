/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp_02_string;

import java.util.Scanner;

/**
 *
 * @author Diak
 */
public class JavaApp_02_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Kérem adjon meg egy szöveget!");
        String s = "Indul a görög aludni";
        char menuPont;
        do{
       menuPont = menu();
       
       switch(menuPont){
           case 'a':System.out.println(s.toUpperCase());break;
           case 'b':System.out.println(s.toLowerCase());break;
           case 'c':System.out.println(s.length());break;
           case 'd':System.out.println(s.equals("sajt"));break;
           case 'f':System.out.println(s.substring(3, 6));break;
           default:System.out.println("Helytelen menüpont!");break;
       }
        }while(menuPont != 'f');
        
       }
    public static char menu(){
    Scanner sc =new Scanner(System.in);
        System.out.println(
    
        "a  Nagy betűssé alakítani\n" +
        "b Kisbetűssé alakítani\n" +
        "c Lekérdezni a hosszát\n" +
        "d Összehasonlítani egy másik stringel (string2 bekérése)\n"+
        "e Egy részét kiiratni a Stringnek (a, b intervallum bekérése)\n"+
        "f Kilépni"
                + "Kérem válasszon menüpontot");
        char m = sc.nextLine().charAt(0);
    return m;
    
    
    
    }
    
}
