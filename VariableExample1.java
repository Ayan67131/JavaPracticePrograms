

public class VariableExample1 {
     static Integer a=10;
    public static void main(String []ar){
        long b = 10000000000L;
        double c = 12.5D;
        long creditCardNumber = 1234_5678_9012_3456L;
        a=11;
        fun();
        System.out.println(a);
    }

    private static void fun(){
        a=12;
        System.out.println(a);
    }
}
