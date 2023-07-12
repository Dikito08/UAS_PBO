import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ChatStorage {
    private static ChatStorage instance;
    private JTextArea chatArea;

    private ChatStorage() {
        // Inisialisasi area chat
        chatArea = new JTextArea();
        chatArea.setEditable(false);
    }

    public static ChatStorage getInstance() {
        if (instance == null) {
            instance = new ChatStorage();
        }
        return instance;
    }

    public void appendMessage(String message) {
        chatArea.append(message + "\n");
    }

    public JTextArea getChatArea() {
        return chatArea;
    }
}