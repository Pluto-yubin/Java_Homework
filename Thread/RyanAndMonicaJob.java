package Homework.Thread;

class BankAccount {
    private int balance = 100;

    public int getBalance() {
        return balance;
    }
    public void withdraw(int amount) {
        balance -= amount;
    }
}

public class RyanAndMonicaJob implements Runnable {
    private int amount = 100;
    BankAccount account = new BankAccount();



    public static void main(String[] args) {
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monical");
        one.start();
        two.start();
    }
    @Override
    public void run() {
        for(int i = 10; i > 0; i--) {
            try {
                makeWithdraw(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(account.getBalance() < 0)
                System.out.println("Overdrawn");
        }

    }

    private synchronized void makeWithdraw(int i) throws InterruptedException  {
        if(account.getBalance() < i)
            System.out.println("Your money is not enough " + Thread.currentThread().getName());
        else {
            System.out.println(Thread.currentThread().getName() + " is sleeping");
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName() + " is woke up");
            account.withdraw(i);
            System.out.println(Thread.currentThread().getName() + " withdraw the money");
        }
    }

}
