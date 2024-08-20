package section11._04_interfaceExample;


//순수 추상 클래스 == 인터페이스 특징
//1. 인스턴스(객체)를 생성할 수 없다.
//2. 상속 시 모든 메서드를 오버라이딩 해야 한다.
//3. 주로 다형성을 위해 사용된다.

public interface InterfaceAnimal { //인터페이스
    void sound(); //public abstract
    void move(); //public abstract

    //인터페이스의 메서드는 모두 public , abstract 이다.
    //메서드에 public abstract 를 생략할 수 있다. (생략이 권장된다.)


    //인터페이스의 멤버변수는 모두 public, static, final 이다. (즉, public 상수 라는 의미)
    //멤버변수에 public, static, final 를 생략할 수 있다. (생략이 권장된다.)
    //상수이기 때문에 대문자와 _ 의 조합으로 된 이름이 권장된다.
}

