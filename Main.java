import java.util.Scanner;
class vehicle {
    private int idnumber;
    private int max_Speed;

    public void setdetail(int idnumber,int max_Speed){
        this.idnumber=idnumber;
        this.max_Speed=max_Speed;
    }
    public void getdetail(){
        System.out.println(idnumber);
        System.out.println(max_Speed);
    }
}
class car extends vehicle{
    private int no_pass;
    public void setno_pass(int no_pass){
        this.no_pass=no_pass;
    }
    public void getno_pass(){
        System.out.println(no_pass);
    }
}
class truck extends vehicle{
    private int weight;
    public void set_weight(int weight){
        this.weight=weight;
    }
    public void get_weight(){
        System.out.println(weight);
    }
}

public class Main{
    public static void main(String[] args){
        Scanner myobj=new Scanner(System.in);
        int id=myobj.nextInt();
        int max=myobj.nextInt();
        int no=myobj.nextInt();
        int weight=myobj.nextInt();
        truck m1=new truck();
        car m2=new car();
        m2.setno_pass(no);
        m1.set_weight(weight);
        m2.getno_pass();
        m1.get_weight();
    }
}
