package mindfulreads;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ManageBooksFrame extends JFrame {

    private JTextField titleField;
    private JTextField authorField;
    private JTextArea bookListArea;

    private ArrayList<Book> books = new ArrayList<>();

    public ManageBooksFrame() {

        setTitle("Manage Books ");
        setSize(500, 500);
        setLayout(null);
        setLocationRelativeTo(null);

        // background
        getContentPane().setBackground(new Color(255, 245, 255));

        // header
        JPanel header = new JPanel();
        header.setBounds(0, 0, 500, 70);
        header.setBackground(new Color(215, 190, 255)); 
        header.setLayout(null);
        add(header);

        JLabel titleLabel = new JLabel("Manage Books");
        titleLabel.setBounds(150, 20, 300, 30);
        titleLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
        titleLabel.setForeground(new Color(80, 50, 90));
        header.add(titleLabel);

        // Book Title
        JLabel bookTitleLabel = new JLabel("Title:");
        bookTitleLabel.setBounds(40, 90, 120, 30);
        bookTitleLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        add(bookTitleLabel);

        titleField = new JTextField();
        titleField.setBounds(120, 90, 320, 30);
        add(titleField);

        //  Author
        JLabel authorLabel = new JLabel("Author:");
        authorLabel.setBounds(40, 140, 120, 30);
        authorLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        add(authorLabel);

        authorField = new JTextField();
        authorField.setBounds(120, 140, 320, 30);
        add(authorField);

        //  Add Book Button
        JButton addBtn = new JButton("Add Book 🍓");
        addBtn.setBounds(170, 190, 150, 40);
        styleKawaiiButton(addBtn, new Color(255, 200, 220));
        add(addBtn);

        //  Book List Area
        bookListArea = new JTextArea();
        bookListArea.setEditable(false);
        bookListArea.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));

        JScrollPane scrollPane = new JScrollPane(bookListArea);
        scrollPane.setBounds(40, 250, 420, 200);
        scrollPane.setBorder(BorderFactory.createLineBorder(new Color(255, 160, 200), 3));
        add(scrollPane);

        // Action for Add
        addBtn.addActionListener(e -> addBook());
    }

    private void addBook() {

        String t = titleField.getText();
        String a = authorField.getText();

        if (t.isEmpty() || a.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields!");
            return;
        }

        Book b = new Book(t, a);
        books.add(b);

        // show in list
        bookListArea.append("• " + b.getTitle() + " by " + b.getAuthor() + "\n");

        titleField.setText("");
        authorField.setText("");
    }

    private void styleKawaiiButton(JButton btn, Color base) {
        btn.setBackground(base);
        btn.setForeground(new Color(80, 50, 70));
        btn.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createLineBorder(new Color(255, 130, 180), 2));
    }
}
