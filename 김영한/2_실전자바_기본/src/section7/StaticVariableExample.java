package section7;

//원래는 멤버변수를 private으로 해주는 게 맞지만, 예제 이해 편의를 위해 public으로 해주었다.

public class StaticVariableExample {
    public String name;
    public static int count; //static
    public StaticVariableExample(String name) {
        this.name = name;
        count++;
    }
}

//멤버변수의 종류
//* static이 붙은 변수 = 클래스 변수 = 정적 변수
//* static이 붙지 않은 변수 = 인스턴스 변수