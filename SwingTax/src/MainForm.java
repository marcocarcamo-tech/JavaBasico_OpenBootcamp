import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainForm {
    private JTextPane pricePane;
    private JTextPane taxPane;
    private JTextPane totalPane;
    private JLabel IVA;
    private JLabel Total;
    private JButton buttonCalculate;
    private JPanel appPanel;

    public MainForm (){
        buttonCalculate.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                double p = Double.parseDouble(pricePane.getText());
                double t = Double.parseDouble((taxPane.getText()));

                double result = p + (p / 100 * t);
                totalPane.setText(Double.toString(result));
            }
        });

        pricePane.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e){
                super.keyTyped(e);
                pricePane.getText();
            }
        });
    }
    public static void main(String[] args) {

        JFrame frame = new JFrame("Tax Calculator");


        frame.setContentPane(new MainForm().appPanel);
        frame.setVisible(true);
    }
}
