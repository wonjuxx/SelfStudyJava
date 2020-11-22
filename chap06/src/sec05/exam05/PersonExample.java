package sec05.exam05;   //final 필드 테스트

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123456-1234567", "홍길동");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        //p1.nation = "usa";
        //p1.ssn = "654321-7654321";    //다시 출력하면 아래 name 변수는 바뀌지만 nation과 ssn은 final 필드라 컴파일 에러
        p1.name = "홍삼원";
    }
}
