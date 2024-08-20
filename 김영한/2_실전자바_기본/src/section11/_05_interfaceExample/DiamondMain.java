package section11._05_interfaceExample;

//인터페이스의 '다중 구현' 예제

public class DiamondMain {
    public static void main(String[] args) {

        InterfaceA a = new Child();

        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();

        b.methodB();
        b.methodCommon();
    }
}