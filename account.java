import java.util.Scanner;

class Account {
    String Owner;
    String Acc_No;
    Double Balance;

    Account(String Account,String Name, Double Bal)
    {
        this.Owner=Name;
        this.Balance=Bal;
        this.Acc_No=Account;
    }
    void Deposite(double amount)
    {
        this.Balance+=amount;
        System.out.println("The Balance Details:");
        System.out.println(Owner+"\t"+Acc_No+"\t+Balance");
    }
    void withdrawal(double amount)
    {
        if(this.Balance<500)
        {
            System.out.println("Sorry..You have insufficient Balance");
            return;
        }
        this.Balance-=amount;
    }
}

    public class account {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Owner Name:");
        String name=sc.next();
        System.out.println("Enter Account Number:");
        String acc=sc.next();
        System.out.println("Balance:");
        double bal=sc.nextDouble();
        Account a=new Account(acc,name,bal);
        Boolean opt=true;
        while(opt)
        {
            System.out.println("1.BALANCE ENQUIRY \n2.DEPOSIT \n3.WITHDRAWAL");
            System.out.println("Enter your choice:");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("Enter Amount Deposite:");
                double amt=sc.nextDouble();
                a.Deposite(amt);
                break;
                case 2:
                System.out.println("Enter Amoumt to Withdrawal:");
                double amount=sc.nextDouble();
                a.withdrawal(amount);
            }
        }
    }
    }
