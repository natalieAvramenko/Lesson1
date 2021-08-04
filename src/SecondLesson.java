public class SecondLesson {
    public static void main(String[] args) {

        boolean flag = within10and20(3, 2);
        System.out.println(flag);

        isPositiveOrNegative(3);

        isNegative(-2);

        printWorldTimes("World times.", 3);

        boolean isLeap = isLeapYear(2020);
        System.out.println(isLeap);

    }

    public static boolean within10and20(int x, int y) {
        return ((x + y) >= 10 && (x + y) <= 20);
    }

    public static void isPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Это положительное число");
        } else if (a < 0) {
            System.out.println("Это отрицательное число");
        }
    }

    public static boolean isNegative(int b) {
        if (b >= 0) {
            System.out.println(false);
        } else if (b < 0) {
            System.out.println(true);
        }
        return true;
    }

    public static void printWorldTimes(String world, int times) {
        for (int w = 2; w < 3; w++) {
            System.out.println("World times.");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}

