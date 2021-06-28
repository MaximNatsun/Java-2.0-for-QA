import java.util.Scanner;

/**
 * Класс выполняет арифметические операции (сложение, вычитание, деление, умножение) над двумя числами, а также выполняет поиск максимального элемента в массиве.
 *
 * @author Максим Нацун
 * @see #getMultiply(double, double) 
 * @see #getDifference(double, double) 
 * @see #getDivided(double, double) 
 * @see #getSum(double, double)
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Выберите, что выполнить: 1 — запустить выполнение калькулятора, 2 — поиск максимального слова в массиве");
        int choice = in.nextInt();

        if (choice == 1) {
            calcNumbers();
        } else if (choice == 2) {
            maxWord();
        } else {
            System.out.println("Необходимо было ввести 1 или 2.");
        }
    }

    /**
     * Void-метод, рассчитанный для выполнения арифметических операций (сложение, вычитание, деление, умножение) над двумя числами.
     */
    private static void calcNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = in.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = in.nextDouble();
        System.out.print("Введите оператор: ");
        String operator = in.next();


        // в зависимости от того, какой оператор ввел пользователь, осуществляем соответствующую операцию с двумя числами
        switch (operator) {
            case "*":
                System.out.printf("Результат произведения двух чисел: %.4f", getMultiply(num1, num2));
                break;
            case "/":
                System.out.printf("Результат частного двух чисел: %.4f", getDivided(num1, num2));
                break;
            case "+":
                System.out.printf("Результат суммы двух чисел: %.4f", getSum(num1, num2));
                break;
            case "-":
                System.out.printf("Результат разности двух чисел: %.4f", getDifference(num1, num2));
                break;
            default:
                System.out.print("Неизвестный оператор. Требуется ввести один из: * / + -");
        }
    }

    /**
     * Void-метод, который выполняет поиск максимального элемента в массиве и выводит этот элемент и его длину
     */
    private static void maxWord() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        // объявим массив, в который будут записываться слова
        String[] stringArray = new String[size];
        // инициализируем переменную, которая будет хранить самое длинное слово
        String longWord = "";
        // инициализируем переменную, которая будет хранить количество символов в самом длинном слове
        int maxLength = 0;

        for (int i = 0; i < stringArray.length; i++) {
            System.out.printf("Введите слово %d: ", i+1);
            stringArray[i] = in.next();
            if (stringArray[i].length() > maxLength) {
                maxLength = stringArray[i].length();
                longWord = stringArray[i];
            }
        }
        // переменная count - служит счетчиком количества самых длинных слов, одинаковых по количеству символов
        int count = 0;
        // объявим массив, в который добавляются слова с одинаковым количеством символов
        String[] biggestArray = new String[size];
        for (int i = 0; i < stringArray.length; i++) {
                if (stringArray[i].length() == maxLength) {
                biggestArray[i] = stringArray[i];
                count += 1;
            }
        }
        if (count == 1) {
            System.out.printf("Самое длинное слово: %s. Его длина: %d", longWord, maxLength);
        } else if (count > 1) {
            System.out.println("Самые длинные слова: ");
            for (String element : biggestArray) {
                if (element != null) {
                    System.out.println(element);
                }
            }
            System.out.println("Их длина составила: " + maxLength);
        }
    }

    /**
     * Метод производит умножение двух чисел
     * @param num1 double
     * @param num2 double
     * @return double
     */
    private static double getMultiply(double num1, double num2) {
        return (num1 * num2);
    }

    /**
     * Метод производит деление первого числа на второе число
     * @param num1 double
     * @param num2 double
     * @return double
     */
    private static double getDivided(double num1, double num2) {
        return (num1 / num2);
    }

    /**
     * Метод производит сумму двух чисел
     * @param num1 double
     * @param num2 double
     * @return double
     */
    private static double getSum(double num1, double num2) {
        return (num1 + num2);
    }

    /**
     * Метод производит вычитание двух чисел
     * @param num1 double
     * @param num2 double
     * @return double
     */
    private static double getDifference(double num1, double num2) {
        return (num1 - num2);
    }
}