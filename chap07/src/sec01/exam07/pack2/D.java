package sec01.exam07.pack2;

/*
protected 제한자를 사용한 필드, 생성자, 메소드에 접근할 때 같은 패키지에 있다면 상관 없음
하지만 다른 패키지에 있다면 import 구문과 public[클래스] {super.();} 구문이 반드시 필요
필드나 메소드도 new 연산자로 직접 호출이 아니라 자식 생성자에서 호출
 */

import sec01.exam07.pack1.A;

public class D extends A {
    public D() {
        super();                //접근 가능
        this.field = "value";
        this.method();
    }
}
