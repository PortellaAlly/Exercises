import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ddigite um cep dahora ai");
        String userInput = scanner.nextLine();

        HttpClient httpClient = HttpClient.newHttpClient();
        String endereco = "https://viacep.com.br/ws/" + userInput + "/json/";
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        FileWriter fileWriter = new FileWriter("dados.json");
        fileWriter.write(response.body());
        fileWriter.close();


    }
}