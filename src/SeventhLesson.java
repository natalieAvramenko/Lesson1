import jdk.nashorn.internal.ir.CatchNode;

public class SeventhLesson {
    public static void main(String[] args) {
       Cat1[] cats = {
               new Cat1("Лиса", 10),
               new Cat1("Барсик", 6),
               new Cat1("Сойер", 10)
       };

       Plate plate = new Plate(25);

       for (Cat1 cat1 : cats) {
           cat1.eat(plate);
       }
       plate.increaseFood(40);
       for (Cat1 cat1 : cats) {
           cat1.eat(plate);
       }
    }
}
