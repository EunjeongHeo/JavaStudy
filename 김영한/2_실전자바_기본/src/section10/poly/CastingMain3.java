package section10.poly;

/*다운캐스팅을 자동으로 하지 않는 이유
* 업캐스팅은 언제든 문제 없으나, 다운캐스팅은 문제 발생 가능성 있음.
* 자식 생성시 부모가 모두 생성되지만, 부모 생성시 자식이 모두 생성되지는 않기 때문임.
*/
public class CastingMain3 {
    public static void main(String[] args) {

        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); //문제 없음

        Parent parent2 = new Parent();
        //Child child2 = (Child) parent2; //런타임 오류
        //child2.childMethod(); //실행 불가
    }
}
