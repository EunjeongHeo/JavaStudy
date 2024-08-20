package section2.Exercise1;

import java.util.Scanner;

public class ProductOrderMain {
    public static void main(String[] args) {

        //주문 개수 입력받기
        Scanner input = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int number = input.nextInt();
        input.nextLine(); //버퍼 비우기

        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] orders = new ProductOrder[number];


        // createOrder()를 사용해서 상품 주문 정보들을 생성하고 배열에 저장
        for (int i = 0; i < number ; i++) {
            System.out.println(i+1 + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = input.nextLine();

            System.out.print("가격: ");
            int price = input.nextInt();
            input.nextLine();

            System.out.print("수량: ");
            int quantity = input.nextInt();
            input.nextLine();

            orders[i] = createOrder(productName, price, quantity);
        }



        // 상품 주문 정보와 최종 금액 출력
        printOrde(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);



    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrde(ProductOrder[] orders) {
        for (ProductOrder order:orders){
            System.out.println("상품명 : " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order:orders){
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }


}
