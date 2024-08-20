package src;

public class _03_Operator {

    public static void main(String[] args) {

        //삼항연산자
        //단순히 참과 거짓에 따라 달라지는 경우에 간단하게만 사용
        int age = 10;
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age = " + age + "status = " + status);

    }

}
