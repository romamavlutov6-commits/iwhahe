package practice21;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Task4 {

    public static class DirectoryLister {

        public static List<String> getDirectoryContents(String directoryPath) {
            List<String> contents = new ArrayList<>();
            File directory = new File(directoryPath);

            if (!directory.exists()) {
                System.out.println("Ошибка: каталог не существует: " + directoryPath);
                return contents;
            }

            if (!directory.isDirectory()) {
                System.out.println("Ошибка: путь ведет к файлу, а не к каталогу: " + directoryPath);
                return contents;
            }

            // гет фаил
            File[] files = directory.listFiles();
            if (files == null) {
                System.out.println("Ошибка: невозможно прочитать содержимое каталога: " + directoryPath);
                return contents;
            }

            for (File file : files) {
                String type = file.isDirectory() ? "[DIR]  " : "[FILE] ";
                contents.add(type + file.getName());
            }

            return contents;
        }

        public static void printFirstNElements(List<String> list, int n) {
            if (list == null) {
                System.out.println("Ошибка: передан null список");
                return;
            }

            if (list.isEmpty()) {
                System.out.println("Список пуст");
                return;
            }

            System.out.println("Первые " + n + " элементов каталога:");
            int count = Math.min(n, list.size());

            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + list.get(i));
            }

            if (list.size() > n) {
                System.out.println("... и еще " + (list.size() - n) + " элементов");
            }
        }
    }

    public static void main(String[] args) {
        String currentDirectory = ".";

        System.out.println("Содержимое каталога: " + currentDirectory);

        List<String> directoryContents = DirectoryLister.getDirectoryContents(currentDirectory);
        DirectoryLister.printFirstNElements(directoryContents, 5);

        System.out.println("Всего элементов: " + directoryContents.size());

        System.out.println("\nошибки");
        List<String> wrongDir = DirectoryLister.getDirectoryContents("/несуществующий/каталог");
        DirectoryLister.printFirstNElements(wrongDir, 5);
    }
}
