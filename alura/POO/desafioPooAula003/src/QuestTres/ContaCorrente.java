package QuestTres;

public class ContaCorrente extends ContaBancaria{
    private int tarifa = 30;
    private boolean negativado = false;

    public void cobrarTarifaMensal(){
        if(saldo > tarifa){
            saldo -= tarifa;
            System.out.println("Tarifa realizada");
        } else {
            saldo -= tarifa;
            negativado = true;
            System.out.println("Operação realizada com erros, saldo negativado. Consulte o suporte.");
        }
    }
}
