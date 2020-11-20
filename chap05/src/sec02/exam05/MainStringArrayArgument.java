package sec02.exam05;   //main() 메소드의 매개 변수

public class MainStringArrayArgument {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("값의 수가 부족합니다.");
            System.exit(0);
        }

        String strNum1 = args[0];
        String strNum2 = args[1];

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}
/*
매개값 부여하는 방법은 Run/Edit Configurations 경로에서 Program arguments에 값을 넣으면 된다.
띄어쓰기를 통해 값 구분.
 */