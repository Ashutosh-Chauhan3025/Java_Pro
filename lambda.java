@FunctionalInterface
interface A {
    void hello();
}

public class Lambda {
    public static void main(String[] args) {
        A obj = () -> System.out.println(obj.hello());
    }
}

