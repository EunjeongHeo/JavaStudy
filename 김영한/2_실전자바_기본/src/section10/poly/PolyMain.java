package section10.poly;


/*
 * 다형적 참조: 부모는 자식을 품을 수 있다.
 *
 * 지금까지 학습한 내용을 떠올려보면 항상 같은 타입에 참조를 대입했다. 그래서 보통 한 가지 형태만 참조할 수 있다.
 * Parent parent = new Parent()
 * Child child = new Child()
 *
 * 그런데 Parent 타입의 변수는 다음과 같이 자신인 Parent 는 물론이고, 자식 타입까지 참조할 수 있다.
 * 만약 손자가 있다면 손자도 그 하위 타입도 참조할 수 있다.
 * Parent poly = new Parent()
 * Parent poly = new Child()
 * Parent poly = new Grandson() : Child 하위에 손자가 있다면 가능
 *
 * 자바에서 부모 타입은 자신은 물론이고, 자신을 기준으로 모든 자식 타입을 참조할 수 있다.
 * 이것이 바로 다양한 형태를 참조할 수 있다고 해서 다형적 참조라 한다.
 */

public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();



        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();



        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod(); //부모가 부모 메소드를 호출할 수는 있음.
        //poly.childMethod(); //부모가 자식의 메소드를 호출 할 수는 없음. (컴파일 오류)
        //상속 관계는 부모 방향으로 찾아 올라갈 수는 있지만 자식 방향으로 찾아 내려갈 수는 없다.
        //Parent 는 부모 타입이고 상위에 부모가 없다. 따라서 childMethod() 를 찾을 수 없으므로 컴파일 오류가 발생한다.
        //이런 경우 childMethod() 를 호출하고 싶으면 캐스팅이 필요하다.



        //Child child1 = new Parent(); //자식은 부모를 담을 수 없다. 컴파일 오류 발생

    }
}