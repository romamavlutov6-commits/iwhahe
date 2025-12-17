package practice24.Task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EditorFrame extends JFrame {
    private IDocument currentDocument;
    private ICreateDocument documentFactory;

    public EditorFrame(ICreateDocument factory) {
        this.documentFactory = factory;

        setTitle("Редактор");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel menuPanel = new JPanel();

        menuPanel.setBackground(Color.LIGHT_GRAY);

        JButton newBtn = new JButton("File: New");
        JButton openBtn = new JButton("File: Open");
        JButton saveBtn = new JButton("File: Save");
        JButton exitBtn = new JButton("File: Exit");

        // Обработчики
        newBtn.addActionListener(e -> {
            System.out.println(">>> File -> New");
            currentDocument = documentFactory.createNew();
            if (currentDocument != null) currentDocument.open();
        });

        openBtn.addActionListener(e -> {
            System.out.println(">>> File -> Open");
            currentDocument = documentFactory.createOpen();
            if (currentDocument != null) currentDocument.open();
        });

        saveBtn.addActionListener(e -> {
            System.out.println(">>> File -> Save");
            if (currentDocument != null) {
                currentDocument.save();
            } else {
                System.out.println("Документ не создан!");
            }
        });

        exitBtn.addActionListener(e -> {
            System.out.println(">>> File -> Exit");
            if (currentDocument != null) currentDocument.close();
            System.exit(0);
        });

        menuPanel.add(newBtn);
        menuPanel.add(openBtn);
        menuPanel.add(saveBtn);
        menuPanel.add(exitBtn);



        add(menuPanel, BorderLayout.NORTH);




        setLocationRelativeTo(null);
    }
}