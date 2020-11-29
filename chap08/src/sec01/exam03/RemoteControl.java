package sec01.exam03;   //추상 메소드 선언

public interface RemoteControl {
    //상수
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;

    //추상 메소드
    public void turnOn();   //인터페이스에 선언된 추상 메소드는 모두 public abstract 특성을 갖지만 생략 가능
    public void turnOff();
    public void setVolume(int volume);
}
