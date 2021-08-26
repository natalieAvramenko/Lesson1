public class Cat1 {
    private boolean isFull;
    private String name;
    private int appetite;

    public Cat1(String name, int appetite) {
        isFull = false;
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (plate.hasEnoughFoodFor(appetite) && !isFull) {
            System.out.println(name + " кушает.");
            plate.decreaseFood(appetite);
            isFull = true;
        } else if (!plate.hasEnoughFoodFor(appetite)) {
            System.out.println(name + " еды не хватило!");
        } else if (isFull) {
            System.out.println(name + " довольно и сыто урчит!");
        }
    }
}

