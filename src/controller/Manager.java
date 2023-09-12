/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;
import model.Count;
import view.Menu;


public class Manager extends Menu<String>{         
    private Count count= new Count();
    private Scanner sc= new Scanner(System.in);
    
    public Manager(String title,String[] s){
        super(title, s);
    }
    
    @Override
    public void execute(int n) {
       
        switch (n) {
            case 1:  
                 System.out.println("Enter your content: ");
                    String content= sc.nextLine();
                count.countLetter(content);                
                break;
            case 2:   
                 System.out.println("Enter your content: ");
                    String contents= sc.nextLine();
                count.countCharacter(contents);
                break;
            case 3:
                System.exit(0);
                
        }
                
    }
    
}
