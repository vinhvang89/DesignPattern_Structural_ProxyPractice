public class Demo {
    public static void main(String[] args) {
        MathCalculatorProxy proxy = new MathCalculatorProxy();
        double a =  proxy.add(3,6);
        System.out.println(a);
    }
}
