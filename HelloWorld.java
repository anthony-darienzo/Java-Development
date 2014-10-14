
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author Kearney Robotics
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pass = new Scanner(System.in);
        System.out.println("Enter passcode:");
        if ("potato".equals(pass.next())) {
             System.out.println("Welcome back, programmer \n-Select a choice: [1] [2] [3]");
             Scanner choice = new Scanner(System.in);
             String option = choice.next();
             if (null != option) switch (option) {
                case "1":
                    System.out.println("Hello World!");
                    break;
                case "2":
                    System.out.println("Hola Mundo");
                    break;
                case "3":
                    System.out.println("HAI WURLD");
                    break;
                default:
                    System.out.println(option + " Is not a choice");
                    break;
            }
        
             
        } else {
             System.out.println("You're at the wrong place, man.");
        }
    }
}
            
    


