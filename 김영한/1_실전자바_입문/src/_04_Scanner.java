package src;

import java.util.Scanner;

public class _04_Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine();
        System.out.println("입력한 문자열 : "+ str);

        System.out.print("정수를 입력하세요: ");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수 : "+intValue);

        System.out.print("실수를 입력하세요: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수 : "+doubleValue);



        //예제1
        // - 사용자가 입력한 이름과 나이를 그대로 출력하는 예제.
        // - exit라는 문자가 입력되면 프로그램을 종료한다.
        // - 프로그램은 바복해서 실행된다.
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("이름을 입력하세요(exit: 종료): ");
            String name = input.nextLine();

            if (name.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요 : ");
            int age = input.nextInt(); //10\n

            input.nextLine(); //\n버리기 (버퍼 비우는 역할)

            System.out.print("입력한 이름 : " + name);
            System.out.println(", 나이 : " + age);
        }



        //예제2
        // - 사용자로부터 여러개의 정수 숫자를 입력받고, 그 숫자들의 합계와 평균 계산
        // - 사용자는 숫자를 입력하고 마지막에는 -1을 입력하여 숫자 입력을 종료
        // - 입력이 끝나면 숫자들의 sum과 average를 출력.
        // - average는 소수점 아래까지 계산 필요
        Scanner scanner2 = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        int count = 0;
        int inputNum = 0;
        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요.");

        while( (inputNum = scanner2.nextInt()) != -1 ){
            sum += inputNum;
            count++;
        }

        avg = (double)sum / count;
        System.out.println("입력한 숫자들의 합계 : "+ sum);
        System.out.println("입력한 숫자들의 평균 : " + avg);

    }
}
