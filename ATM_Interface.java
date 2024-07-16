import java.util.*;

class ATM{
    int total_am=12500000;
    int trans=0;
    List<String> Transaction = new ArrayList<>();
    int userpin=1234;

    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user Id: ");
        String id = sc.nextLine();
        System.out.println("Enter user pin: ");
        int pin = sc.nextInt();
        if (userpin == pin) {
            System.out.println("Login successfully");
            menu();
        } else {
            System.out.println("Enter valid pin");
            login();
        }
    }
    public void menu(){
        Scanner sc = new Scanner(System.in);
       
        while(true){
            System.out.println("\nWelcome to the ATM Interface!!");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Check balance");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch(ch){
                case 1: 
                    Transaction_hist();
                    break;
                case 2:
                    Withdraw();
                    break;
                case 3:
                    Deposit();
                    break;
                case 4:
                    Transfer();
                    break;
                case 5:
                    check_balance();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
    public void Transaction_hist(){
        if(trans==0){
            System.out.println("0 Transaction");
        }
        else{
            for (String trans : Transaction) {
                System.out.println(trans);
            }
        }
    }

    public void Withdraw(){
        System.out.println("Enter amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        double amount =sc.nextDouble();
       
            if(amount > 0 && amount<=total_am){
                trans++;
                total_am-=amount;
                Transaction.add("Withdraw amount "+ amount);
                System.out.println("Withdraw completed!!");
                System.out.println("Current balance is : "+ total_am);
            }
            else{
                System.out.println("Insufficient balance ");
            }
        
       
    }
    public void Deposit(){
        System.out.println("Enter amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        double amount =sc.nextFloat();
        double limit=10000000;
                  
        if(amount<=limit){
            trans++;
            total_am+=amount;
                Transaction.add("Deposit amount "+ amount);
                System.out.println("Amount is deposited successfully!!");
                System.out.println("Current balance is "+ total_am);
            }
            else{
                System.out.println("Your account limit is existed: ");
            }
        }
            
       public void Transfer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter recipient name: ");
        String reci=sc.next();
        System.out.println("Enter amount to transfer ");
        double amount = sc.nextDouble();
        if(amount<=total_am){
            trans++;
            total_am-=amount;
            Transaction.add("Transfer amount is: "+ amount);
            System.out.println("Transfer is successfully!!\n Current balance is "+ total_am);
        }
        else{
            System.out.println("Insufficient balance ");
        }
       } 

       public void check_balance(){
           System.out.println("Balance is : "+ total_am);
           menu();
       }
}
public class ATM_Interface {
           public static void main(String[] args) {
        ATM atm = new ATM();
        atm.login();
           }


    }
        
