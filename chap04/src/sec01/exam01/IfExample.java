package sec01.exam01;       //if문

public class IfExample {
    public static void main(String[] args) {
        int score = 93;

        if(score>=90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }

        if(score<90)
            System.out.println("점수가 90보다 작습니다.");       //실행할 문장이 하나밖에 없어서 중괄호 생략 가능
            System.out.println("등급은 B입니다.");
    }
}
