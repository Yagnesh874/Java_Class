class account
{
    int acc_No;
    String name;
    float amount;
    void insert(int a,String n,float amt)
    {
        acc_No  = a;
        name = n;
        amount = amt;
    }
    void deposit(float amt)
    {
        amount += amt;
        System.out.println("Deposited : "+amt);
    }
    void withdraw(float amt)
    {
        if(amount < amt)
        {
            System.out.println("Insufficient balance");
        }
        else
        {
            amount -= amt;
            System.out.println("Withdraw"+amount);
        }
    }
    void checkBalance()
    {
        System.out.println("Balance is : "+amount);
    }
    void display()
    {
        System.out.println(acc_No+" : "+name+" : "+amount);
    }
}

public class TestAccount {
    public static void main(String[] args) {
        account s1 = new account();
        s1.insert(2143321,"Rahul",15000);
        s1.display();
        s1.checkBalance();
        s1.deposit(25000);
        s1.checkBalance();
        s1.withdraw(20000);
        s1.checkBalance();
    }
}
