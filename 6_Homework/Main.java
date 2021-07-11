import java.io.*;
import java.text.Collator;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\maxim\\IdeaProjects\\6_Homework\\src\\main\\resources\\array.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<>();
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                lines.add(word);
            }
        }
        bufferedReader.close();

        Collections.sort(lines, Collator.getInstance());
        System.out.println("Отсортированный набор слов: " + lines);

        String prevElement = "";
        int countFrequency = 0;
        String maxWord = "";

        for (String element: lines) {
            // сравниваем текущий элемент сортированной коллекции с предыдущим, чтобы выводить инфо только для уникальных слов
            if (!element.equals(prevElement)) {
                prevElement = element;
                System.out.println("Слово " + element + " встречается " + Collections.frequency(lines, element) + " раз.");
                // находим слово с максимальным количеством повторений
                if (Collections.frequency(lines, element) > countFrequency) {
                    countFrequency = Collections.frequency(lines, element);
                    maxWord = element;
                }
            }
        }
        System.out.println("Максимальное количенство повторений обнаружено у слова '" + maxWord + "'. Оно встретилось " + countFrequency + " раз.");
    }
}