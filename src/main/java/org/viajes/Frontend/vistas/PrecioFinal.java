package org.viajes.Frontend.vistas;

import net.miginfocom.swing.*;

import javax.swing.*;
/*
 * Created by JFormDesigner on Fri May 10 12:35:01 CEST 2024
 */



/**
 * @author kenneth
 */
public class PrecioFinal extends JPanel implements VistasInterfaz{
    public PrecioFinal() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kenneth
        label1 = new JLabel();
        button1 = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
        border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing. border. TitledBorder. CENTER
        , javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dialo\u0067" ,java .awt .Font
        .BOLD ,12 ), java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (
        new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("borde\u0072"
        .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(new MigLayout(
            "fill,hidemode 3,alignx center",
            // columns
            "[fill]",
            // rows
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("                    EL PRECIO DEL VIAJE  ES DE:             ");
        add(label1, "cell 0 0,alignx center,growx 0");

        //---- button1 ----
        button1.setText("PRECIO");
        add(button1, "cell 0 1");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kenneth
    private JLabel label1;
    private JButton button1;@Override
    public void mostrar() {

    }@Override
    public void ocultar() {

    }public void setPrecioFinal(double precio) {}
         label1.setText("El precio del viaje es de: $" + PrecioFinal);
}
