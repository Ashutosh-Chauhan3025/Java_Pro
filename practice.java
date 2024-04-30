interface Flyable {
    void fly_obj();
}
class Spacecraft implements Flyable {
    public void fly_obj() {
        System.out.println("Spacecraft");
    }
}
class Airplane implements Flyable {
    public void fly_obj() {
        System.out.println("Airplane");
    }
}
class Helicopter implements Flyable {
    public void fly_obj() {
        System.out.println("Helicopter");
    }
}
public class practice {
    public static void main(String[] args) {
        Spacecraft spacecraft = new Spacecraft();
        Airplane airplane = new Airplane();
        Helicopter helicopter = new Helicopter();

        spacecraft.fly_obj();
        airplane.fly_obj();
        helicopter.fly_obj();
    }
}
