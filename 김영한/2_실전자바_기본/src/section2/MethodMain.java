package section2;

public class MethodMain {
    public static void main(String[] args) {
        //자바에서 메서드의 매개변수는 항상 값에 의해 전달된다.
        //그러나 이 값이 실제 값이냐, 참조(메모리 주소)값이냐에 따라 동작이 달라진다.


        //기본형 값 바꾸기
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a); //10
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a); //10


        //참조형 값 바꾸기
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value); //10
        changeReference(dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value); //20


    }

    static void changePrimitive(int x) {
        x = 20;
    }

    static void changeReference(Data dataX) {
        dataX.value = 20;
    }

}
