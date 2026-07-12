import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setLenient().create();

        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println(pessoa);
    }
}