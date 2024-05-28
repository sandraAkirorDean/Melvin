/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.helloworld;

/**
 *
 * @author DALL
 */
import java.util.Scanner;

public class poinofsales {
    public static void main(String[] args) {
        Scanner save = new Scanner (System. in);
        System.out.println("Enter the name of the product");
        String product =save.nextLine();
        
        System.out.println("Enter the price of the product");
        double price =save.nextDouble();
        
        System.out.println("Enter thequantity of the product");
        int qty =save.nextInt();
        double amount =price*qty;
        System.out.println("the client took " +qty +"of " +product + "at" +price + "each making total of " +amount);
        
        
        
        
        
        
        
        
    }
    
}
