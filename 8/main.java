//20. Подсчитать количество содержащихся в данном тексте знаков препинания.

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");

        String text = scanner.nextLine();
        int punctuationCount = countPunctuation(text);

        System.out.println("Количество знаков препинания: " + punctuationCount);
        scanner.close();
    }

    private static int countPunctuation(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (isPunctuation(c)) {
                count++;
            }
        }
        return count;
    }

    // Метод для проверки, является ли символ знаком препинания
    private static boolean isPunctuation(char c) {
        return c == '.' || c == ',' || c == '!' || c == '?' || c == ';' || c == ':' ||
                c == '-' || c == '—' || c == '"' || c == '\'' || c == '’' || c == '“' || c == '”';
    }
}