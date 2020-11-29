package sec02.exam04;   //객체 타입 확인 instanceof

import sec02.exam03.Bus;
import sec02.exam03.Vehicle;

public class Driver {
    public void drive(Vehicle vehicle) {
        if (vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle;
            bus.checkFare();
        }
        vehicle.run();
    }
}
