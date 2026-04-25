package pet;

public class Cat extends Animal {
    String name;
    static int countCat = 0;
    private boolean isHungry = true;
    private int appitite = 15;

    Cat(String name) {
        super();
        countCat++;
        this.name = name;
    }

    @Override
    void run(int range) {
        if (range > 200) {
            System.out.println(name + " не может пробежать больше чем 200 м.");
        } else {
            System.out.println(name + " пробежит " + range + " м.");
        }
    }

    @Override
    void swim(int range) {
        System.out.println("Коты не умеют плавать");
    }

    static int getCountCat() {
        return countCat;
    }

    @Override
    void eat(int food) {
        if (food < appitite) {
            System.out.println("Кот не ест, еды мало");
        } else {
            System.out.println("Кот покушал " + food + " и теперь сыт");
        }
    }

    public void eat(Bowl bowl) {
        if (!isHungry) {
            System.out.println(name + " уже сыт.");
            return;
        }
        int foodInBowl = bowl.getFoodAmount();
        int appetite = 10;
        if (foodInBowl >= appetite) {
            bowl.takeFood(appetite);
            System.out.println(name + " съел " + appetite + " еды и наелся!");
            isHungry = false;
        } else {
            System.out.println("Еды мало");
        }
    }
}

