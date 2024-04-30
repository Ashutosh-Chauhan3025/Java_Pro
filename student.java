import java.util.ArrayList;
import java.util.Scanner;

public class student {
    static ArrayList<String> arr = new ArrayList<>();

    public static void addNames(String name) {
        arr.add(name);
    }

    public static void removeName(int index) {
        arr.remove(index);
    }

    public static void display() {
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String s = scan.next();
            addNames(s);
        }
        display();
    }
}
