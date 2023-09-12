/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author THAYCACAC
 */
public class Count {

    private Map<Character, Integer> charCounter
            = new HashMap<Character, Integer>();

    private Map<String, Integer> wordCounter
            = new HashMap<String, Integer>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your content: ");
        String content = scanner.nextLine();

        Count counter = new Count();
        counter.analyze(content);
        counter.display();
    }

    public void display() {
        System.out.println(wordCounter);
        System.out.println(charCounter);
    }

    public void analyze(String content) {
        for (char ch : content.toCharArray()) { 
            System.out.println(ch);
            if (Character.isSpaceChar(ch)) {
                continue;
            }
            if (!charCounter.containsKey(ch)) {
                charCounter.put(ch, 1);
            } else {
                charCounter.put(ch, ((int) charCounter.get(ch)) + 1);
            }
        }
        StringTokenizer tokenizer = new StringTokenizer(content);
        
        while (tokenizer.hasMoreTokens()) {            
            String token = tokenizer.nextToken();           
            if (!wordCounter.containsKey(token)) {
                wordCounter.put(token, 1);
            } else {
                wordCounter.put(token, ((int) wordCounter.get(token)) + 1);
            }
        }
    }
}
