import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Banking> user = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int selectOption = 0;

        while(selectOption != 5){

            System.out.println("Welcome: \n" +
                    "Enter Your Option: \n" +
            "Press 1 for Add User, Press 2 for Deposit, Press 3 for Withdraw, Press 4 fo Check Credit, Press 5 for EXIT.");

            selectOption = sc.nextInt();
            sc.nextLine();

            switch(selectOption){

                case 1: //Add user:

                    System.out.println("Enter Name: ");
                    String addNewName = sc.nextLine();

                    System.out.println("Enter ID: ");
                    String addNewID = sc.nextLine();

                    System.out.println("Enter Amount: ");
                    double addnewAmount = sc.nextDouble();

                    user.add(new Banking(addNewName,addNewID,addnewAmount));

                    for(Banking banking : user){
                        System.out.println(banking.toString());
                    }

                    break;

                case 2: //Deposit:

                    System.out.println("Enter ID: ");
                    String findId = sc.nextLine();

                    for(Banking banking : user){

                        if(banking.getID().equalsIgnoreCase(findId)){

                            System.out.println("Account Found.\n");

                            System.out.println("Enter Your Amount To Deposit: \n");

                            Double addDepositAmount = sc.nextDouble();

                            if(addDepositAmount > 0){

                                 double currentBalance = banking.getAmountStored();

                                 banking.setAmountStored(currentBalance + addDepositAmount);

                                System.out.println("Added Successfully.\n"
                                + "Current Balance: ");

                                System.out.println(banking.getAmountStored());
                            }

                            else{

                                System.out.println("Try Again");
                            }
                        }

                        else{
                            System.out.println("Account Not Found.\n");
                        }
                    }

                    break;

                case 3: //Withdraw:

                    System.out.println("Enter ID: ");
                    String findId1 = sc.nextLine();

                    for(Banking banking : user){

                        if(banking.getID().equalsIgnoreCase(findId1)){

                            System.out.println("Account Found.\n");

                            System.out.println("Enter Your Amount To Withdraw: \n");

                            Double addWithdrawAmount = sc.nextDouble();

                            double currentBalance = banking.getAmountStored();

                            if(addWithdrawAmount > currentBalance
                                    || currentBalance - addWithdrawAmount < 5000){

                                System.out.println("Try Again.");
                            }
                            banking.setAmountStored(currentBalance - addWithdrawAmount);

                            System.out.println("Withdraw Successful");
                            System.out.println("Current Balance : " + banking.getAmountStored());
                        }

                        else{
                            System.out.println("Account Not Found.\n");
                        }
                    }

                    break;

                case 4: //Check Balance:

                    System.out.println("Enter ID: ");
                    String findId2 = sc.nextLine();

                    for(Banking banking : user){

                        if(banking.getID().equalsIgnoreCase(findId2)){

                            System.out.println(banking.toString());
                        }
                    }

                    break;

                case 5:

                    break;
            }
        }

        System.out.println("Thank You.");

    }
}