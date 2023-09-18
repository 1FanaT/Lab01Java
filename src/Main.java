import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість чисел (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Кількість чисел має бути більше 0.");
            return;
        }

        int max = Integer.MIN_VALUE; // Початкове значення для пошуку максимуму
        int min = Integer.MAX_VALUE; // Початкове значення для пошуку мінімуму

        for (int i = 0; i < n; i++) {
            System.out.print("Введіть число " + (i + 1) + ": ");
            int number = scanner.nextInt();

            if (number > max) {
                max = number; // Оновити максимум, якщо число більше поточного максимуму
            }

            if (number < min) {
                min = number; // Оновити мінімум, якщо число менше поточного мінімуму
            }
        }

        System.out.println("Найбільше число: " + max);
        System.out.println("Найменше число: " + min);
    }
}
