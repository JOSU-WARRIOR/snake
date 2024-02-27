/**
 * @author JOSUE GUERRERO
 * @version 1.0
 * @since 27/02/2024
 */
import javax.swing.SwingUtilities;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainWindow mw = new MainWindow();
                mw.setSize(600, 400);
                mw.setTitle("Snake and Ladder");
                mw.setVisible(true);
            }
        });
    }

}
