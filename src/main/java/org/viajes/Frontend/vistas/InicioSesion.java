package org.viajes.Frontend.vistas;

import controladorVistas.Controlador;
import net.miginfocom.swing.*;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InicioSesion extends JPanel implements VistasInterfaz {
    public InicioSesion() {
        initComponents();
    }

    //Si pulsa inciar sesion le abrirá la ventana de opcion correcta y a continuación la principal
    private void jButton1ActionPerformed(ActionEvent e) {
        VentanaOpcionCorrecta ventanaOpcionCorrecta = new VentanaOpcionCorrecta();
        ventanaOpcionCorrecta.setVisible(true);
        this.setVisible(false);
        Principal principal = new Principal();
        principal.setVisible(true);
        this.setVisible(false);
    }

    //Si pulsa registrarse, le lleva a la ventana de registrarse
    private void jButton2ActionPerformed(ActionEvent e) {
        Registro registro = new Registro();
        registro.setVisible(true);
        this.setVisible(false);
    }

    @Override
    public void mostrar() {
        setVisible(true);
    }

    @Override
    public void ocultar() {
        setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        passwordField1 = new JPasswordField();
        button2 = new JButton();

        setBorder(new CompoundBorder(new TitledBorder(new EmptyBorder(0, 0, 0, 0), "JFormDesigner Evaluation", TitledBorder.CENTER, TitledBorder.BOTTOM, new Font("Dialog", Font.BOLD, 12), Color.red), getBorder()));
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            @Override
            public void propertyChange(java.beans.PropertyChangeEvent e) {
                if ("border".equals(e.getPropertyName())) throw new RuntimeException();
            }
        });
        setLayout(new MigLayout(
                "fill,hidemode 3",
                "[fill]" +
                        "[fill]",
                "[]" +
                        "[]" +
                        "[]"));

        label1.setText("Usuario:");
        label1.setFont(new Font("Calibri", label1.getFont().getStyle(), label1.getFont().getSize()));
        add(label1, "cell 0 0,alignx center,growx 0");

        textField1.setBackground(new Color(0x77346e93, true));
        textField1.setFont(new Font("Calibri", textField1.getFont().getStyle(), textField1.getFont().getSize()));
        textField1.setBorder(new EtchedBorder());
        add(textField1, "cell 1 0,alignx center,growx 0,wmin 140");

        label2.setText("Contrase\u00f1a:");
        label2.setFont(new Font("Calibri", label2.getFont().getStyle(), label2.getFont().getSize()));
        add(label2, "cell 0 1,alignx center,growx 0");

        passwordField1.setFont(new Font("Calibri", passwordField1.getFont().getStyle(), passwordField1.getFont().getSize()));
        passwordField1.setBorder(new EtchedBorder());
        passwordField1.setBackground(new Color(0x77346e93, true));
        add(passwordField1, "cell 1 1,alignx center,growx 0,wmin 140");

        button2.setText("Iniciar Sesi\u00f3n");
        button2.setFont(new Font("Calibri", button2.getFont().getStyle(), button2.getFont().getSize()));
        button2.setBackground(new Color(0x324d6d));
        add(button2, "pad 0,cell 0 2,alignx center,growx 0");


        //PROGRAMACIÓN//
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //sI HAY CAMPOS VACIOS, MOSTRARÁ MENSAJE DE ERROR
                if (textField1.getText().isEmpty() || new String(passwordField1.getPassword()).isEmpty()) {
                    JFrame errorFrame = new JFrame("Error");
                    errorFrame.setContentPane(new ErrorMensajeCampos());
                    errorFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    errorFrame.pack();
                    errorFrame.setVisible(true);
                } else {
                    // Si los datos son correctos, mostramos la ventana de confirmación
                    JFrame confirmationFrame = new JFrame("Confirmación");
                    confirmationFrame.setContentPane(new VentanaOpcionCorrecta());
                    confirmationFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    confirmationFrame.pack();
                    confirmationFrame.setVisible(true);

                    Timer timer = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt) {
                            confirmationFrame.dispose();
                            // Y pasamos a mostrar la ventana Principal
                            JFrame mainFrame = new JFrame("Pantalla Principal");
                            mainFrame.setContentPane(new Principal());
                            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            mainFrame.pack();
                            mainFrame.setVisible(true);

                            SwingUtilities.getWindowAncestor(InicioSesion.this).dispose();
                        }
                    });
                    timer.setRepeats(false);
                    timer.start();
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = textField1.getText();
                String contrasena = new String(passwordField1.getPassword());

                // Llamamos al método iniciarSesion del controlador donde se pasaran los datos
                Controlador.getInstance().iniciarSesion(usuario, contrasena);
            }
        });


        //Si no se ha registrado, al pulsar en el boton le llevará a la ventana de Registro
        JButton button3 = new JButton("¿Aún no te has registrado?");
        button3.setFont(new Font("Calibri", button3.getFont().getStyle(), button3.getFont().getSize()));
        button3.setBackground(new Color(0x324d6d));
        add(button3, "pad 0,cell 1 2,alignx center,growx 0");

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar la ventana de registro
                JFrame registroFrame = new JFrame("Registro");
                registroFrame.setContentPane(new Registro());
                registroFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                registroFrame.pack();
                registroFrame.setVisible(true);
            }
        });
    }

    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JPasswordField passwordField1;
    private JButton button2;
}
