package sec01.exam04;   //인터페이스 변수에 구현 객체 대입

public class RemoteControl {
    public static void main(String[] args) {
        sec01.exam03.RemoteControl rc;
        rc = new Television();
        rc = new Audio();
    }
}
