package Codechef;
interface Simcard {
    void calling();
    void sms();
}

class JioSim implements Simcard {
    public void calling() {
        System.out.println("JioSim Calling");
    }

    public void sms() {
        System.out.println("JioSim SMS");
    }
}

class AirtelSim implements Simcard {
    public void calling() {
        System.out.println("AirtelSim Calling");
    }

    public void sms() {
        System.out.println("AirtelSim SMS");
    }
}

class ViSim implements Simcard {
    public void calling() {
        System.out.println("ViSim Calling");
    }

    public void sms() {
        System.out.println("ViSim SMS");
    }
}

class Mobile {
    void insertSim(Simcard s) {
        s.calling();
        s.sms();
    }
}

public class MobileUser {
    public static void main(String[] args) {
        Mobile samsung = new Mobile();
        samsung.insertSim(new JioSim());
        samsung.insertSim(new AirtelSim());
        samsung.insertSim(new ViSim());
    }
}
