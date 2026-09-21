public class Main {
    public static void main(String[] args) {
        // Questao 1
        ContaBancaria conta1 = new ContaBancaria();

        conta1.setNumeroConta(40028922);
        conta1.setSaldo(6767);
        conta1.titular = "Allyson";

        System.out.println("Numero da conta eh: " + conta1.getNumeroConta());
        System.out.println("Seu saldo eh: " + conta1.getSaldo());
        System.out.println("O titular eh no nome de: " + conta1.titular);
        }
}
