package sec02.exam03;   //강제 타입 변환

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        //vehicle.checkFare();      //Vehicle 인터페이스에는 checkFare() 없어서 실행 안됨

        Bus bus = (Bus) vehicle;    //강제 타입 변환

        bus.run();
        bus.checkFare();            //실행 가능
    }
}
