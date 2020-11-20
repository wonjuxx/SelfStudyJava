package sec02.verify.exam06;

/*
다음은 키보드로부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는
프로그램입니다. 실행결과를 보고 알맞게 작성해보세요.
 */

import java.util.Scanner;

public class Exam06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int[] scores = null;
        int studentNum = 0;

        while (run) {
            System.out.println("------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택> ");

            int selectNum = Integer.parseInt(scanner.nextLine());

            if (selectNum == 1) {
                System.out.print("학생수> ");
                studentNum = Integer.parseInt(scanner.nextLine());
                scores = new int[studentNum];
            } else if (selectNum == 2) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.print("scores[" + i + "]> ");
                    scores[i] = Integer.parseInt(scanner.nextLine());
                }
            } else if (selectNum == 3) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.println("scores[" + i + "]> " + scores[i]);
                }
            } else if (selectNum == 4) {
                int max = 0;
                int sum = 0;
                double avg = 0;
                for (int i = 0; i < scores.length; i++) {
                    max = (max < scores[i] ? scores[i] : max);
                    sum += scores[i];
                }
                avg = (double) sum / scores.length;
                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + avg);
            } else if (selectNum == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
