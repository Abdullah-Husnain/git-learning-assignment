import java.util.Scanner;
public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your account number:");
        String accountNumber = sc.nextLine();
        System.out.println("Enter your balance:");
        double balance = sc.nextDouble();
        
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        
        sc.close();
    }
}