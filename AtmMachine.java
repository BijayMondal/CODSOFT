import java.util.Scanner;

class atm{
    float balance;
    int pin=1044;
    int x;
    public void checkpin(){
        System.out.println("Enter the pin:");
        Scanner sc =new Scanner(System.in);
        int userpin=sc.nextInt();

        if(userpin == pin){
            menu();
        }else{
            System.out.println("Invalid PIN");
            menu();
        }
        sc.close();
    }

      public void menu(){
        System.out.println("Enter 1 to check Account Balance:");
        System.out.println("Enter 2 to Withdraw money");
        System.out.println("Enter 3 to Deposit money");
        System.out.println("Enter 4 to Exit");
        System.out.println("Enter your choice: ");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();

        if(choice==1){
            checkBalance();
        }else if(choice==2){
            withdrawMoney();
        }else if(choice==3){
            depositMoney();
        }else if(choice==4){
            System.out.println("Thank You for visiting us.");
        }else{
            System.out.println("Enter a valid choice");
        }
        sc.close();
    }
        public void checkBalance(){
            System.out.println("Balance: " +balance);
            menu();
        }
        public void withdrawMoney(){
            System.out.println("Enter amount to be withdrawn: ");
            Scanner sc = new Scanner(System.in);
            float amount=sc.nextFloat();

            if(amount > balance){
                System.out.println("Insufficient Balance");
            }else{
                balance = balance - amount;
                System.out.println("Amount is withdrawing successfully ");
            }
            menu();
            sc.close();
        }

        public void depositMoney(){
        System.out.println("Enter amount to be deposited: ");
        Scanner sc=new Scanner(System.in);
        float amount = sc.nextFloat();
        balance += amount;
        System.out.println("Amount is depositing successfully ");
        menu();

        sc.close();
    }
}

public class AtmMachine {
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    atm object = new atm();
    object.checkpin();

    sc.close();
    }    
}
