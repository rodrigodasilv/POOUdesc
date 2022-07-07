import java.io.*;
import java.net.*;
import java.util.regex.*;
import javax.swing.*;


public class MostradorDePagina extends JFrame {
    static JComponent page;
    public MostradorDePagina(String html){
        setTitle("Google");
        setSize(512, 342);

        JTextPane  jtp = new JTextPane ();
        jtp.setContentType("text/html");
        jtp.setText(html.substring(html.indexOf('<')+15,html.lastIndexOf('>')+1));
        System.out.println(jtp.getText());
        jtp.setEditable(false);
        add(jtp);
        setVisible(true);
    }
}