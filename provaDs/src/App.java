import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame janela = new JFrame();
        janela.setSize(500, 300);

        JPanel painel = new JPanel();
        painel.setSize(150, 150);

        JLabel ldist = new JLabel();
        ldist.setText("Distancia (Km)");
        JTextArea rdist = new JTextArea(2, 20);

        JLabel lpeso = new JLabel();
        lpeso.setText("Peso (Kg)");
        JTextArea rpeso = new JTextArea(2, 20);
        

        JLabel lenvio = new JLabel();
        lenvio.setText("Envio (Expresso ou Padrão)");
        JTextArea renvio = new JTextArea(2, 20);
       

        JButton btn = new JButton("Calcular");

        JLabel mensage = new JLabel();

        btn.addActionListener(e -> {
            String distancia = rdist.getText();
            String peso = rpeso.getText();
            String envio = renvio.getText();

            double base = 10.00;
            double kmrod = (Double.parseDouble(distancia) * 0.50);

            double vfinal = kmrod + base;

            if (Double.parseDouble(peso) >= 20.00) {
                vfinal += 30;
            }

            if (envio.equals("expresso")) {
                double taxa = vfinal * 0.2;
                vfinal += taxa;
            }

            mensage.setText("Resultado = " + vfinal);

        });

        painel.add(ldist);
        painel.add(rdist);

        painel.add(lpeso);
        painel.add(rpeso);

        painel.add(lenvio);
        painel.add(renvio);

        painel.add(btn);

        painel.add(mensage);

        janela.add(painel);

        janela.setVisible(true);
    }
}
