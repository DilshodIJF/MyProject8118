public class Method {
    public static void main(String[] args) {
Method method = new Method();
method.detMethod("Mohirdev");
        System.out.println(method.getSum(3, 8));
    }

    public void detMethod(String message) {
        System.out.println("Hello world  "+message);
    }

    public int getSum(int a, int b) {


        return a+b;
    }
}