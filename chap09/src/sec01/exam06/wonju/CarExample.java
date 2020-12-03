package sec01.exam06.wonju;

public class CarExample {

    public static void main(String... aaa) {
        final Bmw car1 = new Bmw("666666");
        final Bmw car2 = createCar("name");

        String carName = car1.getName();

        System.out.println(carName);

//        car1.run();
//
//        run(car1);
//
//         new Benz().run();

//        run(car2);
    }

    static Bmw createCar(String name) {
        return new Bmw(name);
    }

    public static void run(Car car) {
        car.run();
    }
}
