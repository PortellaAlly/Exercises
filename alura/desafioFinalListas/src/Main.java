import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
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

        System.out.println("Do you want to start buying?(Y/N)");
        String userDecisions = scanner.nextLine();

        List<Products> products = new ArrayList<>();

        if(Objects.equals(userDecisions, "Y")){
            while (userDecisions.equals("Y")) {
                String productName = "";
                int price = 0;
                System.out.println("What is the product name? ");
                productName = scanner.nextLine();

                System.out.println("How much does it cost?");
                price = scanner.nextInt();
                scanner.nextLine();

                products.add(new Products(productName, price));
                System.out.println("Do you want to continue buying?(Y/N)");
            }
        } else if (userDecisions == "N") {
            System.out.println(" s");
        }


    }
}