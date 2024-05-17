/*
 * Created by JFormDesigner on Thu May 09 19:14:07 CEST 2024
 */

package org.viajes.Frontend.vistas;

import net.miginfocom.swing.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 * @author kenneth
 */
public class ventanaExtras extends JPanel {
    public String[] getExtrasSeleccionados;

    public ventanaExtras() {
        initComponents();
    }

    //Cuando el usuario marque el botón enviar datos, se cambiará a la ventana PrecioFinal
    private void jButton1ActionPerformed(ActionEvent e) {
        PrecioFinal precioFinal = new PrecioFinal();
        precioFinal.setVisible(true);
        this.setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Daniel Clavijo
        label1 = new JLabel();
        checkBox1 = new JCheckBox();
        checkBox3 = new JCheckBox();
        checkBox2 = new JCheckBox();
        button1 = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
        . swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing
        . border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new
        Font ("D\u0069alog" ,Font .BOLD ,12 ), Color. red
        ) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override
        public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName (
        ) )) throw new RuntimeException( ); }} );
        setLayout(new MigLayout(
            "fill,hidemode 3",
            // columns
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("Elige tu extra:");
        label1.setFont(new Font("Calibri", label1.getFont().getStyle(), label1.getFont().getSize()));
        add(label1, "cell 0 0,alignx center,growx 0,wmin 140");

        //---- checkBox1 ----
        checkBox1.setText("Equipaje de Cabina (10kg)");
        checkBox1.setFont(new Font("Calibri", checkBox1.getFont().getStyle(), checkBox1.getFont().getSize()));
        add(checkBox1, "cell 0 1,alignx center,growx 0,wmin 140");

        //---- checkBox3 ----
        checkBox3.setText("Maleta facturada hasta 20kg");
        checkBox3.setFont(new Font("Calibri", checkBox3.getFont().getStyle(), checkBox3.getFont().getSize()));
        add(checkBox3, "cell 1 1,alignx center,growx 0,wmin 140");

        //---- checkBox2 ----
        checkBox2.setText("Asiento Extra");
        checkBox2.setFont(new Font("Calibri", checkBox2.getFont().getStyle(), checkBox2.getFont().getSize()));
        add(checkBox2, "cell 0 2,alignx center,growx 0,wmin 140");

        //---- button1 ----
        button1.setText("Enviar Datos");
        button1.setFont(new Font("Calibri", button1.getFont().getStyle(), button1.getFont().getSize()));
        add(button1, "cell 1 2,alignx center,growx 0,wmin 50");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kenneth Jensen
    private JLabel label1;
    private JCheckBox checkBox1;
    private JCheckBox checkBox3;
    private JCheckBox checkBox2;
    private JButton button1;public String[] getExtrasSeleccionados() {}
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    public String[] getExtrasSeleccionados() {
        List<String> extrasSeleccionados = new ArrayList<>();
        if (checkBox1.isSelected()) {
            extrasSeleccionados.add(checkBox1.getText());
        }
        if (checkBox2.isSelected()) {
            extrasSeleccionados.add(checkBox2.getText());
        }
        if (checkBox3.isSelected()) {
            extrasSeleccionados.add(checkBox3.getText());
        }
        return extrasSeleccionados.toArray(new String[0]);
    }
}