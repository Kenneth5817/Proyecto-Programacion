package org.viajes.Frontend.vistas;

import net.miginfocom.swing.*;

import javax.swing.*;
import java.awt.*;
/*
 * Created by JFormDesigner on Fri May 10 12:28:59 CEST 2024
 */



/**
 * @author kenneth
 */
public class ErrorMensaje extends JPanel implements VistasInterfaz{
    public ErrorMensaje() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Kenneth
		label1 = new JLabel();
		label2 = new JLabel();

		//======== this ========
		setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
		border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing. border. TitledBorder. CENTER
		, javax. swing. border. TitledBorder. BOTTOM, new Font ("D\u0069al\u006fg" ,Font
		.BOLD ,12 ), Color. red) , getBorder( )) );  addPropertyChangeListener (
		new java. beans. PropertyChangeListener( ){  public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062or\u0064er"
		.equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
		setLayout(new MigLayout(
			"fill,hidemode 3,alignx center",
			// columns
			"[fill]",
			// rows
			"[]" +
			"[]"));

		//---- label1 ----
		label1.setText("X      ERROR       X");
		label1.setForeground(Color.pink);
		add(label1, "cell 0 0,alignx center,growx 0");

		//---- label2 ----
		label2.setText("Los datos introducidos son incorrectos. ");
		add(label2, "cell 0 1,alignx center,growx 0,wmin 50");
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
