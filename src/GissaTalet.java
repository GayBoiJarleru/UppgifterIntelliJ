import javax.swing.*;
import java.util.Random;
public class GissaTalet {
    public static void main(String[] args) {


        Random random = new Random();
        int Random = random.nextInt(100);
        while (true) {
            String Pang = JOptionPane.showInputDialog(null, "skriv ett tal mellan 1 och 100");
            int Tal = Integer.parseInt(Pang);
            if (Random == Tal) {
                JOptionPane.showMessageDialog(null, "rätt");
                break;
            } else if (Random > Tal) {
                JOptionPane.showMessageDialog(null, "Gissa högre");
            } else {
                JOptionPane.showMessageDialog(null, "Gissa Lägre");
            }

        }

    }
}





















