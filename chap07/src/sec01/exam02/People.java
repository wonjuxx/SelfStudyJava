package sec01.exam02;   //부모 클래스

/*
People 클래스처럼 기본 생성자가 없고 name과 ssn을 매개값으로 받아 객체를 생성시키는
생성자만 있는 부모 클래스는, 상속하는 클래스에서 반드시 super(매개값, ...) 형식으로
부모 생성자를 명시적으로 호출해야한다.
 */
public class People {
    public String name;
    public String ssn;

    public People(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}
