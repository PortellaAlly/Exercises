import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.print("Initializing");
        TimeUnit.MILLISECONDS.sleep(300);
        System.out.print(".");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.print(".");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println(".");
        TimeUnit.MILLISECONDS.sleep(500);



        while(conta.getLimite() <= 0) {
            System.out.println("Digite seu limite");
            conta.setLimite(scanner.nextInt());
        }


    }
}