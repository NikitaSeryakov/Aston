import java.util.Arrays;

public class lesson2 {
    static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        sumNumbers(8, 6);
        checkNumber(-10);
        numberClass(6);
        methodText();
        year(5);
        arrayPract();
        bigArray();
        mathArrays();
        array13();
        arrayLen(45, 12);
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 2;
        int b = -4;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers() {
        int a = 12;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    static boolean sumNumbers(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }


    static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }

    }

    static boolean numberClass(int a) {
        return a < 0;
    }

    static void methodText() {
        for (int i = 3; i < 8; i++) {
            System.out.println("Строка");
        }

    }

    static boolean year(int a) {
        return (a % 4 == 0 && a % 100 != 0) && (a % 400 == 0);
    }

    static void arrayPract() {
        int[] arr = {1, 0, 1, 0, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void bigArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));

    }

    static void mathArrays() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void array13() {
        int a = 3;
        int[][] arr = new int[3][3];
        for (int i = 0; i < a; i++) {
            arr[i][i] = 1;
            arr[i][a - 1 - i] = 1;
        }
    }

    static int[] arrayLen(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;

    }
}





