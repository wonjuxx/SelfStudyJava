package sec02.verify.exam11;

import java.util.Scanner;

public class Exam11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("아이디:");
        String id = scanner.nextLine();

        System.out.println("패스워드:");
        String strPassword = scanner.nextLine();
        int password = Integer.parseInt(strPassword);

        if(id.equals("java")) {
            if(password == 12345) {
                System.out.println("로그인 성공");
            } else {
                System.out.println("로그인 실패:패스워드가 틀림");
            }
        } else {
            System.out.println("로그인 실패:아이디 존재하지 않음");
        }
    }
}
