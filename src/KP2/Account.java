package KP2;

import java.time.LocalDateTime;
import java.util.UUID;

public class Account {

    private final String id = UUID.randomUUID().toString();
    private long money;
    private final LocalDateTime dateRegistration;

    public Account(long money, LocalDateTime dateRegistration) {
        if (money < 0) {
            throw new IllegalArgumentException("negative money quantity: " + money);
        }
        this.money = money;
        this.dateRegistration = dateRegistration;
    }

    public long getMoney() {
        return money;
    }

    public LocalDateTime getDateRegistration() {


        return dateRegistration;
    }

    public String getId() {
        return id;
    }


    /*public long setMoney(long money) {    //вместо метода setMoney(...) создать 2 отдельных метода withdraw(...) и debit(...)
        return this.money = money;
    }*/

    public void withdraw(long amount) {
        money -= amount;
    }

    public void debit(long amount) {
        money += amount;
    }


    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                ", dateRegistration=" + dateRegistration +
                '}';
    }

}
