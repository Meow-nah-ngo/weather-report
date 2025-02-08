import java.awt.Font;
import javax.swing.*;

public class WeatherReport extends JFrame {
    public WeatherReport() {
        // Set up GUI and add a title
        super("WeatherReport.app");

        // Configure to end program's process once it has been closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Set size GUI (pixels)
        setSize(450, 650);

        // Load GUI at the center of the screen
        setLocationRelativeTo(null);

        // Make layout manager null to manually position the component within the GUI
        setLayout(null);

        // Prevent any resize GUI
        setResizable(false);

        addGUIcomponents();

    }
    private void addGUIcomponents(){

        //search field
        JTextField searchJTextField = new JTextField();

        //set the location and set our component
        searchJTextField.setBounds(15,15,351,45);
        
        //change the font style and size
        searchJTextField.setFont(new Font("Dialog",Font.PLAIN,24));
    }
    
}
