package src;

public class _01_Type {
    public static void main(String[] args) {
        int a = 1000; //정수
        double b = 10.5; //실수
        boolean c = true; //불리언
        char d = 'A'; //문자 => 거의 안 씀!! 문자 하나를 쓸 때에도 그냥 String 사용
        String e = "HELLO"; //문자열

        System.out.println(a);


        /*정수*/
        byte bb = 127; //-128 ~ 127 => 거의 안 씀
        short ss = 32767; // -21,768 ~ 32,767 => 아예 안 씀
        int ii = 2147483647; //약 20억
        long ll = 9223372036854775807L; //약 100경


        /*실수*/
        float ff = 10.0f; //=> 정밀도가 낮기에 쓰지 X, 고민하지 말고 double 쓸 것.
            //float 타입은 끝에 f 붙여줘야 함
        double dd = 10.0;


    }



}
