abstract class Animal {

    abstract void eat();
    abstract void sleep();
}
class Lion extends Animal {

    @Override
    void eat() {
        System.out.println("Lion eats meat");
    }
    @Override
    void sleep() {
        System.out.println("Lion sleeps in the den");
    }
}
class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("Tiger eats meat");
    }

    @Override
    void sleep() {
        System.out.println("Tiger sleeps in the jungle");
    }
}
class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("Deer eats grass");
    }

    @Override
    void sleep() {
        System.out.println("Deer sleeps in the forest");
    }
}
public class abstract_class{
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Deer deer = new Deer();

        System.out.println("Lion:");
        lion.eat();
        lion.sleep();
        System.out.println();

        System.out.println("Tiger:");
        tiger.eat();
        tiger.sleep();
        System.out.println();

        System.out.println("Deer:");
        deer.eat();
        deer.sleep();
    }
}
