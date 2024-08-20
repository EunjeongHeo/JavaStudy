package src;

public class _02_Switch {

    public static void main(String[] args) {

        //잘 쓰진 않는다.


        int grade = 2;

        int coupon;
        switch (grade){
            case 1:
                coupon = 1000; break;
            case 2:
                coupon = 2000; break;
            case 3:
                coupon = 3000; break;
            default:
                coupon = 500;
        }

        System.out.println("발급 받은 쿠폰 : " + coupon);


    }


}
