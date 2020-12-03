package sec01.exam06.wonju;

public class Bmw extends Car {

    private String name;

    public Bmw(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("BMW 입니다.");
    }

    public void printName() {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }
}
