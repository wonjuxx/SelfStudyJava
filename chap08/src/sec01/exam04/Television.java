package sec01.exam04;   //구현 클래스

import sec01.exam03.RemoteControl;

public class Television implements RemoteControl {
    //필드
    private int volume;

    //turnOn() 추상 메소드의 실체 메소드
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    //turnOff() 추상 메소드의 실체 메소드
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    //setVolume() 추상 메소드의 실체 메소드
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME ) {   //인터페이스 상수를 이용해서 volume 필드의 값을 제한
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);
    }
}