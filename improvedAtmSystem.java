import java.util.Scanner;
import java.util.ArrayList;

public class improvedAtmSystem {

    static void myBank(){
        Scanner dataInput = new Scanner (System.in);

        double yourBalance = 0.0;

        while (true) {
            System.out.println("ATM MENU:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Log out");
            System.out.print("Choose an option: ");
            int option = Integer.parseInt(dataInput.nextLine());


            switch (option) {
                case 1:
                    System.out.println("Your balance: $" + yourBalance);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter Deposit amount: ");
                    int depositAmount = Integer.parseInt(dataInput.nextLine());
                    yourBalance = yourBalance + depositAmount;
                    System.out.println("$" + (yourBalance) + " Deposited successfully.");
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    int withdrawalAmount = Integer.parseInt(dataInput.nextLine());
                    yourBalance = yourBalance - withdrawalAmount;
                    System.out.println("$" + ((double)withdrawalAmount) + " Withdrawn successfully.");
                    System.out.println();
                    break;

            }

            if (option == 4) {
                System.out.println("Logged out.");
                System.out.println();
                break;
            }
        }


    }

    public static void main (String[] args){
        Scanner dataScanner = new Scanner (System.in);

        //Target
        //register new account, note that if already registered must print "already registered"
        //during login, check first if the account number is registered

        ArrayList <Integer> accountNum = new ArrayList<>();
        ArrayList <Integer> accountPin = new ArrayList<>();

       while (true) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choiceInput = Integer.parseInt(dataScanner.nextLine());


            switch (choiceInput){
                case 1:
                System.out.print("Enter Account Number: ");
                int Num = Integer.parseInt(dataScanner.nextLine());
                accountNum.add(Num);

                System.out.print("Enter PIN: ");
                int Pin = Integer.parseInt(dataScanner.nextLine());
                accountPin.add(Pin);

               System.out.println("Account successfully registered.");
               System.out.println();
               break;

               case 2:
               System.out.print("Enter Account Number: ");
               int loginNum = Integer.parseInt(dataScanner.nextLine());
               System.out.print("Enter PIN: ");
               int loginPin = Integer.parseInt(dataScanner.nextLine());
                 if (accountNum.contains(loginNum) && accountPin.contains(loginPin)){
                   System.out.println("Login successful.");
                   System.out.println();
                   myBank();
                   break;
                
                 } else {
                   System.out.println("Register first!");
                   System.out.println();
                 }
                 break;

           } if (choiceInput==3){
                System.out.println("Goodbye!");
                break;
           }
       }
       
       dataScanner.close();
    }
}
