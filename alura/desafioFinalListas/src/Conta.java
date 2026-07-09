public class Conta {
    private String nome;
    private int limite;
    private int limiteAtual;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        if(limite > 0) {
            this.limite = limite;
        } else {
            System.out.println("Limite invalido");
        }
    }
}
