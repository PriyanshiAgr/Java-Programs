import java.util.*;
class Algebra{
    int a;
    int b;
    // This is how we create a constructor of a class and bcoz it contains parameters thus called parameterized constructor
    Algebra(int x, int y){
        System.out.println("Constructor of Algebra class is called");
        a=x; // using constructor to declare value of a
        b=y; // using constructor to declare value of b
    }
    // Function  creation
    int  add(){
        return a+b;
    }
    int  sub(){
        return a-b;
    }
    int  mul(){
        return a*b;
    }
    int  div(){
        return a/b;
    }
}
public class P44_constructors {
    public static void main(String[] args) {
        Algebra obj = new Algebra(5,7);
        System.out.println(obj.add());
        System.out.println(obj.sub());
        System.out.println(obj.mul());
        System.out.println(obj.div());

        // similarly to pass different values of a and b without removing previous one, we can create another obj with diff. values
        Algebra obj2 = new Algebra(6,12);
        System.out.println(obj2.add());
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());
        System.out.println(obj2.div());

    }
}
