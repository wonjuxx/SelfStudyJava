package sec06.exam04.package1;  //생성자의 접근 제한

public class A {
    //필드
    A a1 = new A(true);     //(o)
    A a2 = new A(1);        //(o)
    A a3 = new A("문자열");   //(o)

    //생성자
    public A(boolean b) {   //public 접근 제한
    }

    A(int b) {              //default 접근 제한
    }

    private A(String b) {   //private 접근 제한
    }
}
