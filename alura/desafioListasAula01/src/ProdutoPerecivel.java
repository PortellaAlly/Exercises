public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quant, String dataValidade) {
        super(nome, preco, quant);
        this.dataValidade = dataValidade;
    }
}
