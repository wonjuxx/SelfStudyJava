package sec01.exam06;   //인터페이스 사용

import sec01.exam03.RemoteControl;
import sec01.exam04.Audio;
import sec01.exam04.Television;

public class MyClass {
    //필드
    RemoteControl rc = new Television();    //인터페이스가 필드 타입으로 사용될 경우, 필드에 구현 객체를 대입

    //생성자
    public MyClass() {
    }

    public MyClass(RemoteControl rc) {      //인터페이스가 생성자의 매개 변수 타입으로 사용될 경우, 구현 객체를 생성자의 매개값으로 대입
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(5);
    }

    //메소드
    public void methodA() {
        RemoteControl rc = new Audio();     //인터페이스가 로컬 변수 타입으로 사용될 경우, 변수에 구현 객체를 대입
        rc.turnOn();
        rc.setVolume(5);
    }

    public void methodB(RemoteControl rc) { //인터페이스가 메소드의 매개 변수 타입으로 사용될 경우, 변수에 구현 객체를 대입
        rc.turnOn();
        rc.setVolume(5);
    }
}
