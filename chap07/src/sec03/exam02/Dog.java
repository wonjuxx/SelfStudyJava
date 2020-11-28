package sec03.exam02;   //추상 메소드 재정의

public class Dog extends Animal {
    public Dog() {
        this.kind = "포유류";
    }

    @Override                   //추상 메소드를 반드시 재정의. 하지 않으면 컴파일 에러
    public void sound() {
        System.out.println("멍멍");
    }
}
