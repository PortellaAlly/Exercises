public class Titulo implements Comparable<Titulo>{
    private String nome;

    @Override
    public int compareTo(Titulo o) {
        return this.nome.compareTo(o.nome);
    }
}
