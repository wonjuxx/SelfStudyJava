package sec01.exam06.wonju;

public class PhoneExample {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone(12121);

        phone.turnOn();
        phone.turnOff();
        phone.search();
        phone.gameOn();
//        System.out.println(phone.model);


//        String modelName = toStringFromInt(phone.getModelName());
        String modelName = extractModelNameFromSmartPhone(phone);

//        String modelName = Integer.toString(phone.getModelName());
        System.out.println(modelName);

//        send(modelName);
    }

    static String toStringFromInt(int model) {
        return Integer.toString(model);
    }

    static String extractModelNameFromSmartPhone(SmartPhone phone) {
        return toStringFromInt(phone.getModelName());
    }
}
