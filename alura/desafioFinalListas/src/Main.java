import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.print("Initializing");
        TimeUnit.SECONDS.sleep(1);
        System.out.print(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.print(".");
        TimeUnit.MILLISECONDS.sleep(1);
        System.out.println(".");
        TimeUnit.MILLISECONDS.sleep(1);

        while(conta.getLimite() <= 0) {
            System.out.println("Digite seu limite");
            conta.setLimite(scanner.nextInt());
        }


    }
}