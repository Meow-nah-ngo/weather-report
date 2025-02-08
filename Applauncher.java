import javax.swing.*;
public class AppLauncher {
    public static void main(String[] args) {
        
        // ใช้ Lambda expression แทน Anonymous inner class
        SwingUtilities.invokeLater(() -> new WeatherReport().setVisible(true));
    }
}
