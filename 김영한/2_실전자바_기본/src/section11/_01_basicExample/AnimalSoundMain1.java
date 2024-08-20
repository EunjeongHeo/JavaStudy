package section11._01_basicExample;
//자식 클래스 객체를 부모 클래스로 받아들여 메서드 수행
//최종 리팩토링된 코드는 Main3보면 됨

public class AnimalSoundMain1 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        //각각 다른 타입의 인자를 넘겨주어도 부모타입 파라미터로 받으면 같은 작업을 수행할 수 있다.

    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
