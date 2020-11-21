package sec01.exam01;   //클래스로부터 객체 생성

class Student{  //일반적으로 소스 파일당 하나의 클래스를 선언하지만 2개 가능. 대신 소스 파일이 2개 생성.
}

public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("s1 변수가 Student 객체를 참조합니다.");

        Student s2 = new Student();
        System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
    }
}