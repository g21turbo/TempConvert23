import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TemperatureConverterGUI extends JFrame {
    private JTextField celsiusField;
    private JLabel celsiusLabel;
    private JButton convertButton;
    private JLabel fahrenheitLabel;
    private JLabel kelvinLabel;
    private JLabel rankineLabel;

    public TemperatureConverterGUI() {
        super("Temperature Converter");
        setLayout(new FlowLayout());

        celsiusLabel = new JLabel("Enter temperature in Celsius: ");
        add(celsiusLabel);

        celsiusField = new JTextField(10);
        add(celsiusField);

        convertButton = new JButton("Convert");
        add(convertButton);

        fahrenheitLabel = new JLabel();
        add(fahrenheitLabel);

        kelvinLabel = new JLabel();
        add(kelvinLabel);

        rankineLabel = new JLabel();
        add(rankineLabel);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double celsius = Double.parseDouble(celsiusField.getText());
                double fahrenheit = (celsius * 9/5) + 32;
                double kelvin = celsius + 273.15;
                double rankine = (celsius + 273.15) * 9/5;
                fahrenheitLabel.setText(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
                kelvinLabel.setText(celsius + " degrees Celsius is equal to " + kelvin + " degrees Kelvin.");
                rankineLabel.setText(celsius + " degrees Celsius is equal to " + rankine + " degrees Rankine.");
            }
        });
    }

    public static void main(String[] args) {
        TemperatureConverterGUI temperatureConverter = new TemperatureConverterGUI();
        temperatureConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        temperatureConverter.setSize(400, 200);
        temperatureConverter.setVisible(true);
    }
}
