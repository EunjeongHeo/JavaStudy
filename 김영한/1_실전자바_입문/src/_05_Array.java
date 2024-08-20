package src;

public class _05_Array {

    public static void main(String[] args) {

        /*배열 선언,생성,대입*/
        int[] students1; //배열 변수 선언 (실제 배열이 생성되는 건 아님, 배열 변수만 생성)
        students1 = new int[5]; //배열 생성 (실제 배열을 생성하여 그 실제 배열의 참조값을 배열 변수에대입)
            //자바에서 배열 생성시 자동으로 초기화된다.
            //숫자-0 , boolean-false, String-null
        //int[] students1 = new int[5];
        students1[0] = 90;
        students1[1] = 100;
        students1[2] = 80;
        students1[3] = 40;
        students1[4] = 70;





        /*배열의 생성,초기화1 (이 경우 new int[5] 라고 해주면 안 된다.) */
        int[] students2;
        students2 = new int[] {90,100,80,40,70};
        //int[] students = new int[] {90,100,80,40,70};





        /*배열의 생성,초기화2 (편리한 버전, 그러나 이 땐 나눠서 쓰면 안 됨)*/
        int[] students3 = {90,100,80,40,70};
        //int[] students; students = {90,100,80,40,70}; -> 이건 오류.




        /*변수 값 사용*/
        for (int i = 0; i < students1.length; i++){
            System.out.println("학생" + (i + 1) + " 점수: "+students1[i]);
        }



    }

}
