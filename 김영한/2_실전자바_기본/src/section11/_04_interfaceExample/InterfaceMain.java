package section11._04_interfaceExample;

//인터페이스 사용 예제.

public class InterfaceMain {
    public static void main(String[] args) {
        //인터페이스 생성 불가
        //InterfaceAnimal interfaceMain1 = new InterfaceAnimal();

        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);
    }

    //동물이 추가 되어도 변하지 않는 코드
    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}


/*인터페이스를 사용해야 하는 이유

모든 메서드가 추상 메서드인 경우 순수 추상 클래스를 만들어도 되고, 인터페이스를 만들어도 된다.
그런데 왜 인터페이스를 사용해야 할까? 단순히 편리하다는 이유를 넘어서 다음과 같은 이유가 있다.

1. 제약: 추상클래스의 경우, 누군가 추상클래스에 추상메서드가 아닌 일반메서드를 추가하게 될 가능성이 있다.
        이렇게 되면 추가된 기능을 자식 클래스에서 구현하지 않을 수도 있고, 또 더는 순수 추상 클래스가 아니게 된다.
        인터페이스의 경우, 모든 메서드가 추상 메서드여야만 한다. (제약)
        따라서 이런 문제를 원천 차단할 수 있다.
2. 다중 구현: 자바에서 클래스 상속은 부모를 하나만 지정할 수 있다.
        반면에 인터페이스는 부모를 여러명 두는 다중구현(다중 상속)이 가능하다.

*/