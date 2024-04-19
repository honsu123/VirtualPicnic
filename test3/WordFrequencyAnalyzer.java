package test3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyAnalyzer {
    public static void main(String[] args) {
        File file = new File("input.txt");

        Map<String, Integer> wordFrequency = new HashMap<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase();
                word = word.replaceAll("[^a-zA-Zа-яА-Я]", ""); // Убираем все символы, оставляем только буквы
                if (!word.isEmpty()) {
                    wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
            e.printStackTrace();
        }

        System.out.println("Частота слов в файле:");

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
