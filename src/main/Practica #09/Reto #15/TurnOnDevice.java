interface Connectable {
    public void turnOn();

    public void turnOff();

    public boolean  isOn();
}

class Lamp implements Connectable {
    @Override
    public void turnOff() {
        System.out.println("Turning off the Lamp..");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on the Lamp..");

    }

    @Override
    public boolean isOn() {
        return true;
    }

}

class Computer implements Connectable {
    @Override
    public void turnOff() {
        System.out.println("Turning off the computer..");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on the computer..");

    }

    @Override
    public boolean  isOn() {
        return true;
    }
}

class CoffeMaker {
    public void on() {
        System.out.println("Turning on the Coffe Maker..");

    };

    public void off() {
        System.out.println("Turning off the Coffe Maker..");

    };

    public boolean isOff() {
        return false;

    }
}

class AdapterCoffeMaker implements Connectable {
    private final  CoffeMaker coffeMaket;

    public AdapterCoffeMaker(CoffeMaker object) {
        this.coffeMaket = object;
    }

    @Override
    public void turnOff() {
       this.coffeMaket.off();
    }

    @Override
    public void turnOn() {
        this.coffeMaket.on();

    }

    @Override
    public boolean  isOn() {
        return !this.coffeMaket.isOff();
    }

}

public class TurnOnDevice {

    public static void main(String[] args) {

        turnOnDevice(new Lamp());
        turnOnDevice(new Computer());
        turnOnDevice(new AdapterCoffeMaker(new CoffeMaker()));
    }

    private static void turnOnDevice(Connectable device) {
        device.turnOn();
        System.out.println(device.isOn());
    }
}