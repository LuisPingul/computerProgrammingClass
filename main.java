
import java.util.Scanner;
import java.util.HashMap;

public class main {
    static void atmBank () {
        Scanner dataInput = new Scanner (System.in);

        double yourBalance = 0.0;
        while (true) {
            System.out.println("Welcome!");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Logout");
            System.out.print("Choose an Option: ");
            int option = Integer.parseInt(dataInput.nextLine());
            System.out.println();
            

            switch (option){
                case 1:
                    System.out.println("Your balance: $" + yourBalance);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = Double.parseDouble(dataInput.nextLine());
                    yourBalance +=depositAmount;
                    System.out.println("Your New Balance: $" + yourBalance);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter Withdrawal Amount: ");
                    int withdrawalAmount = Integer.parseInt(dataInput.nextLine());
                    if (withdrawalAmount>yourBalance){
                        System.out.println("Cannot withdraw beyond your current balance!");
                        System.out.println();
                    }else {
                        yourBalance -= withdrawalAmount;
                        System.out.println("Your Remaining Balance: $" + yourBalance);
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using ATM!");
                    System.out.println();
                    
                    return;
                default:
                    System.out.println("Invalid option!");
                    System.out.println();
                    
            }
        
        }


    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap <Integer, Integer> atmAccount = new HashMap<>();

        while (true) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            int enterChoice = Integer.parseInt(input.nextLine());

            switch (enterChoice){
                case 1:
                    System.out.print("Enter New Account Number: ");
                    int newAccountNum = Integer.parseInt(input.nextLine());
                    if (atmAccount.containsKey(newAccountNum)){
                        System.out.println("Account Already Registered!");
                        System.out.println();
                    } else {
                        System.out.print("Enter New PIN: ");
                        int newAccountPin = Integer.parseInt(input.nextLine());

                        atmAccount.put(newAccountNum, newAccountPin);

                        System.out.println("Account Successfully Registered");
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Enter Account Number: ");
                    int accountNumber = Integer.parseInt(input.nextLine());
                    if (!atmAccount.containsKey(accountNumber)){
                        System.out.println("Account not Found! Register First!");
                        System.out.println();
                    } else {
                        System.out.print("Enter PIN: ");
                        int accountPin = Integer.parseInt(input.nextLine());
                        if (!atmAccount.containsValue(accountPin)){
                            System.out.println("Wrong PIN! Try Again");
                            System.out.println();
                        } else {
                            System.out.println("Login Successful");
                            System.out.println();
                            atmBank();

                        }
                       
                    }
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid Choice! Please Try Again!");
                    System.out.println();
            }

        }


    }
}
