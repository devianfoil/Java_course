package practise_2;

public class BankAccount {
    String owner;
    int balance;

    BankAccount(String owner, int balance){
        this.owner = owner;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public int deposit(int amount){
        return this.balance=this.balance+ amount;
    }


    public int withdraw(int amount){
        return this.balance= this.balance - amount;
    }

    public void printInfo() {
        System.out.println("Тукущий баланас юзера;" +balance);
    }
}
