package models;

import views.usuario.UsuarioListFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TaskHubApp extends JFrame {
    private static final String EMPTY_SCREEN = "EMPTY_SCREEN" ;
    private static final String USUARIO_SCREEN = "USUARIO_SCREEN";
    private final CardLayout cardLayout;
    private final JPanel mainPanel;

    public TaskHubApp(){
        setTitle("Task Hub Application");
        setSize(800,600);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        //tela inicial
        JPanel emptyPanel = new JPanel(new BorderLayout());
        emptyPanel.add(new JLabel("Bem Vindo! Use o menu para navegar", SwingUtilities.CENTER),BorderLayout.CENTER);

        //Tela Usuario
        UsuarioListFrame usuariosPanel = new UsuarioListFrame();

        // Adicionar os cards no mainPanel
        mainPanel.add(emptyPanel, EMPTY_SCREEN);
        mainPanel.add(usuariosPanel, USUARIO_SCREEN);

        // Menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");

        JMenuItem loginItem = new JMenuItem("login");
        JMenuItem usuarioListItem = new JMenuItem("Listar Usuario");
        JMenuItem exitItem = new JMenuItem("Sair");

        menu.add(loginItem);
        menu.add(usuarioListItem);
        menu.add(exitItem);

        menuBar.add(menu);
        setJMenuBar(menuBar);

        add(mainPanel);

        // Eventos
        loginItem.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(this,"Login - nao foi implementado ainda");
        });

        usuarioListItem.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(this,"Login - nao foi implementado ainda");
        });

        exitItem.addActionListener((ActionEvent e) -> {
            dispose();
        });
    }

    public static void main(String[] args) {
        System.setProperty("sun.java2d.uiScale","2.0");
        SwingUtilities.invokeLater(() -> {
            new TaskHubApp().setVisible(true);
        });
    }
}
