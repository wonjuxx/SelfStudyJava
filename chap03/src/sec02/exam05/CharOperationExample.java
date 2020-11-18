package sec02.exam05;       //char 타입의 산술 연산

public class CharOperationExample {
    public static void main(String[] args) {
        char c1 = 'A' + 1;      //char c1 = 6; 으로 컴파일됨
        char c2 = 'A';
        //char c3 = c2 + 1;     //char 변수가 산술 연산에서 사용되면 int 타입으로 변환되어야 한다
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        //System.out.println("c3: " + c3);
    }
}
