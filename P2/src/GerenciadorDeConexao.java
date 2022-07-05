import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class GerenciadorDeConexao {
    private Socket socket;

    public void fazerConexao() throws IOException {
        socket = new Socket("www.google.com", 80);
    }

    public void fecharConexao() throws IOException {
        socket.close();
    }

    public void fazerRequisicao() throws IOException {
        PrintStream ps = new PrintStream(socket.getOutputStream());
        ps.println("GET / HTTP/1.1\nHost: www.google.com");
        ps.println();
    }

    public String lerResposta() throws IOException {
        InputStreamReader ir = new InputStreamReader(socket.getInputStream());
        BufferedReader br = new BufferedReader(ir);
        String resposta = "";
        String linha = br.readLine();
        while (br.ready()) {
            resposta += (linha + "\n");
            linha = br.readLine();
        }
        return resposta;
    }
}
