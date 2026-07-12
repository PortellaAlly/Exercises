import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        // Questao 1
        Gson gson = new GsonBuilder().setLenient().create();

        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println(pessoa);

        // Questao 2
        String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";

        Gson gson1 = new Gson();
        Livro livro = gson1.fromJson(jsonLivro, Livro.class);

        System.out.println(livro);
    }
}