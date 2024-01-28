/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myowngame.java;
import java.util.Scanner;


/**
 *
 * @author BDS2
 */
public class MyOwnGameJava {
    
   private static void printSnooping(){
       System.out.println("\n---Snooping Snooping---");
       System.out.println("---Snooping Snooping---");
       System.out.println("---Snooping Snooping---");
       System.out.println("---Snooping Snooping---");
   };

    public static void main(String[] args) {
        
        var running = true;
        var scanner = new Scanner(System.in);
        
        int phoneCode;
        String userChoice;
        
        var userCode = "8.30662386292";
        

       /*---------------------------------------------------------------------*/
       /*---------------------------------------------------------------------*/ 
       //intro to the game  
       System.out.println("\t\t\t\t\t\tWelcome to the Phone");
       System.out.println("\n\tYou are a detective investigating a homicide case.You have no leads besides a phone left behind by the victem");
       System.out.println("\n\tYou investigate the area and find nothing,you move to the victems body and snoop around the pockest.");
       printSnooping();
       System.out.println("\n\tYou find a photo of (69) the rapper and a radical symbol on the back...maybe that will come in use some where. ");
       
       /*---------------------------------------------------------------------*/
       /*---------------------------------------------------------------------*/
       //The phone home screen...
       System.out.println("\n>>>You open the phone to find only one way to unlock the phone: ");
        Game:
            while(running){
                System.out.println("--Please enter user Pin:");

                var userInput = scanner.next();
                    
                    /*---------------------------------------------------------------------*/
                    //If statement to see if the user input is true or false
                     if (userInput.equals(userCode)) {
                             System.out.println("\n>>>The phone opens and you message appears stating 'Watch out friend i heard Mike Bellings is coming to kill you'<<<");
                             System.out.println("Good job detective");
                             break;
                         }else{
                             System.out.println("\n>>>pin incorrect...do you want to retry "
                                + "or exit?");
                                System.out.println("1 - Retry");
                                System.out.println("2 - Exit");
                        }
                           

                    phoneCode = scanner.nextInt();
                    
                    /*---------------------------------------------------------------------*/
                    //The choices the user get when entering the wrong Code for the phone
                     switch (phoneCode) {
                         case 1 -> {
                             userChoice = "retry";
                             continue Game;

                         }
                         case 2 -> {
                             userChoice = "Exit"
                                     ;
                             System.out.println("You have failed detective, the murder will never be solved");
                             break Game;

                         }
                         default ->{
                             System.out.println("Dont be a smart ass");
                             continue Game;
                         }
                     }
        }
    }   
}
    
    

