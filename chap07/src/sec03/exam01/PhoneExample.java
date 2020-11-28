package sec03.exam01;   //실행 클래스

public class PhoneExample {
    public static void main(String[] args) {
        //Phone phone = new Phone();    //추상 클래스는 생성자를 호출해서 객체를 생성할 수 없음

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
