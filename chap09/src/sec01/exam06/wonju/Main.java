package sec01.exam06.wonju;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();

        sound(animal);
    }

    public static void sound(Animal animal) {
        animal.sound();
    }
}
