package section10.poly;

public class CastingMain1 {
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();

        //poly.childMethod(); //자식의 기능 호출 불가능 (컴파일 오류 발생)

        //다운캐스팅(부모 타입 -> 자식 타입)
        Child child = (Child) poly;
        child.childMethod(); //자식의 기능 호출 가능
        //=> 번거로우니 일시적 다운 캐스팅 사용하자.

        //일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod();
    }
}
