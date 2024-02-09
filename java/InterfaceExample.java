interface InterfaceExample {
    void testSwitchable(switchable device);
}

class MainClass implements InterfaceExample {
    public static void main(String[] args) {
        MainClass main = new MainClass();
        main.testDevices();
    }

    @Override
    public void testSwitchable(switchable device) {
        device.turnOn();
        device.turnOff();
    }

    public void testDevices() {
        // Testing fan
        Fan fan = new Fan();
        System.out.println("Testing fan:");
        testSwitchable(fan);

        // Testing TV
        Tv tv = new Tv();
        System.out.println("\nTesting TV:");
        testSwitchable(tv);
    }
}

interface switchable {
    void turnOn();

    void turnOff();
}

class Fan implements switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is off");
    }
}

class Tv implements switchable {
    @Override
    public void turnOn() {
        System.out.println("TV is on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is off");
    }
}
