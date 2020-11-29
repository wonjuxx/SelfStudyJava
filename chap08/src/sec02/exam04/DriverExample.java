package sec02.exam04;   //객체 타입 확인

import sec02.exam02.Taxi;
import sec02.exam03.Bus;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);
    }
}
