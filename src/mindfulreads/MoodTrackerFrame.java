package mindfulreads;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoodTrackerFrame extends JFrame {

    private JComboBox<String> moodDropdown;
    private JButton btnRecommend;
    private JTextArea outputArea;

    public MoodTrackerFrame() {
        setTitle("Mood & Reading Tracker");
        setSize(400, 380);
        setLayout(null);                
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        
        getContentPane().setBackground(new Color(255, 240, 250)); // soft pink base

        // Header
        JPanel header = new JPanel();
        header.setBounds(0, 0, 400, 70);
        header.setLayout(null);
        header.setBackground(new Color(220, 190, 255)); // lavender pastel
        add(header);

        JLabel headerLabel = new JLabel("Mood & Reading Tracker");
        headerLabel.setBounds(40, 15, 320, 40);
        headerLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        headerLabel.setForeground(new Color(80, 50, 100));
        header.add(headerLabel);

        // Mood label
        JLabel moodLabel = new JLabel("Select Your Mood:");
        moodLabel.setBounds(40, 95, 140, 25);
        moodLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        moodLabel.setForeground(new Color(80, 50, 70));
        add(moodLabel);

        //  Dropdown
        String[] moods = {"Happy", "Sad", "Stressed", "Romantic", "Adventurous", "Calm", "Motivated"};
        moodDropdown = new JComboBox<>(moods);
        moodDropdown.setBounds(190, 95, 150, 25);
        moodDropdown.setBackground(new Color(255, 225, 235));
        add(moodDropdown);

        //  Recommend button
        btnRecommend = new JButton("Get Recommendation");
        btnRecommend.setBounds(110, 140, 180, 36);
        btnRecommend.setBackground(new Color(255, 200, 220));
        btnRecommend.setForeground(new Color(80, 50, 70));
        btnRecommend.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
        btnRecommend.setFocusPainted(false);
        btnRecommend.setBorder(BorderFactory.createLineBorder(new Color(255, 150, 200), 2));
        add(btnRecommend);

        // multiline Output area 
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);
        outputArea.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        outputArea.setBackground(new Color(255, 245, 250));
        outputArea.setBorder(BorderFactory.createLineBorder(new Color(240, 180, 210), 3));
        JScrollPane sc = new JScrollPane(outputArea);
        sc.setBounds(30, 190, 340, 140);
        add(sc);

        // Action
        btnRecommend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mood = (String) moodDropdown.getSelectedItem();
                showRecommendation(mood);
            }
        });
    }

    private void showRecommendation(String mood) {
        
        String result = "";
        if (mood.equals("Happy")) {
            result = "The Alchemist — Paulo Coelho\n\nA warm, magical short novel about following your dreams.";
        } else if (mood.equals("Sad")) {
            result = "Eleanor Oliphant Is Completely Fine — Gail Honeyman\n\nA comforting story about healing and friendship.";
        } else if (mood.equals("Stressed")) {
            result = "Ikigai — Héctor García\n\nShort practical ideas for calmness and meaningful routines.";
        } else if (mood.equals("Romantic")) {
            result = "The Fault in Our Stars — John Green\n\nEmotional and tender contemporary romance.";
        } else if (mood.equals("Adventurous")) {
            result = "The Hobbit — J.R.R. Tolkien\n\nA classic adventure that lifts the spirit.";
        } else if (mood.equals("Calm")) {
            result = "The Little Prince — Antoine de Saint-Exupéry\n\nA gentle story with quiet wisdom.";
        } else if (mood.equals("Motivated")) {
            result = "Atomic Habits — James Clear\n\nPractical steps to build good habits and momentum.";
        } else {
            result = "No recommendation available.";
        }

        outputArea.setText(result);
    }
}
