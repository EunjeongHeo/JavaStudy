package section11._01_basicExample;

//최종 리팩토링된 코드


public class AnimalSoundMain3 {
    public static void main(String[] args) {

        Animal[] animalArr = {new Dog(), new Cat(), new Caw()};

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }


    }

    private static void soundAnimal(Animal animal) { //동물이 추가되어도 변하지 않는 코드
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    //*참고 : 새로운 기능이 추가되었을 때 변하는 부분을 최소화 하는 것이 잘 작성된 코드이다.

}


/*

리팩토링 했음에도 이 코드는 다음과 같은 2가지 문제가 존재한다. => 추상 클래스 사용 필요!!

1. Animal 클래스를 직접 생성해서 사용할 일이 없으나, Animal 자체를 직접 생성할 수 있다. (문제점)
    -> 누군가 실수로 Animal을 생성할 수도 있다.
2. Animal 클래스를 상속 받는 곳에서 sound() 메서드 오버라이딩을 하지 않을 가능성이 있다. (문제점)
    -> 의도대로라면 상속받는 곳에서 메서드 오버라이딩을 해야 한다. 실수를 오버라이딩을 안 하더라도 오류가 발생하지 않는다.

=> 추상클래스로 해결하자.

*/