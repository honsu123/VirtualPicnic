package test2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        File file = new File("input.txt"); 
        String longestWord = "";
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
            e.printStackTrace();
        }

        if (!longestWord.isEmpty()) {
            System.out.println("Самое длинное слово в файле: " + longestWord);
        } else {
            System.out.println("Файл пустой или не содержит слов.");
        }
    }
}