import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

public class GWriter extends Thread{
    Socket socket;
    PrintStream ps;
    public GWriter(Socket s){
        this.socket = s;
    }
    public void fazerRequisicao(String requisicao){
        this.ps.println(requisicao + "\n");
    }

    public void start(String requisicao) {
        try {
            this.ps = new PrintStream(socket.getOutputStream());
            this.fazerRequisicao(requisicao);
        } catch (IOException e) {
            System.out.println("Erro: " + e);
        }
    }
}
