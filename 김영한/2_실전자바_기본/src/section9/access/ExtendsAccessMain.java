package section9.access;

import section9.access.child.Child;


//자식 클래스인 Child 에서 부모 클래스인 Parent 에 얼마나 접근할 수 있는지 확인해보자.
public class ExtendsAccessMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.call();
    }
}
