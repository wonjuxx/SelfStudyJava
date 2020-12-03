package sec01.exam06.wonju;

public class SmartPhone implements Phone {
    private int model;


    public SmartPhone(int model) {
        this.model = model;
    }

    @Override
    public void turnOn() {
        System.out.println("폰 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }

    public void search() {
        System.out.println("인터넷을 검색합니다.");
    }

    public void gameOn() {
        System.out.println("게임을 실행합니다.");
    }

    public void printModel() {
        System.out.println(model);
    }

    public int getModelName() {
        return this.model;
    }
}
