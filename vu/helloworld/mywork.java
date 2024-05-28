/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.helloworld;

import java.util.Scanner;

/**
 *
 * @author DALL
 */
public class mywork {
       public static void main(String[] args) {
        Scanner save = new Scanner (System. in);
         System.out.println("Enter the name of the patient");
        String patient =save.nextLine();
        
        System.out.println("Enter the medicine of the patient");
        String medicine =save.nextLine(); 
                
        System.out.println("Enter the age of the patient");
        int age  =save.nextInt();
        
        System.out.println("Enter the price of the medicine");
        double price =save.nextDouble();
        
        System.out.println("Enter the duration of taking the medicine");
        int duration =save.nextInt();
        
        
        
}
    
}
