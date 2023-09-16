import java.util.Scanner;
import java.util.Random;

public class task_2 { // №10

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length_A, length_B;

        length_A = setLength_A();
        length_B = setLength_B();

        int[] array_A = new int[length_A];
        int[] array_B = new int[length_B];
        int[] array_C;


        fillArray(array_A);
        fillArray(array_B);
        array_C = fillArrayNew(array_A, array_B);

        System.out.println("Масив \'A\':");
        for(int element : array_A) {
            System.out.print(element + " ");
        }
        scanner.nextLine();
        System.out.println("Масив \'B\':");
        for(int element : array_B) {
            System.out.print(element + " ");
        }
        scanner.nextLine();
        System.out.println("Масив \'C\':");
        for(int element : array_C) {
            System.out.print(element + " ");
        }

    }

    public static int setLength_A() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть довжину \'першого\' масиву: ");
        do{
            int length = scanner.nextInt();
            if(length <= 0 || length > 400) {
                System.out.print("Ви ввели хибне значення! Повторіть ввід даних: ");
            }else {
                return length;
            }
        }while(true);
    }
    public static int setLength_B() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть довжину \'другого\' масиву: ");
        do{
            int length = scanner.nextInt();
            if(length <= 0 || length > 200) {
                System.out.print("Ви ввели хибне значення! Повторіть ввід даних: ");
            }else {
                return length;
            }

        }while(true);
    }
    public static void fillArray(int[] array) {
        Random random= new Random();

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }
    }

    public static int[] fillArray(int[] array_A, int[] array_B) {
        int[] newArray = new int[array_A.length + array_B.length];
        int newArrayLength = 0;

        for(int i = 0; i < array_A.length; i++) {
            boolean isUniq = true;
            for(int f = 0; f < array_B.length; f++) {
                if(array_A[i] == array_B[f]) {
                    isUniq = false;
                    break;
                }
            }

            if(isUniq) {
                newArray[newArrayLength] = array_A[i];
                newArrayLength++;
            }
        }

        for(int i = 0; i < array_B.length; i++) {
            boolean isUniq = true;
            for(int f = 0; f < array_A.length; f++) {
                if(array_B[i] == array_A[f]) {
                    isUniq = false;
                    break;
                }
            }

            if(isUniq) {
                newArray[newArrayLength] = array_B[i];
                newArrayLength++;
            }
        }

        return newArray;
    }

    public static int[] fillArrayNew(int[] array_A, int[] array_B) {
        int newArrayLength = 0;
        for(int i = 0; i < array_A.length; i++) {
            boolean isUniq = true;
            for(int f = 0; f < array_B.length; f++) {
                if(array_A[i] == array_B[f]) {
                    isUniq = false;
                    break;
                }
            }

            if(isUniq) {
                newArrayLength++;
            }
        }

        for(int i = 0; i < array_B.length; i++) {
            boolean isUniq = true;
            for(int f = 0; f < array_A.length; f++) {
                if(array_B[i] == array_A[f]) {
                    isUniq = false;
                }
            }

            if(isUniq) {
                newArrayLength++;
            }
        }

        int[] newArray = new int[newArrayLength];
        newArrayLength = 0;

        for(int i = 0; i < array_A.length; i++) {
            boolean isUniq = true;
            for(int f = 0; f < array_B.length; f++) {
                if(array_A[i] == array_B[f]) {
                    isUniq = false;
                }
            }

            if(isUniq) {
                newArray[newArrayLength] = array_A[i];
                newArrayLength++;
            }
        }

        for(int i = 0; i < array_B.length; i++) {
            boolean isUniq = true;
            for(int f = 0; f < array_A.length; f++) {
                if(array_B[i] == array_A[f]) {
                    isUniq = false;
                }
            }

            if(isUniq) {
                newArray[newArrayLength] = array_B[i];
                newArrayLength++;
            }
        }
        return newArray;
    }
}