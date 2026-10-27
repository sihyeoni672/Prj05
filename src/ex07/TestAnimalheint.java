package ex07;

import ex07.Cat;
import ex07.Dog;

public class TestAnimalheint {
    public static void main(String[] args) {

        Dog lobe = new Dog();
        work(lobe, "로브");
        lobe.name = "로브";
        lobe.bark();
        lobe.eat();

        Cat army = new Cat();
        work(army, "아미");
        army.name = "아미";
        army.eat();
        army.meow();
    }

    private static void work(Cat army, String string) {

        army.name = string;
        army.eat();
        army.meow();
    }

    private static void work(Dog lobe, String string) {

        lobe.name = string;
        lobe.bark();
        lobe.eat();
    }
}