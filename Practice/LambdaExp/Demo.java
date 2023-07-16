package Practice.LambdaExp;

public class Demo {
    public static void main(String[] args) {
        A obj = () -> System.out.println("Show using Lambda Expression");
        obj.show();
        B obj1 = (i) -> System.out.println("Lambda taking parameters " + i);
        obj1.show(10); 
        C obj2 = (i,j) -> (i+j);
        System.out.println(obj2.Add(10, 100));
    }
}
