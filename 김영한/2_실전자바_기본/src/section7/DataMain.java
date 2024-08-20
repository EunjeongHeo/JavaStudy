package section7;

//정적 메서드를 사용할 때 해당 메서드를 자주 호출해야 한다면 static import 기능을 고려하자 (클래스명 생략하고 메서드 호출 가능)
//import static section7.Data.staticCall;
//import static section7.Data.*;

//static 메서드 주의점 : static 메서드에서는 staic 변수 또는 해당 메서드 내 지역변수만 사용할 수 있다.

public class DataMain {
    public static void main(String[] args) {

        System.out.println("1.정적 메서드 호출");
        Data.staticCall();
            //static 메서드는 인스턴스(객체)를 생성하지 않고도 호출할 수 있다.
            //static 메서드를 호출할 때에는, 인스턴스를 통해서가 아니라 클래스명을 통해 접근한다.


        System.out.println("2.인스턴스 메서드 호출1");
        Data data1 = new Data();
        data1.instanceCall();


        System.out.println("3.인스턴스 메서드 호출2");
        Data data2 = new Data();
        data2.instanceCall();

    }
}

