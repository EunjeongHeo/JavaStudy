//실무에서 제일 많이 쓰임!!
//단축키 => iter

package src;

public class _07_ForEach {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int number : numbers){
            System.out.print(number+ " ");
        }
        System.out.println();


        //for-each문을 사용하지 못 하는 경우 - 증가하는 index 값 필요
        for (int i = 0; i < numbers.length; i++){
            System.out.println("number"+i+"번의 결과는: " + numbers[i]);
        }

    }
}
