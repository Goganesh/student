package ru.student3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;

public class Form extends JFrame implements ActionListener {

    private JFrame frame;
    private JPanel panel;

    private JTextField catalogText;
    private JLabel catalogLabel;
    private JTextField extensionText;
    private JLabel extensionLabel;
    private JButton button;
    private JTextArea textArea;

    private FileFinder fileFinder;


    public Form(){
        this.frame = new JFrame("fileFindForm");
        this.catalogText = new JTextField(16);
        this.catalogLabel = new JLabel("enter the catalog name");
        this.catalogLabel.setLabelFor(this.catalogText);
        this.extensionText = new JTextField(16);
        this.extensionLabel = new JLabel("enter the file extension");
        this.extensionLabel.setLabelFor(this.extensionText);
        this.button = new JButton("submit");
        this.textArea = new JTextArea();

        this.panel = new JPanel();
        panel.add(catalogText);
        panel.add(catalogLabel);
        panel.add(extensionText);
        panel.add(extensionLabel);
        panel.add(button);
        panel.add(textArea);

        fileFinder = new FileFinder();
    }

    public void findAllFile(){
        getButton().addActionListener(this);

        getFrame().add(panel);
        getFrame().setSize(300, 300);

        getFrame().show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        List<String> files = null;

        String s = e.getActionCommand();
        if(s.equals("submit")){
            try {
                files = fileFinder.getAllFilesForPathAndExtension(catalogText.getText(), extensionText.getText());
            } catch (IOException ioException) {

                ioException.printStackTrace();
            }
        }

        for(String fileName : files){
            textArea.append(fileName + "\n");
        }

        frame.show();
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    public JLabel getCatalogLabel() {
        return catalogLabel;
    }

    public void setCatalogLabel(JLabel catalogLabel) {
        this.catalogLabel = catalogLabel;
    }

    public JLabel getExtensionLabel() {
        return extensionLabel;
    }

    public void setExtensionLabel(JLabel extensionLabel) {
        this.extensionLabel = extensionLabel;
    }

    public JTextField getCatalogText() {
        return catalogText;
    }

    public void setCatalogText(JTextField catalogText) {
        this.catalogText = catalogText;
    }

    public JTextField getExtensionText() {
        return extensionText;
    }

    public void setExtensionText(JTextField extensionText) {
        this.extensionText = extensionText;
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
}
