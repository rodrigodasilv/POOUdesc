import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class GReader extends Thread{
    String resposta;
    Socket socket;
    public GReader(Socket s){
        this.socket = s;
    }
    public void lerResposta() {
        String r = "";
        try {
        InputStreamReader ir = new InputStreamReader(socket.getInputStream());
        BufferedReader br = new BufferedReader(ir);
        String linha = br.readLine();
            while (br.ready()) {
                r += (linha + "\n");
                    linha = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e);
        }
        this.resposta = r;
    }

    public String getResposta(){
        return this.resposta;
    }
}
