package section8;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        //data = new Data(); //final 변경 불가 컴파일 오류

        data.value = 10; // 참조 대상의 객체 값은 변경할 수 있다!!!
        System.out.println(data.value);
        data.value = 20; // 참조 대상의 객체 값은 변경할 수 있다!!!
        System.out.println(data.value);
    }
}

