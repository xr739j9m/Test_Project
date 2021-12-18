package OOP_Programs;

import java.util.Scanner;

public class BankAccount {

    String accountName = "Current User";
    int accountNumber = 200;
    double balance = 500;

    // constructor1
    public BankAccount(String accountName, int accountNumber, double balance) {
        setName(accountName);
        setNumber(accountNumber);
        setBal(balance);
    }

    // constructor2
    public BankAccount() {
        getAccountName();
        getAccountNumber();
        getBalance();
    }

    public static void display1() {
        System.out.println("---------------------------------------------");
        System.out.println("    \t      Welcome to SUDO BANK");
        System.out.println("---------------------------------------------");
        System.out.println("Following Functionalities are available: ");
        System.out.println("\n1- Create Account\n2- Login\n3- Exit");
        System.out.println("---------------------------------------------");
        System.out.println("\nEnter Choice: ");
    }

    public static void display2() {
        System.out.println("---------------------------------------------");
        System.out.println("    \t      Welcome to SUDO BANK");
        System.out.println("---------------------------------------------");
        System.out.println("Following Functionalities are available: ");
        System.out.println("\n1- Deposit\n2- Withdraw\n3- Inquire\n4- Exit");
        System.out.println("---------------------------------------------");
        System.out.println("\nEnter Choice: ");

    }

    private static int mainInterfaceLoop(Scanner input) {
        boolean loop1;
        int mainInput;
        do {
            display1();
            mainInput = input.nextInt();
            loop1 = mainInput > 3 || mainInput == 0;
            if (mainInput > 3 || mainInput == 0) {
                System.out.println("\n[!]-Invalid functionality. Try Again.");
                System.out.println("\n");
            }
        } while (loop1);
        return mainInput;
    }

    private static int subInterfaceLoop(Scanner input) {
        boolean loop;
        int userInput;
        do {

            display2();
            userInput = input.nextInt();

            loop = userInput > 4 || userInput == 0;
            if (userInput > 4 || userInput == 0) {
                System.out.println("\n[!]-Invalid functionality. Try Again.");
                System.out.println("\n");
            }
        } while (loop);
        return userInput;
    }

