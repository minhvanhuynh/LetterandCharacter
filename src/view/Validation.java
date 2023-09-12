/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;



public class Validation {
    private final static Scanner sc= new Scanner(System.in);
    
    public static int checkInputIntLimit(int min, int max){
        while(true){
            try{
                int birthDate= Integer.parseInt(sc.nextLine().trim());
                if(birthDate < min || birthDate > max)
                    throw new Exception();
                else return birthDate;             
            }catch(Exception e){
                System.out.println("Please input number in range ["+min+", "+max+"]!");
                System.out.println("Enter again: ");
            }
        }
    }
    
    public static String checkInputString() {
        while (true) {
            String string = sc.nextLine().trim();
            if (string.isEmpty()) {
                System.out.println("Not allowed empty!");
                System.out.println("Enter again; ");
            } else {
                return string;
            }
        }
    }

    
}