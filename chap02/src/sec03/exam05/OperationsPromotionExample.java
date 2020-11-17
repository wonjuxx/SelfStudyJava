package sec03.exam05;

public class OperationsPromotionExample {
    public static void main(String[] args) {
        byte byteValue1 = 10;
        byte byteValue2 = 20;
        //byte byteValue3 = byteValue1 + byteValue2;    //byte 변수가 피연산자로 사용되면 int 타입으로 자동 변환되므로 int 변수에 저장
        int intValue1 = byteValue1 + byteValue2;
        System.out.println(intValue1);

        char charValue1 = 'A';
        char charValue2 = 1;
        //char charValue3 = charValue1 + charValue2;    //char 변수 또한 피연산자로 사용되면 int 타입으로 자동 변환
        int charValue3 = charValue1 + charValue2;
        System.out.println("유니코드=" + charValue3);
        System.out.println("출력문자=" + (char) charValue3);

        int intValue3 = 10;
        int intValue4 = intValue3 / 4;
        System.out.println(intValue4);

        int intValue5 = 10;
        //int intValue6 = 10 / 4.0;                     //컴파일 에러(incompatible types)
        double doubleValue = intValue5 / 4.0;
        System.out.println(doubleValue);

        int x = 1;
        int y = 2;
        double result = (double) x / y;                 //정수 타입을 실수 타입으로 변환. x, y 둘 중 최소 하나에 (double)
        System.out.println(result);
    }
}
