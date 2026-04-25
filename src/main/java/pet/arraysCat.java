package pet;

public class arraysCat {
    public static void main(String[] args) {
        Bowl sharedBowl = new Bowl(40);

        Cat[] cats = new Cat[]{
                new Cat("Мурзик"),
                new Cat("Барсик"),
                new Cat("Васька"),
                new Cat("Рыжик"),
                new Cat("Дымок")
        };
        System.out.println("В миске: " + sharedBowl.getFoodAmount() + " еды.");
        for (Cat cat : cats) {
            cat.eat(sharedBowl);
        }
        System.out.println("В миске осталось: " + sharedBowl.getFoodAmount() + " еды.");
    }
}



