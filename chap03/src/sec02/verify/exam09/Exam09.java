package sec02.verify.exam09;

import java.util.Scanner;

public class Exam09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 수: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.println("두 번째 수: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        System.out.println("---------------------");

        double result = num1 / num2;
        if(num2 != 0.0) {
            System.out.println("결과:" + result);
        } else {
            System.out.println(("결과:무한대"));
        }
    }
}
