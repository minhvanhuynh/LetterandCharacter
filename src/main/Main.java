/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.Manager;
import view.Menu;


public class Main {
    public static void main(String[] args) {
        String title= "Programing Counting Letter and Character";
        String[] s= new String[] {"Counting Letter", "Counting Character","Exit"};
        Menu<String> menu= new Manager(title, s);
        menu.run();
    }
}
