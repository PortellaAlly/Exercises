package QuestTres;

public class ContaBancaria {
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo < 0){
            System.out.println("Operação inválida");
        } else {
            this.saldo = saldo;
        }
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Saldo alterado, valor depositado!");
        } else {
            System.out.println("Operação inválida");
        }
    }

    public void sacar(double valor) {
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Operação inválida");
        }
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo é: " + getSaldo());
    }
}
