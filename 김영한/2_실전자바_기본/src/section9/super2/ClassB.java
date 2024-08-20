package section9.super2;

public class ClassB extends ClassA {
    public ClassB(int a) {
        this(a, 0); //this타고 가면 super가 있어서 이 생성자에서는 super호출해주지 않은 것임.
        System.out.println("ClassB 생성자 a="+a);
    }
    public ClassB(int a, int b) {
        super(); //기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a="+a + " b=" + b);
    }
}