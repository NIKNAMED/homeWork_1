public class methods {

    public static void printTreeWords() {
        System.out.println("Apple");
        System.out.println("Banana");
        System.out.println("Orange");
    }

    public static void checkSumSign() {
        int a = 200;
        int b = -7000;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Symma polowitelna");
        } else {
            System.out.println("symma otricatelna");
        }
    }

    public static void printColor() {
        int color = 1;
        if (color <= 0) {
            System.out.println("Red");
        } else if (color > 0 && color <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int a = 1;
        int b = 2;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static void checkSumInRange(int a, int b) {
        int summ = a + b;
        if (summ > 10 && summ <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void methodAcceptsPositiveNumber(int number) {
        if (number >= 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }

    public static boolean methodMustBackAnyResult(int number) {
        boolean b = number < 0;
        System.out.println(b);
        return b;
    }

    public static void showStringResult(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    static public void visocostnyiOrNot(int d) { //переделать
        switch (d) {
            case 2:
                System.out.println("dvey 28 v mesace");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("kol vo 30");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("kol vo 31");
                break;
            default:
                System.out.println("месяца нет ");
        }
    }

    public static void integreMassive() {
        int array[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void emptyIntegerMassive() {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

    public static void massiveMultiplication() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    public static void squareMassive() {
        int n = 3;

        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            array[i][i] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] getTwoArguments(int len, int initialValue) {
        int [] arr = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = initialValue;
            System.out.println(len+ " " + " " + initialValue);
        }
        return arr;
    }
}
