package sec02.exam04;   //매개 변수로 다른 객체를 제공해도 메소드를 다르게 실행한다

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);
        driver.drive(taxi);
    }
}
