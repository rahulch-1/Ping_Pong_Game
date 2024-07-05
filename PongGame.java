import javax.swing.*;

public class PongGame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            String[] options = {"Single Player", "Double Player"};
            int choice = JOptionPane.showOptionDialog(null, "Select Game Mode", "Pong Game",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            GameFrame frame;
            if (choice == 0) {
                frame = new GameFrame(true); // Single Player mode
            } else {
                frame = new GameFrame(false); // Double Player mode
            }
        });
    }
}
