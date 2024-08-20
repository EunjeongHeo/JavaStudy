package section9.super1;

//child와 이름이 동일한 parent의 필드, 메소드를 사용하고자 할 때, super를 사용하면 된다.
public class SuperMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.call();
    }
}
