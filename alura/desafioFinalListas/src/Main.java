import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();

        while(conta.getLimite() <= 0) {
            System.out.println("Digite seu limite");
            conta.setLimite(scanner.nextInt());
        }
    }
}