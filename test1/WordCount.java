package test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        // Указываем полный путь к файлу
        String filePath = "input.txt";
        File file = new File(filePath);

        // Переменная для хранения общего количества слов
        int wordCount = 0;

        try {
            // Создаем объект Scanner для чтения файла
            Scanner scanner = new Scanner(file);

            // Пока есть еще слова в файле
            while (scanner.hasNext()) {
                // Увеличиваем счетчик слов
                wordCount++;
                // Считываем следующее слово, чтобы продвинуть курсор
                scanner.next();
            }
            // Закрываем Scanner после использования
            scanner.close();

            // Выводим общее количество слов в файле
            System.out.println("Общее количество слов в файле: " + wordCount);
        } catch (FileNotFoundException e) {
            // Если файл не найден, выводим сообщение об ошибке
            System.out.println("Файл не найден: " + filePath);
            System.out.println("Почему то программа не видела файл со словами поэтому пришлось писать через полный путь к файлу (В 10 СТРОКЕ ПОМЕНЯТЬ ПУТЬ ФАЙЛА");
            File fileee = new File(".");
            for(String fileNames : fileee.list()) System.out.println(fileNames);

            e.printStackTrace();
        }
    }
}
