import java.io.IOException;
import java.net.Socket;

public class GoogleTalker {
    private Socket socket;
    GReader Leitor;
    GWriter Autor;

    public void fazerConexao() throws IOException {
        socket = new Socket("www.google.com", 80);
    }

    public void fecharConexao() throws IOException {
        socket.close();
    }

    public GoogleTalker() {
        HttpHelper Ajudante = new HttpHelper();
        try {
            this.fazerConexao();
            this.Leitor = new GReader(socket);
            this.Autor = new GWriter(socket);
            Autor.start(Ajudante.getMensagemParaSocket());
            Leitor.lerResposta();
            String Resposta = Leitor.getResposta();
            if(!Ajudante.verificaErroConexao(Resposta)){
                System.out.println(Resposta);
            }else{
                System.out.println("Erro: " + Ajudante.acusaErro(Resposta));
            }
            GScreen Tela = new GScreen(Ajudante.verificaErroConexao(Resposta), Ajudante.acusaErro(Resposta));
            this.fecharConexao();
        }catch (IOException e){
            System.out.println("Erro: " + e);
        }

    }
}
