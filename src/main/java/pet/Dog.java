package pet;

public class Dog extends Animal {
    String name;
    static int countDod = 0;

    Dog(String name) {
        super();
        countDod++;
        this.name = name;
    }

    @Override
    void run(int range) {
        if (range > 500) {
            System.out.println(name + " не может пробежать больше чем 500 м.");
        } else {
            System.out.println(name + " пробежит " + range + " м.");
        }

    }

    @Override
    void swim(int range) {
        if (range > 10) {
            System.out.println("Собаки не могут проплыть больше чем " + range + " м.");
        } else {
            System.out.println(name + " проплыла " + range + " м.");
        }
    }

    static int getCountDod() {
        return countDod;
    }
}
