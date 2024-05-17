package org.viajes.Frontend.controladorVistas;

import vistas.Principal;
import vistas.Registro;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private CardLayout cardLayout;

    public MainFrame() {
        initComponents();
    }

    private void initComponents() {
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Crear instancias de las vistas
        Registro registroPanel = new Registro(mainPanel, cardLayout);
        Principal principalPanel = new Principal();

        // Agregar las vistas al panel principal
        mainPanel.add(registroPanel, "registro");
        mainPanel.add(principalPanel, "principal");

        // Establecer el panel principal como el contenido de la ventana
        getContentPane().add(mainPanel);

        // Configurar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        // Mostrar la vista de registro al inicio
        cardLayout.show(mainPanel, "registro");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame();
            }
        });
    }
}

}
