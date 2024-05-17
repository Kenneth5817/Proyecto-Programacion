package org.viajes.Frontend.vistas;

import net.miginfocom.swing.*;

import javax.swing.*;
import java.awt.*;
/*
 * Created by JFormDesigner on Fri May 10 12:40:19 CEST 2024
 */



/**
 * @author kenneth
 */
public class VentanaOpcionCorrecta extends JPanel implements VistasInterfaz{
    public VentanaOpcionCorrecta() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kenneth
        label1 = new JLabel();
        label2 = new JLabel();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
        . EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder. CENTER, javax
        . swing. border. TitledBorder. BOTTOM, new Font ("Dia\u006cog" ,Font .BOLD ,
        12 ), Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans
        . PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .
        getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(new MigLayout(
            "fill,hidemode 3",
            // columns
            "[fill]",
            // rows
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("   \u2714  \u00a1GENIAL!   \u2714  ");
        label1.setForeground(Color.green);
        add(label1, "cell 0 0,alignx center,growx 0");

        //---- label2 ----
        label2.setText("Campo a\u00f1adido correctamente");
        add(label2, "cell 0 1,alignx center,growx 0");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kenneth
    private JLabel label1;
    private JLabel label2;@Override
    public void mostrar() {

    }@Override
    public void ocultar() {

    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
