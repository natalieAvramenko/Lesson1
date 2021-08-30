public class Cat extends Animal {
    private final int MAX_RUN_LENGTH = 200;
    private final int MAX_SWIM_LENGTH = 0;

    public void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) {
            System.out.println("Барсик пробежал " + length + " метров");
        } else {
            System.out.println();
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("Барсик не умеет плавать");
    }
}
