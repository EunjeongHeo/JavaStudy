package section4;

public class MemberConstruct {
    //가까운 게 우선순위를 가짐 => this.name은 멤버변수, name은 매개변수.
    //생성자를 하나라도 정의했다면 기본 생성자는 존재하지 않는다.

    String name;
    int age;
    int grade;


    MemberConstruct(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


    MemberConstruct(String name, int age) {
        this(name, age, 50); //자기 자신 생성자 호출 가능!!!
    }


    //this()생성자의 규칙
    //생성자 내부에서만 사용 가능
    //생성자 내부 중에서도 첫 줄에서만 사용 가능

}
