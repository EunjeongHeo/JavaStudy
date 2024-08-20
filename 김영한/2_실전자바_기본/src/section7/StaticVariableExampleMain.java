package section7;

public class StaticVariableExampleMain {
    public static void main(String[] args) {
        StaticVariableExample data1 = new StaticVariableExample("A");
        System.out.println("A count=" + StaticVariableExample.count); //static변수는 객체명인 Data1가 아닌, 클래스명인 Data로 접근하는 게 좋다.
        StaticVariableExample data2 = new StaticVariableExample("B");
        System.out.println("B count=" + StaticVariableExample.count);
        StaticVariableExample data3 = new StaticVariableExample("C");
        System.out.println("C count=" + StaticVariableExample.count);
    }
}

//static 변수는 인스턴스 영역(힙 영역)이 아닌, 메서드 영역에서 관리한다.
//인스턴스(객체) 생성 없이도! 클래스명을 통해 인스턴스 변수에 접근할 수 있다!!!