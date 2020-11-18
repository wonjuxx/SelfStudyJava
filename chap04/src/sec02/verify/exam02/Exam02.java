package sec02.verify.exam02;    //for문을 이용한 1부터 100까지의 정수 중 3의 배수 총합 구하기

public class Exam02 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("3의 배수의 합: " + sum);
    }
}
