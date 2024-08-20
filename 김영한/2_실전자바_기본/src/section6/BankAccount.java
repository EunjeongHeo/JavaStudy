package section6;
//캡슐화(:필요에 따라 메서드의 접근 제어자를 잘 지정해주는 것) 예제임.
//접근 제어자와 캡슐화를 통해 데이터를 안전하게 보호하는 것은 물론이고,
//BankAccount 를 사용하는 개발자 입장에서 해당 기능을 사용하는 복잡도도 낮출 수 있다.

public class BankAccount {


    //데이터 필드는 외부에 직접 노출하지 않는다.BankAccount 가 제공하는 메서드를 통해서만 접근할 수 있다.
    private int balance;



    public BankAccount() {
        balance = 0;
    }


    // public 메서드: deposit
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }


    // public 메서드: withdraw
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }


    // public 메서드: getBalance
    public int getBalance() {
        return balance;
    }


    // private 메서드: 입력 금액을 검증하는 기능은 내부에서만 필요한 기능이다.
    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함
        return amount > 0;
    }
}