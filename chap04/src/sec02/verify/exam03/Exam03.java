package sec02.verify.exam03;

/*
while문과 Math.random() 메소드를 이용해서 2개의 주사위를 던졌을 때 나오는 눈을
(눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면
실행을 멈추는 코드를 작성해보세요. 눈의 합이 5가 되는 조합은 (1, 4), (4, 1), (2, 3), (3, 2)입니다.
 */
//public class Exam03 {
//    public static void main(String[] args) {
//        int dice1 = (int) (Math.random() * 6) + 1;
//        int dice2 = (int) (Math.random() * 6) + 1;
//
//        while (dice1 + dice2 != 5) {
//            System.out.println("(" + dice1 + ", " + dice2 + ")");
//            dice1 = (int) (Math.random() * 6) + 1;
//            dice2 = (int) (Math.random() * 6) + 1;
//        }
//        System.out.println("(" + dice1 + ", " + dice2 + ")");
//    }
//}
public class Exam03 {
    public static void main(String[] args) {
        while (true) {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            System.out.println("(" + dice1 + ", " + dice2 + ")");
            if ((dice1 + dice2) == 5) {
                break;
            }
        }
    }
}
