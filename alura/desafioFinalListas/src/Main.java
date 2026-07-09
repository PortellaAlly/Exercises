import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        System.out.print("Initializing");
        TimeUnit.MILLISECONDS.sleep(300);
        System.out.print(".");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.print(".");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println(".");
        TimeUnit.MILLISECONDS.sleep(500);

        System.out.println("What is your name?");
        account.setName(scanner.nextLine());

        while(account.getLimit() <= 0) {
            System.out.println("Hello, " + account.getName() + ". Could you write down your credit card limit? (Don't use broken numbers)");
            account.setLimit(scanner.nextInt());
            scanner.nextLine();
        }

        UserDecisions userDecisions = new UserDecisions();

        System.out.println("Do you want to start buying?(Y/N)");
        userDecisions.setYorn(scanner.nextLine());

        List<Products> products = new ArrayList<>();

        while (userDecisions.getYorn().equals("Y")) {
                    String productName = "";
                    int price = 0;
                    System.out.println("What is the product name? ");
                    productName = scanner.nextLine();

                    System.out.println("How much does it cost?");
                    price = scanner.nextInt();
                    scanner.nextLine();
                    account.setLimit(account.getLimit() - price);

                    products.add(new Products(productName, price));

                    System.out.println("\nDo you want to continue buying?(Y/N)");
                    userDecisions.setYorn(scanner.nextLine());
                    System.out.println("\n\n\n\n");

                    if (Objects.equals(userDecisions.getYorn(), "N")) {
                        System.out.println("""
                                      *********************
                                Options by now:
                                0 - Go back to the buying system
                                1 - Check your bill
                                2 - End the system
                                      *********************
                                """);
                        userDecisions.setVal(scanner.nextInt());
                        scanner.nextLine();
                        switch(userDecisions.getVal()) {
                            case 0:
                                System.out.println("Do you want to go back and buy more?(Y/N) (This will also end the system)");
                                userDecisions.setYorn(scanner.nextLine());
                                System.out.println("\n\n\n\n");
                                break;

                            case 1:
                                products.sort(Comparator.comparing(Products::getPrice));
                                System.out.println("Your bill is: ");
                                for(Products products1 : products){
                                    System.out.println(products1.getName() + products1.getPrice());
                                }
                                break;

                            case 2:
                                System.exit(0);
                        }


                    }

            }
            System.out.println("Terminating the process.");
    }
}