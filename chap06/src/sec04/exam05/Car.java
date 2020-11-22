package sec04.exam05;   //클래스 외부에서 메소드 호출

public class Car {
    //필드
    int speed;

    //생성자

    //메소드
    int getSpeed() {        //return 값이 필요하므로 타입변수 int
        return speed;
    }

    void keyTurnOn() {      //return 값이 필요없으므로 void
        System.out.println("키를 돌립니다.");
    }

    void run() {
        for (int i = 10; i <= 50; i+=10) {
            speed = i;
            System.out.println("달립니다.(시속:" + speed + "km/h)");
        }
    }
}
