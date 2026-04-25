package pet;
public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик");
        Dog dog1 = new Dog("Бобик");
        Cat cat2 = new Cat("Рыжик");
        Dog dog2 = new Dog("Бим");
        Bowl bowl = new Bowl(50);
        cat1.run(50);
        cat2.run(100);
        cat1.eat(12);
        cat2.eat(15);
        cat1.eat(bowl);
        bowl.addFood(20);
        cat1.eat(bowl);
        cat2.eat(bowl);
        bowl.addFood(20);
        cat2.eat(bowl);


        dog1.run(150);
        dog2.run(180);
        dog1.swim(3);
        dog2.swim(5);
        System.out.println("Всего животных: " + Animal.getCountAnimal());
        System.out.println("Всего котов: " + Cat.getCountCat());
        System.out.println("Всего собак: " + Dog.getCountDod());



    }
}
