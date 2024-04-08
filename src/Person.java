//public class Person {
//    String name;
//    int age;
//    public Person(String name,int age){
//        this.name=name;
//        this.age=age;
//
//    }
//    public void walk(){
//        System.out.println(name+" is walking........");
//    }
//    public void age(){
//        System.out.println(name+ " is " + age);
//    }
//}
//
//class One {
//    public void firstName(){
//        System.out.print(" Hello ");
//    }
//}
//class Two extends One {
//    public void lastName(){
//        System.out.print(" Beb");
//    }
//}
//class Person{
//    private int id;
//    private String name;
//    public void setId(int id){
//        this.id=id;
//    }
//    public void setName(String name){
//        this.name=name;
//    }
//    public int getId(){
//        return id;
//
//    }
//    public String getName(){
//        return name;
//
//    }


import org.w3c.dom.ls.LSOutput;

//}
class Person{
    public void name(){
        System.out.println("Soklay");
    }
}
class Student extends Person{
    public void id(){
        System.out.println(2);
    }
}
class Mnos extends Student{
    public void position(){
        System.out.println("ey kor bn");
    }

}
