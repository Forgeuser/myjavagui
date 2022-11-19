import javax.swing.JOptionPane;
public class GUI {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("enter your name");
        JOptionPane.showMessageDialog(null,"Hello"+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("whats your age"));
        JOptionPane.showMessageDialog(null,"you are"+age+"years old");

        double pi = Integer.parseInt(JOptionPane.showInputDialog("whats the number of pi i forgor"));
        JOptionPane.showMessageDialog(null,"thanks man now i know the number of pi its"+pi+"thanks man!");












    }
}
