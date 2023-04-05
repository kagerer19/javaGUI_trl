import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        // Set Instance of JFrame!

        JFrame frame = new JFrame("My login screen!");

        //Setting Width and Height of the frame.
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel. Like a DIV tag in HTML
        // Inside these panels you can add text fields, buttons etc.

        JPanel panel = new JPanel();
        // Add panel to frame
        frame.add(panel);
        // Here you can add user defined methods for adding components to the panel.

        placeComponents(panel);

        // Set frame visibility to true.
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        // This is where you can set layouts

        panel.setLayout(null);

        // Create a Label
        JLabel userLabel = new JLabel("Username:");

        /* Specifies the location and size
         * of component. setBounds(x, y, width, height)
         * here (x,y) are coordinates from the top left
         * corner and remaining two arguments are the width
         * and height of the component.
         */

        userLabel.setBounds(10, 20,80,25);
        panel.add(userLabel);

        // Text field for user to input userName
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        // Password label

        JLabel passwordLabel = new JLabel("password:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        // Password Field same as username but this time we don't want to show the text, it should be hidden.
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        JButton signUpButton = new JButton("Sign Up");
        signUpButton.setBounds(100,80,80,25);
        panel.add(signUpButton);

        JButton  loginButton = new JButton("Login");
        loginButton.setBounds(185,80,80,25);
        panel.add(loginButton);


    }
}