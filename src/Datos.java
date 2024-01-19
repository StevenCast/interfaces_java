import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Datos extends JFrame{
    private JPanel panel1;
    private JButton saludarButton;
    private JButton sumarButton;
    private JButton cerrarButton;
    private JTextField txtval1;
    private JTextField txtval2;
    private JButton limpiarButton;
    private JTextField txtval3;
    private JButton unirButton;


    public Datos(){
        super("Operaciones");
        setContentPane(panel1);
        cerrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtval1.setText("");
                txtval2.setText("");
                txtval3.setText("");
            }
        });
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valor1 = txtval1.getText();
                String valor2 = txtval2.getText();
                try{
                    double num1 = Double.parseDouble(valor1);
                    double num2 = Double.parseDouble(valor2);
                    double resultado = num1+num2;
                    String resultadoTxt = String.valueOf(resultado);
                    txtval3.setText(resultadoTxt);
                } catch (Exception error){
                    txtval3.setText("Error no puedes ingresar palabras");
                }

            }
        });
        unirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String val1 = txtval1.getText();
                String val2 = txtval2.getText();
                try{
                    String resultado = val1+" "+val2;
                    txtval3.setText(resultado);
                } catch (Exception error){
                    txtval3.setText("Error al realizar la operacion");
                }
            }
        });
        saludarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    txtval3.setText("ALO?");
                } catch (Exception error){
                    System.out.println("Error: "+ error.getMessage());

                }
            }
        });
    }

}
