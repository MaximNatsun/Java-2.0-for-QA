import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        int[] myArray = new int[20];
        System.out.println("Массив содержит цифры:");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 20 - 10);
            System.out.print(myArray[i] + " ");
        }

        // определение максимального отрицательного и минимального положительного элементов массива
        int max = -10;
        int min = 10;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 0 && myArray[i] > max) {
                max = myArray[i];
            }
            if (myArray[i] > 0 && myArray[i] < min) {
                min = myArray[i];
            }
        }
        System.out.printf("\nМаксимальный отрицательный элемент: %d. Минимально положительный элемент: %d", max, min);

        // заменяем значения переменных max и min в массиве myArray
        for (int i = 0; i < myArray.length; i++) {
             if (myArray[i] == max) {
                 myArray[i] = min;
             } else if (myArray[i] == min) {
                 myArray[i] = max;
             }
        }
        System.out.println("\nПоменяли местами. Теперь массив выглядит так:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}