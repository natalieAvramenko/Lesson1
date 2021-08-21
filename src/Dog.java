public class Dog extends Animal {
    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;


    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("Бим пробежал метров");
    }
    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= MAX_SWIM_LENGTH))
            System.out.println("Бим проплыл метров");
        else
            System.out.println();
    }
}
