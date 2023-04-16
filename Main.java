import java.util.ArrayList;

/*Написати метод приймає стрінгу і друкує всі її унікальні значення з нового рядка.
Alexx9800*/

public class Main {
    public static void main(String[] args) {
        String strEx = "Alexx9800*";
        printUniqueChars(strEx);
    }

    public static void printUniqueChars(String str) {
        ArrayList<Character> uniqChar = new ArrayList<Character>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!uniqChar.contains(c)) {
                uniqChar.add(c);
            }
        }
        for (int i = 0; i < uniqChar.size(); i++) {
            System.out.println(uniqChar.get(i));
        }
    }
}