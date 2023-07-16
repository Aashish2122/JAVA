package Practice.Inheritance;

public class Demo implements A,B {
    public void method(){
        A.super.method();
        B.super.method();
    }
    public static void main(String[] args) {
        new Demo().method();
    }
}