    private static void loopThrough(Scanner input, BankAccount obj, int userInput) {
        boolean loop = true;
        do {

            double amt;
            switch (userInput) {// Deposit
                case 1:
                    System.out.println("Enter amount to deposit:");
                    amt = input.nextDouble();
                    obj.deposit(amt);
                    loop = false;
                    break;

                case 2:// Withdraw
                    System.out.println("Enter amount to withdraw:");
                    amt = input.nextDouble();
                    obj.withdraw(amt);
                    loop = false;
                    break;

                case 3:// Inquire
                    obj.Inquire();
                    loop = false;
                    break;
                case 4: // EXit
                    System.out.println("[x]-Functionalities have been terminated.");
                    System.out.println("\n");
                    loop = false;

                default:
                    break;
            }
        } while (loop);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean outerLoop;
        outerLoop = true;
        do {
            int mainInput;
            mainInput = mainInterfaceLoop(input);

            boolean subLoop = true;

            do {

                switch (mainInput) {
                    case 1:

                        do {
                            String name;
                            int num;
                            double bal;

                            System.out.println("Enter Account Name: ");
                            input.skip("\\R"); // contains nextLine to avoid skipping name
                            name = input.nextLine();

                            System.out.println();
                            System.out.println("Enter Account Number: ");
                            num = input.nextInt();
                            System.out.println("Enter Balance: ");
                            bal = input.nextDouble();
                            if (bal >= 500) {
                                BankAccount objects = new BankAccount(name, num, bal);
                                objects.setName(name);
                                objects.setNumber(num);
                                objects.setBal(bal);

                                System.out.println("[+]-Account has been Created.");

                                do {
                                    int userInput;

                                    userInput = subInterfaceLoop(input);
                                    loopThrough(input, objects, userInput);

                                    System.out.println("Make another transaction?\n[y]-yes\n[n]-no");
                                    char ans;

                                    boolean loop;
                                    do {
                                        ans = input.next().charAt(0);
                                        loop = ans != 'n' && ans != 'y';
                                        if (loop) {
                                            System.out.println("Invalid functionality.Try again.");
                                        }
                                    } while (loop);

                                    if (userInput == 4 || ans == 'n') {

                                        System.out.println("[x]-Program has been terminated.");
                                        return;

                                    }

                                } while (true);

                            }
                            System.out.println(
                                    "[x]-Minimum balance should only be at least 500php.\n[~]-Contact helpdesk for further information.");
                            System.out.println("\n");
                        } while (true);

                        // Login with pin 0000
                    case 2:
                        int loginKey = 9080;
                        int userKey;
                        int count = 0;
                        boolean loginLoop;
                        do {
                            System.out.println("\nEnter password: ");
                            userKey = input.nextInt();

                            loginLoop = userKey != loginKey;

                            if (userKey != loginKey) {

                                System.out.println("[!]-Wrong Password. Try again.");
                                count += 1;
                                if (count == 3) {

                                    System.out.println("\n[x]-Max number of input has been reach.");
                                    System.out.println("\n");
                                    break;

                                }
                            }
                            if (userKey == loginKey) {
                                System.out.println("Processing");

                                outerLoop = false;

                            }

                        } while (loginLoop);
                        subLoop = false;
                        break;

                    case 3:// Exit
                        System.out.println("[x]- Program has been terminated.");

                        return;
                    default:
                        System.out.println("Invalid functionality. Try Again.");
                        break;
                }

            } while (subLoop);

        } while (outerLoop);

        BankAccount obj = new BankAccount();
        boolean key;
        key = true;
        do {
            int userInput;
            userInput = subInterfaceLoop(input);

            loopThrough(input, obj, userInput);

            System.out.println("Make another transaction?\n[y]-yes\n[n]-no");
            char ans;

            boolean loop;
            do {
                ans = input.next().charAt(0);
                loop = ans != 'n' && ans != 'y';
                if (loop) {
                    System.out.println("Invalid functionality.Try again.");
                }
            } while (loop);

            if (ans == 'n' || userInput == 4) {

                System.out.println("[x]-Program has been terminated.");
                key = false;
            }

        } while (key);

    }

    public void setName(String name) {

        this.accountName = name;

    }

    public void setNumber(int num) {
        this.accountNumber = num;
    }

    public void setBal(double bal) {

        this.balance = bal;

    }

    public void getAccountName() {

    }

    public void getAccountNumber() {
    }

    public void getBalance() {

    }

    public void deposit(double amt) {
        this.balance += amt;
        System.out.println("[+]-Depositing " + amt + " php..." + "\n");
        this.printBalance();
    }

    public void withdraw(double amt) {

        if (this.balance < amt) {
            System.out.println("\n");
            System.out.println("[!]-Insufficient balance.\n[x]-Transaction has been terminated.");
            System.out.println("\n");
            return;
        }

        this.balance -= amt;
        System.out.println("[-]-Withdrawing " + amt + " php..." + "\n");

        this.printBalance();
    }

    public void printBalance() {
        System.out.println("--------------------------------------------------");
        System.out.println("Your current balance is: " + this.balance + " php");
        System.out.println("--------------------------------------------------");
        System.out.println("\n");
    }

    public void Inquire() {
        System.out.println("---------------------------------------------");
        System.out.println("\t\t" + this.accountName + "  " + "Account");
        System.out.println("---------------------------------------------");
        System.out.println(
                "NAME: " + this.accountName + "\nACCOUNT NUMBER: " + this.accountNumber + "\nBALANCE: " + this.balance);
        System.out.println("---------------------------------------------");
    }

}