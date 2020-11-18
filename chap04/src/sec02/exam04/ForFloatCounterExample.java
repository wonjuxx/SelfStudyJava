package sec02.exam04;       //float 타입 카운터 변수

public class ForFloatCounterExample {
    public static void main(String[] args) {
        for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
            System.out.println(x);
        }
    }
}
/*
이론적으로 for문은 10번 반복해야 하지만 0.1은 float 타입으로 정확하게 표현할 수 없다
따라서 루프 카운터 변수 x에 더해지는 실제값은 0.1보다 약간 커서 루프는 9번만 실행
즉, 초기화식에서 루프 카운터 변수를 선언할 때 float 타입을 사용하지 말아야 한다
 */