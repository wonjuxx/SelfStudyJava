package sec02.verify.exam05;

/*
for문을 이용해서 다음과 같이 *를 출력하는 코드를 작성해보세요.
*
**
***
****
 */
public class Exam05 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                if (j == i) {
                    System.out.println();
                }
            }
        }
    }
}
