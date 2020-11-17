package sec03.exam04;

public class LongOperationExample {
    public static void main(String[] args) {
        byte value1 = 10;
        int value2 = 100;
        long value3 = 1000L;
        long result = value1 + value2 + value3;
        System.out.println(result);     //정수 타입 중 허용 범위가 가장 큰 long 타입으로 자동 타입 변환
    }
}
