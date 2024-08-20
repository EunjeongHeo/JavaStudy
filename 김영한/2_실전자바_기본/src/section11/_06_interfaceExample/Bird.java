package section11._06_interfaceExample;

public class Bird extends AbstractAnimal implements Fly {
    //extends 를 통한 상속은 하나만 할 수 있고 implements 를 통한 인터페이스는 다중 구현 할 수 있기 때문에
    //둘이 함께 나온 경우 extends 가 먼저 나와야 한다
    @Override
    public void sound(){
        System.out.println("짹짹");
    }

    @Override
    public void fly(){
        System.out.println("새 날기");
    }
}
