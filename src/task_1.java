import java.util.Scanner;

public class task_1 {
    public static void main(String args[]) {
        first_task();
        second_task();
        third_task();
    }
    public static void first_task() {
        Scanner scanner = new Scanner(System.in);
        float a, b;

        System.out.print("Введіть перше число \'a\': ");
        a = scanner.nextFloat();
        System.out.print("Введіть перше число \'b\': ");
        b = scanner.nextFloat();

        float result = a + ( (a + b - 1) / ((float)Math.pow(a, 2) + 2) ) - ((float)Math.pow((a*b), 3));

        System.out.println("Результат: " + result);
    }
    public static void second_task() {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        System.out.print("Введіть перше число \'a\': ");
        a = scanner.nextInt();
        System.out.print("Введіть перше число \'b\': ");
        b = scanner.nextInt();

        float result = a + ( (a + b - 1) / ((float)Math.pow(a, 2) + 2) ) - ((float)Math.pow((a*b), 3));

        System.out.println("Результат: " + result);
    }
    public static void third_task() {
        Scanner scanner = new Scanner(System.in);
        float a, b;

        System.out.print("Введіть перше число \'a\': ");
        a = scanner.nextFloat();
        System.out.print("Введіть перше число \'b\': ");
        b = scanner.nextFloat();

        int result = (int)(a + ( (a + b - 1) / ((int)Math.pow(a, 2) + 2) ) - ((int)Math.pow((a*b), 3)));

        System.out.println("Результат: " + result);
    }
}

// 1) вхідні дані дійсного типу, результат – дійсного;
// 2) вхідні дані цілого типу, результат – дійсного;
// 3) вхідні дані дійсного типу, результат – цілого;