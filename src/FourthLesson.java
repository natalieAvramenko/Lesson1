import java.util.Random;
import java.util.Scanner;

public class FourthLesson {

    //1. Полностью разобраться с кодом, попробовать переписать с нуля,
    // стараясь не подглядывать в методичку.
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 2;

    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final char DOT_EMPTY = '.';

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (isWinner(DOT_X))
            {
                System.out.println("Победил игрок!");
                break;
            }
            if (isMapFull())
            {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (isWinner(DOT_O)) {
                System.out.println("Победил компьютер!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }

        }
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x;
        int y;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите координаты в формате Х и У");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));

        map[y][x] = DOT_X;
    }

    public static void aiTurn() {
        int x;
        int y;
        Random rand = new Random();
        do {
            System.out.println("Введите координаты в формате Х и У");
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));

        map[y][x] = DOT_O;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > +SIZE || y >= SIZE) {
            return false;
        }
        if (map[y][x] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    public static boolean isWinner(char symb)
    {
        int endOfOffset = map.length - DOTS_TO_WIN;

        for (int rowOffset = 0; rowOffset <+ endOfOffset; rowOffset++)
        {
            if (isDiagonalsFillWith(symb, rowOffset))
            {
                return true;
            }
            for (int columnOffset = 0; columnOffset <= endOfOffset; columnOffset++)
            {
                boolean hasWin = isLinesFilledWith(symb, rowOffset, columnOffset);

                if (hasWin)
                {
                    return true;
                }
            }
        }
        return false;
    }
    static boolean isLinesFilledWith(char symb, int rowOffset, int columnOffset) {
        for (int row = rowOffset; row < (DOTS_TO_WIN + rowOffset); row++) {
            int horizontalWinCounter = 0;
            int verticalWinCounter = 0;

            for (int column = columnOffset; column < (DOTS_TO_WIN + columnOffset); column++) {
                if (map[row][column] == symb) {
                    horizontalWinCounter++;
                } else {
                    horizontalWinCounter = 0;
                }
                if (map[column][row] == symb) {
                    verticalWinCounter++;
                } else {
                    verticalWinCounter = 0;
                }
            }
            if ((horizontalWinCounter == DOTS_TO_WIN) || (verticalWinCounter == DOTS_TO_WIN)) {
                return true;
            }
        }
        return false;
    }
    static boolean isDiagonalsFillWith(char symb, int rowOffset)
    {
        int mainDiagonalCounter = 0;
        int sideDiagonalCounter = 0;

        final int subSquareLength = (DOTS_TO_WIN + rowOffset);

        for (int row = rowOffset; row < subSquareLength; row++)
        {
            if (map[row][row] == symb)
            {
                mainDiagonalCounter++;
            }
            else
            {
                mainDiagonalCounter = 0;
            }
            if (map[row][map.length - 1 - row] == symb)
            {
                sideDiagonalCounter++;
            }
            else
            {
                sideDiagonalCounter = 0;
            }
        }
        return (mainDiagonalCounter == DOTS_TO_WIN) || (sideDiagonalCounter == DOTS_TO_WIN);
    }
    static boolean isMapFull()
    {
        for (int row = 0; row < SIZE; row++)
        {
            for (int column = 0; column < SIZE; column++)
            {
                if (map[row][column] == DOT_EMPTY)
                {
                    return false;
                }
            }
        }
        return true;
    }
}

