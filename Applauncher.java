
import javax.swing.SwingUtilities;

public class AppLauncher {
    public static void main(String[] args) {
        // Create and show the GUI
        SwingUtilities.invokeLater(() -> {
            new WeatherReport().setVisible(true);
        });
    }
}
