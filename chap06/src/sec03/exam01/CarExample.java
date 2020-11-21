package sec03.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("검정", 3000);
        //Car myCar = new Car(); 는 안됨. 이미 명시적으로 생성자를 선언해서 기본 생성자를 호출할 수 없음
    }
}
