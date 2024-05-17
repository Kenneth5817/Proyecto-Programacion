package org.viajes.Frontend.vistas;

import net.miginfocom.swing.*;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registro extends JPanel implements VistasInterfaz {
    private JPanel parentPanel;  // Panel principal que contiene todas las vistas
    private CardLayout cardLayout;  // Layout para cambiar entre vistas

    public Registro(JPanel parentPanel, CardLayout cardLayout) {
        this.parentPanel = parentPanel;
        this.cardLayout = cardLayout;
        initComponents();
    }

    public Registro() {

    }

    //Cuando le de a iniciarSesion, muestra la pantala iniciar Sesion
    private void jButton1ActionPerformed(ActionEvent e) {
        InicioSesion inicioSesion = new InicioSesion();
        inicioSesion.setVisible(true);
    }

    //Cuando pulsa el boton registrarse le muestra el mensaje de correcto y se dirige a la principal
    private void jButton2ActionPerformed(ActionEvent e) {
        VentanaOpcionCorrecta correcto = new VentanaOpcionCorrecta();
        correcto.setVisible(true);
        Principal principal = new Principal();
        principal.setVisible(true);
        this.setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Kenneth
        panel1 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        textField3 = new JTextField();
        label4 = new JLabel();
        textField4 = new JTextField();
        button2 = new JButton();
        button1 = new JButton();

        //======== panel1 ========
        {
            panel1.setBorder (new CompoundBorder( new TitledBorder (new EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", TitledBorder. CENTER, TitledBorder. BOTTOM, new Font ("Dia\u006cog" , Font .BOLD ,
            12 ), Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans
            . PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .
            getPropertyName () )) throw new RuntimeException( ); }} );
            panel1.setLayout(new MigLayout(
                "fill,hidemode 3",
                // columns
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label1 ----
            label1.setText("Usuario");
            label1.setFont(new Font("Calibri", label1.getFont().getStyle(), label1.getFont().getSize()));
            panel1.add(label1, "cell 0 0,alignx center,growx 0");

            //---- textField1 ----
            textField1.setBackground(new Color(0x77346e93, true));
            textField1.setFont(new Font("Calibri", textField1.getFont().getStyle(), textField1.getFont().getSize()));
            textField1.setBorder(new EtchedBorder());
            panel1.add(textField1, "cell 1 0,alignx center,growx 0,wmin 140");

            //---- label2 ----
            label2.setText("Contrase\u00f1a");
            label2.setFont(new Font("Calibri", label2.getFont().getStyle(), label2.getFont().getSize()));
            panel1.add(label2, "cell 0 1,alignx center,growx 0");

            //---- textField2 ----
            textField2.setBackground(new Color(0x77346e93, true));
            textField2.setFont(new Font("Calibri", textField2.getFont().getStyle(), textField2.getFont().getSize()));
            textField2.setBorder(new EtchedBorder());
            panel1.add(textField2, "cell 1 1,alignx center,growx 0,wmin 140");

            //---- label3 ----
            label3.setText("Correo Electr\u00f3nico");
            label3.setFont(new Font("Calibri", label3.getFont().getStyle(), label3.getFont().getSize()));
            panel1.add(label3, "cell 0 2,alignx center,growx 0");

            //---- textField3 ----
            textField3.setBackground(new Color(0x77346e93, true));
            textField3.setFont(new Font("Calibri", textField3.getFont().getStyle(), textField3.getFont().getSize()));
            textField3.setBorder(new EtchedBorder());
            panel1.add(textField3, "cell 1 2,alignx center,growx 0,wmin 140");

            //---- label4 ----
            label4.setText("Tel\u00e9fono");
            label4.setFont(new Font("Calibri", label4.getFont().getStyle(), label4.getFont().getSize()));
            panel1.add(label4, "cell 0 3,alignx center,growx 0");

            //---- textField4 ----
            textField4.setBackground(new Color(0x77346e93, true));
            textField4.setFont(new Font("Calibri", textField4.getFont().getStyle(), textField4.getFont().getSize()));
            textField4.setBorder(new EtchedBorder());
            panel1.add(textField4, "cell 1 3,alignx center,growx 0,wmin 140");

            //---- button2 ----
            button2.setText("Reg\u00edstrate");
            button2.setFont(new Font("Calibri", button2.getFont().getStyle(), button2.getFont().getSize()));
            button2.setBackground(new Color(0x324d6d));
            panel1.add(button2, "pad 0,cell 0 4,alignx center,growx 0");

            //---- button1 ----
            button1.setText("\u00bfYa te has registrado antes? Inicia sesi\u00f3n");
            panel1.add(button1, "cell 1 4");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrar();
            }
        });
        textField5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cambiar a la vista de inicio de sesión
                cardLayout.show(parentPanel, "inicioSesion");
            }
        });
    }

    @Override
    public void mostrar() {
        setVisible(true);
    }

    @Override
    public void ocultar() {
        setVisible(false);
    }

    private void registrar() {
        // Verificar si algún campo está vacío
        if (textField1.getText().isEmpty() || textField2.getText().isEmpty() ||
                textField3.getText().isEmpty() || textField4.getText().isEmpty()) {
            // Si algún campo está vacío, mostrar ventana de mensaje de error
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Si todos los campos están completos, mostrar ventana de confirmación
            JOptionPane.showMessageDialog(this, "Registro exitoso.", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
            // Cambiar a la vista principal
            cardLayout.show(parentPanel, "principal");
        }
    }

    private void irAInicioSesion() {
        // Cambiar a la vista de inicio de sesión
        cardLayout.show(parentPanel, "InicioSesion");
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kenneth
    private JPanel panel1;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JTextField textField3;
    private JLabel label4;
    private JTextField textField4;
    private JButton button2;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}