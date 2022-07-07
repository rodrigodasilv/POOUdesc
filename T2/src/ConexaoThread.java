import java.io.IOException;

public class ConexaoThread extends Thread{
    @Override
    public void run() {
        GerenciadorDeConexao g = new GerenciadorDeConexao();
        try {
            g.fazerConexao();
            g.fazerRequisicao();
            MostradorDePagina w = new MostradorDePagina(g.lerResposta());
            g.fecharConexao();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
