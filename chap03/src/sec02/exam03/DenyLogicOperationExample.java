package sec02.exam03;       //논리 부정 연산자

public class DenyLogicOperationExample {
    public static void main(String[] args) {
        boolean play = true;
        System.out.println(play);

        play = !play;
        System.out.println(play);

        play = !play;
        System.out.println(play);
    }
}
