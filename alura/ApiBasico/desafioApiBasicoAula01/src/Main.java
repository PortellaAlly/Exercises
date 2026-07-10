import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Escolha uma cripto moeda para ser compara com a moeda brasileira");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a moeda que deseja comparar");
        String cripto = scanner.nextLine();

        String chave = "CG-1Tf79b6Hm6pmWPpR28d36joQ";
        String endereco = "https://api.coingecko.com/api/v3/simple/price?vs_currencies=brl&ids=" + cripto + "&x_cg_demo_api_key=" + chave;

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(httpResponse.body());
    }
}