package section2;

public class NullPointExeptionMain {
    //NullPointerException 이 발생하면 null 값에 . (dot)을 찍었다고 생각하면 문제를 쉽게 찾을 수 있다

    public static void main(String[] args) {
        Data data = null;
        data.value = 10;// NullPointerException 예외 발생
        System.out.println("data = " + data.value);
    }
}
