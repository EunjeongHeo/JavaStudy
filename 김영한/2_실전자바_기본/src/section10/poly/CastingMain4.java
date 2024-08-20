package section10.poly;
/*instanceof 사용 예제임*/


public class CastingMain4 {
    public static void main(String[] args) {

        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }
    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }
    }


    //자바 16부터는 instanceof를 사용하면서 동시에 선언할 수 있다.
    private static void call2(Parent parent) {
        parent.parentMethod();
        //Child 인스턴스인 경우 childMethod() 실행
        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }
    }



}
/*
* 참고로 instanceof 키워드는 오른쪽 대상의 자식 타입을 왼쪽에서 참조하는 경우에도 true 를 반환한다.

new Parent() instanceof Parent
Parent p = new Parent() //같은 타입 true

new Child() instanceof Parent
Parent p = new Child() //부모는 자식을 담을 수 있다. true

new Parent() instanceof Child
Child c = new Parent() //자식은 부모를 담을 수 없다. false

new Child() instanceof Child
Child c = new Child() //같은 타입 true

* 쉽게 이야기해서 오른쪽에 있는 타입에 왼쪽에 있는 인스턴스의 타입이 들어갈 수 있는지 대입해보면 된다.
* 대입이 가능하면 true , 불가능하면 false 가 된다.
* */