package src;

public class _08_Method {
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1, 2, 3));
    }

    // 첫 번째 add 메서드
    public static int add(int a, int b) {
        System.out.println("1번 메서드 호출");
        return a + b;
    }
    // 두 번째 add 메서드
    public static int add(int a, int b, int c) {
        System.out.println("2번 메서드 호출");
        return a + b + c;
    }


    /*메서드 오버로딩 규칙
     * 메서드의 이름과 반환타입은 같아도 상관 없다.
     * 매개변수의 타입, 순서가 다르면 오버로딩을 할 수 있다.
     */

    //메서드 오버로딩 실패하는 경우
    //int add(int a, int b)
    //double add(int a, int b)

    //메서드 오버로딩 가능한 경우
    //double add(double a, int b)
    //double add(int a, double b)



    /*메서드에서 public static 부분의 의미*/
    //public static
    //public : 다른 클래스에서 호출할 수 있는 메서드라는 뜻이다. 접근 제어에서 학습한다.
    //static : 객체를 생성하지 않고 호출할 수 있는 정적 메서드라는 뜻이다. 자세한 내용은 뒤에서 다룬다.
}
