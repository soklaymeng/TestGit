import java.util.Scanner;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int score = 0;
//        System.out.println("Enter Score: ");
//          score = sc.nextInt();
//          if (score>50 && score <=100){
//              System.out.println("Your are passed");
//          }
//          else {
//              System.out.println("You are failed ");
//          }
/////////////////////////////////
//        String name;
//        Scanner sc= new Scanner(System.in);
//
//         do {
//             System.out.print("Enter name:");
//             name = sc.nextLine();
//             if (Pattern.matches("[A-Za-z]+",name)){
//                 break;
//             }
//         }
//         while (true);
//    }
// //////////////////////////////////////////////
//        Scanner sc = new Scanner(System.in);
//        char [] seat= { '+','+','+','+','+'};
//        int num;
//        System.out.print("Enter number:");
//        num = sc.nextInt();
//        for ( int i =0; i <seat.length;i++){
//            System.out.println(seat[i]);
//            seat[num-1]='-';
//        }
//
//        int sum=0;
//        for (int i=1;i<=10;i++){
//            //sum+=i;
//            sum=sum+i;
//            System.out.println("Sum = "+sum);
//        }
//        int [ ] a = { 1,2,3,4,5};
//        int sum=0;
//        for (int i=0;i<a.length;i++){
//            sum+=a[i];
//
//        }
//        System.out.println(sum);
//    }
        /////////////////////////////////
//        Scanner sc= new Scanner(System.in);
//        int [] a= new int[3];
//             for(int i=0; i<a.length;i++){
//                 a[i]=1;
//                 System.out.println(a[i]);
//             }
//        System.out.println("Input number:");
//             int number = sc.nextInt();
//             a[number-1]=0;
//        System.out.println("=====================");
//        for(int i=0; i<a.length;i++){
//            System.out.println(a[i]);
//        }
        //////////////
//        int [] a = {0,1,0,1,1,1,0,1};
//        int av=0;
//        int un=0;
//        for(int i =0; i<a.length; i++){
//            if(a[i]==0){
//                un++;
//            } else
//                av++;
//        }
//        //System.out.println("Available = "+ av + "\t" +"Unavailable = "+un);
//        System.out.println("Available = " + av);
//        System.out.println("Unavailable = " + un);
//    }
//}
    ////////////TesT 1///////
//public static int calSquare(int num) {
//    return num * num;
//}
//    public static void main(String[] args) {
//    int number = 3;
//    int square = calSquare(number);
//    System.out.println("The square of " + number + " is: " + square);
//}
 ////////////////Test 2////////////
//public static int add(int a, int b) {
//    return a + b;}
//    public static void main(String[] args) {
//        int sum = add(2,4);
//        System.out.println(sum);}}

/////////////Test3///////
    ////user defined method ////
//public static int add(int num1,int num2) {
//    return num1+num2;
//
//}
/////////////Test Constructor////////
   public static void main(String[] args) {
//      Scanner sc= new Scanner(System.in);
//      System.out.print("Enter number : ");
//      double a =sc.nextInt();
//      System.out.print("Enter number : ");
//      double b =sc.nextInt();
//
//
//      Caculator cal= new Caculator(a,b);
//      cal.add();
//      cal.sub();
//      cal.multi();
//      cal.div();

//    int result= Caculator.sum(3,4);
//    float result1= Caculator.multi(7,8);
//    float result2= Caculator.div(40,8);
//    float result3=Caculator.sub(9,2);

//       System.out.println("Sum = "+result);
//       System.out.println("Multi = "+result1);
//       System.out.println("Div = "+ result2);
//       System.out.println("Sub = "+result3);
///////////Test Lg Construtor /////
//         Scanner sc = new Scanner(System.in);
//         double a,b;
//         System.out.print("Enter number: ");
//         a=sc.nextDouble();
//       System.out.print("Enter number: ");
//       b=sc.nextDouble();
//
//         Caculator cal=new Caculator(a,b);
//         cal.add();
      //////
//      Person person1 = new Person("Soklay",22);
//      person1.walk();
//      person1.age();
      /////////
//      Two a = new Two();
//      a.firstName();
//      a.lastName();
//////////////////////
//         Person person1= new Person();
//         person1.setId(2);
//         person1.setName("soklay");
//         System.out.println("person id = "+ person1.getId());
//         System.out.println("person name = "+ person1.getName());


//     Student stu= new Student();
//     stu.id();
//     stu.name();
       //////////////
//       Mnos mnos1= new Mnos();
//       mnos1.id();
//       mnos1.name();
//       mnos1.position();
      OverloadingExample example = new OverloadingExample();
      // Calling the first method
      int result1 = example.add(5, 10);
      System.out.println("add(int, int): " + result1);
      // Calling the second method
      double result2 = example.add(2.5, 3.0, 1.5);
      System.out.println("add(double, double, double): "+result2);}}










