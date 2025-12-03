
package mindfulreads;

import javax.swing.*;
import java.awt.*;

//this class will extend jframe
//will create the main menu window
//purpose is to present the main menu with navigation options
public class AppFrame extends JFrame {

    //constructor
    public AppFrame() {

        // Main Window 
        setTitle("MindfulReads ");
        setSize(450, 400);
        setLayout(null);
        setLocationRelativeTo(null); //centred
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //background
        getContentPane().setBackground(new Color(255, 240, 250)); 

        //  Header
        JPanel header = new JPanel();
        header.setBounds(0, 0, 450, 70);
        header.setBackground(new Color(220, 190, 255)); 
        header.setLayout(null);
        add(header);
        
        //title
        JLabel titleLabel = new JLabel("MindfulReads");
        titleLabel.setBounds(120, 20, 300, 30);
        titleLabel.setForeground(new Color(80, 50, 100));
        titleLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
        header.add(titleLabel);

        // Buttons 
        JButton manageBooksBtn = new JButton("Manage Books");
        manageBooksBtn.setBounds(120, 110, 200, 40);
        styleKawaiiButton(manageBooksBtn, new Color(255, 200, 220));
        add(manageBooksBtn);

        JButton readingTrackerBtn = new JButton("Mood & Reading Tracker");
        readingTrackerBtn.setBounds(120, 170, 200, 40);
        styleKawaiiButton(readingTrackerBtn, new Color(200, 230, 255));
        add(readingTrackerBtn);

        JButton quitBtn = new JButton("Exit ");
        quitBtn.setBounds(140, 240, 160, 40);
        styleKawaiiButton(quitBtn, new Color(255, 180, 180));
        add(quitBtn);
        
       
       
        
        

        // Click actions
        manageBooksBtn.addActionListener(e -> {
            ManageBooksFrame mf = new ManageBooksFrame();
            mf.setVisible(true);
        });
        
        
         readingTrackerBtn.addActionListener(e -> {
    MoodTrackerFrame mf = new MoodTrackerFrame();
    mf.setVisible(true);
});

        
        
        
        
        quitBtn.addActionListener(e -> System.exit(0));
    }

    
   

    
    
    
    
    
    
    // method for all the buttons styling
    private void styleKawaiiButton(JButton btn, Color baseColor) {
        btn.setBackground(baseColor);
        btn.setForeground(new Color(80, 50, 70));
        btn.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createLineBorder(new Color(255, 150, 200), 2));
    }
}
