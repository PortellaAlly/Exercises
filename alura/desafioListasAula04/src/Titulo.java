public class Titulo implements Comparable<Titulo>{
    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Titulo o) {
        return this.nome.compareTo(o.nome);
    }

    @Override
    public String toString(){
        return nome;
    }
}
