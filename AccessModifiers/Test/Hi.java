package AccessModifiers.Test;
public class Hi extends hello {
    Hi(){
        System.out.println("const of HI");
    }
    {
        System.out.println("Inside IIB-HI");
    }
    public static void main(String[] args) {
        hello h =  new Hi();
    }
}
