package section11._04_interfaceExample;

public class Cat implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("냐옹");
    }
    @Override
    public void move() {
        System.out.println("고양이 이동");
    }
}
