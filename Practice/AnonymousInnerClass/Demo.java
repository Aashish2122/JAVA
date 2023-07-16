package Practice.AnonymousInnerClass;

public class Demo {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("Inside New Show");
            }
            public void show2() {
                System.out.println("Inside extra functions");
            }
        };
        obj.show();
        obj.show2();
    }
}
