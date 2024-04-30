import java.util.TreeSet;

public class set{
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        int givenNumber = 25;
        int result=0;
        TreeSet<Integer> set2= new TreeSet<>(); 
        for (Integer element : treeSet) {
            if (element >= givenNumber) {
                set2.add(element);
                result=result+1;
            }
        }
        
        if (result >= 0) {
            for(int i:set2){
                System.out.println(i);
            }
        } else {
            System.out.println("NULL");
        }
    }
}
