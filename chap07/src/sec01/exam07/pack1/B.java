package sec01.exam07.pack1;

public class B {
    public void method() {
        A a = new A();          //모두 접근 가능
        a.field = "value";
        a.method();
    }
}
