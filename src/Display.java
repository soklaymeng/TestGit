public class Display<T> {
    private  T data;
    public Display(T data){
        this.data=data;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public static void main(String[] args){
        Display<Integer> lek=new Display<>(23);
        System.out.println("Number of Integer : "+lek.getData());
        Display<String> stri=new Display<>("Hello babe ");
        System.out.println("Show String value: "+stri.getData());
    }
}
//class Calculator{
//            //<T,E,S,..> hav tha Type parameter
//            //theSum(T v1,T v2,T v3) hav tha Parameter type
//    public <T extends Number> double theSum(T v1,T v2,T v3){
//        return v1.doubleValue()+v2.doubleValue()+v3.doubleValue();
//    }
//    public <T extends Number> double multi(T v1, T v2){
//        return v1.doubleValue()*v2.doubleValue();
//    }
//    public <T extends Number> double div(T v1, T v2){
//        return v1.doubleValue()/v2.doubleValue();
//    }
//    public <T extends Number> double sub(T v1, T v2){
//        return v1.doubleValue() - v2.doubleValue();
//    }
//}
//       Calculator calculator= new Calculator();
//       System.out.println("=======================Results=====================");
//       System.out.println("Show subtract : "+calculator.sub(8,3));
//       System.out.println("Show add : "+calculator.theSum(2,6.4,9.5));
//       System.out.println("Show multiple : "+calculator.multi(4,2));
//       System.out.println("Show divide : "+calculator.div(8,4));
//