package sec02.verify.exam06;

/*
for문을 이용해서 다음과 같이 *를 출력하는 코드를 작성해보세요.
   *
  **
 ***
****
 */
public class Exam06 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 4; j > 0; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}