public class getandset {
    class Person{
        public String name;
        public int age;
        public int mob;
        
        public Person()
        {
        System.out.println("From Constructor");
        name = "Hello";
        age = 11;
        mob = 1234;
        }
        
        public Person(String name, int age, int mob) 
        {
        this.name = name;
        this.age = age;
        this.mob = mob;
        }
        }
        
        class LPU{
        public static void main(String args[])
        {
        //constructors
        Person p1 = new Person("John", 22, 123);
        Person p2 = new Person();
        Person p3 = new Person();
        System.out.println(p1.age);
        }
        }
}
