import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new Datos();
                frame.setSize(500,500);
                frame.setVisible(true);
            }
        });
    }
}