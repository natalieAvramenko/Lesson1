public class SecondLesson {
    public static void main(String[] args) {

        boolean flag = within10and20(3, 2);
        System.out.println(flag);

        isPositiveOrNegative(3);

        System.out.println(isNegative(-2));

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
        return b < 0;
      }

    public static void printWorldTimes(String world, int times) {
        for (int w = 2; w < times; w++) {
            System.out.println(world);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}

