package sec02.exam04;

public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A';          //문자를 직접 저장
        char c2 = 65;           //10진수로 저장
        char c3 = '\u0041';     //16진수로 저장. '백슬래시u' 표현은 유니코드 표현법일 뿐 char의 16진수 '0x' 표현과 같다

        char c4 = '가';          //문자를 직접 저장
        char c5 = 44032;        //10진수로 저장
        char c6 = '\uac00';     //16진수로 저장

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
    }
}
