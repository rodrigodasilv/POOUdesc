import java.io.IOException;
import java.net.Socket;

public class HttpHelper {
    String mensagemParaSocket = "GET / HTTP/1.1\nHost: www.google.com";

    String getMensagemParaSocket(){
        return this.mensagemParaSocket;
    }
    Boolean verificaErroConexao(String html){
        if (html.substring(9,12).equals("200")){
            return false;
        }
        return true;
    }

    String acusaErro(String html){
        return html.substring(9,12);
    }
}
