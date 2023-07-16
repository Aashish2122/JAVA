package Practice.InnerClasses;

public class A {
    int age = 20;
    public void show() {
        System.out.println("Inside show");
    }
    class B {
        public void config(){
            System.out.println("inside config");
        }
    }
}

