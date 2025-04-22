import java.awt.Cursor;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
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
    @SuppressWarnings("empty-statement")
    private void addGUIcomponents(){

        //search field
        JTextField searchJTextField = new JTextField();

        //set the location and set our component
        searchJTextField.setBounds(15,15,351,45);

        //change the font style and size
        searchJTextField.setFont(new Font("Dialog",Font.PLAIN,24));

        add(searchJTextField);

        //search button
        JButton searchButton = new JButton(loadImage("weatherapp_images/search.png"));

        //change the cusor to hand cursor when hovering over this button
        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchButton.setBounds(375,13,47,45);
        add(searchButton);

        //weather image
        JLabel weatherConditionImage = new JLabel(loadImage("weatherapp_images/cloudy.png"));
        weatherConditionImage.setBounds(0,125,450,217);
        add(weatherConditionImage);

        //temperature text
        JLabel temperatureText = new JLabel(" 19C");
        temperatureText.setBounds(0,350,450,54);
        temperatureText.setFont(new Font("Dialog",Font.BOLD,48));

        //center the text
        temperatureText.setHorizontalAlignment(SwingConstants.CENTER);
        add(temperatureText);

        //weather condition description
        JLabel weatherConditionDesc = new JLabel("Cloudy");
        weatherConditionDesc.setBounds(0,405,450,36);
        weatherConditionDesc.setFont(new Font("Dialog",Font.PLAIN,32));
        weatherConditionDesc.setHorizontalAlignment(SwingConstants.CENTER);
        add(weatherConditionDesc);

        //humidity image
        JLabel humidityImage = new JLabel(loadImage("weatherapp_images/humidity.png"));
        humidityImage.setBounds(15,500,74,66);
        add(humidityImage);

        //humidity text
        JLabel humidityText = new JLabel("<html><b>Humidity</b> 100%</html>");
        humidityText.setBounds(90,500,85,55);
        humidityText.setFont(new Font("Dialog",Font.PLAIN,16));
        add(humidityText);

        //windspeed image
        JLabel windspeedImage = new JLabel(loadImage("weatherapp_images/windspeed.png"));
        windspeedImage.setBounds(220,500,74,66);
        add(windspeedImage);

        //windspeed text
        JLabel windspeedText = new JLabel("<html><b>Windspeed</b> 15km/h</html>");
        windspeedText.setBounds(310,500,85,55);
        windspeedText.setFont(new Font("Dialog",Font.PLAIN,16));
        add(windspeedText);

    }   

    // use to create images in GUI components
    @SuppressWarnings("CallToPrintStackTrace")
    private ImageIcon loadImage(String resourcePath) {
        try {
            // Read the image file from the path given
            BufferedImage image = ImageIO.read(new File(resourcePath));
            // Return so that our component can render
            return new ImageIcon(image);
        } catch (IOException e) {
            System.out.println("Could not find resource: " + resourcePath);
            e.printStackTrace();
        }
        return null;
    }
    
}
