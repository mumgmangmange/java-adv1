package thread.sync;

import static thread.start.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

public class BankAccountV1 implements BankAccount {

    private int balance;
    // volatile private int balance;

    public BankAccountV1(int balance) {
        this.balance = balance;
    }

    @Override
    public synchronized boolean withdraw(int amount) {

        log("거래 시작: " + getClass().getSimpleName());

        if (balance < amount) {
            log("[검증 실패] 출금액: " + amount + ", 잔액: " + balance);
            return false;
        }
        log("[검증 완료] 출금액: " + amount + ", 잔액: " + balance);
        sleep(1000);
        balance = balance - amount;
        //log("거래중: " + balance);
        log("[출금 완료] 출금액: " + amount + ", 변경 잔액: " + balance);

        log("거래 종료");
        return true;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
