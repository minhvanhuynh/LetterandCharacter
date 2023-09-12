package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Count {

    private Map<Character, Integer> charCounter;
    private Map<String, Integer> wordCounter;
             
    
    
    public Count(){
        charCounter = new HashMap<Character, Integer>();
        wordCounter = new HashMap<String, Integer>(); 
    }
             
    public void countCharacter(String content) {
        for (char ch : content.toCharArray()) {             
            if (Character.isSpaceChar(ch)) {
                continue;
            }
            if (!charCounter.containsKey(ch)) {
                charCounter.put(ch, 1);
            } else {
                charCounter.put(ch, ((int) charCounter.get(ch)) + 1);
            }
        }
        System.out.println(charCounter);
    }
    public void countLetter(String content){
        StringTokenizer tokenizer = new StringTokenizer(content);        
        while (tokenizer.hasMoreTokens()) {            
            String token = tokenizer.nextToken();           
            if (!wordCounter.containsKey(token)) {
                wordCounter.put(token, 1);
            } else {
                wordCounter.put(token, ((int) wordCounter.get(token)) + 1);
            }
        }
        System.out.println(wordCounter);
    }
    
}
