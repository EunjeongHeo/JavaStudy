package section9.super2;

public class ClassC extends ClassB {
    public ClassC() {
        super(10, 20); //ClassC 의 부모인 ClassB 에는 기본 생성자가 없다. 따라서 super();를 사용하거나 생략할 수 없다
        System.out.println("ClassC 생성자");
    }
}