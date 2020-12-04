package sec01.exam01;   //NullPointerException String 객체 참조가 없는 상태

public class NullPointerException {
    public static void main(String[] args) {
        String data = null;
        System.out.println(data.toString());
    }
}
