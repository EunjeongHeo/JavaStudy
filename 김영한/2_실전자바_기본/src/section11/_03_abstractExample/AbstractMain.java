package section11._03_abstractExample;

//순수 추상클래스 예제
//순수 추상클래스란? : 클래스 내 모든 메서드가 추상메서드로만 선언되어 있는 클래스
//사실 자바에는 순수 추상클래스라는 용어가 없다.
//인터페이스 라는 기능을 지원하기 때문이다.
//인터페이스를 사용하자! (_04_animalExample에서 확인)

public class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);
        moveAnimal(cat);
        moveAnimal(dog);
        moveAnimal(caw);
    }
    //동물이 추가 되어도 변하지 않는 코드
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
    //동물이 추가 되어도 변하지 않는 코드
    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
