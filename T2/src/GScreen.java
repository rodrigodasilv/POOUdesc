import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class GScreen extends JFrame {
    public GScreen(Boolean Status, String Codigo){
        super("Google");
        setSize(450, 500);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 1));

        rootPane.setBorder(new EmptyBorder(150,10,150,10));

        if(Status==false){
            add(new TextField());
            add(new JButton("Okay"));
        }else{
            add(new JLabel("Erro: "+ Codigo, JLabel.CENTER));
        }
        setVisible(true);
    }
}
