package section11._01_basicExample;

//Main1을 배열로 만들어 리팩토링
//최종 리팩토링된 코드는 Main3보면 됨

public class AnimalSoundMain2 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        Animal[] animalArr = {dog, cat, caw};

        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }


    }

}
