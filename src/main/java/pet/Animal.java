package pet;
public abstract class Animal {
    static int countAnimal = 0;

    Animal() {
        countAnimal++;
    }

    void run(int range) {
        System.out.println("Животное пробежит " + range + " м.");
    }

    void swim(int range) {
        System.out.println("Животное проплывет " + range + " м.");
    }

    public static int getCountAnimal() {
        return countAnimal;
    }

    void eat(int food) {
        System.out.println("Животное покушало " + food);
    }
}


