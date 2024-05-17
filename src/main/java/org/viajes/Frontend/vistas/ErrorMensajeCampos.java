package org.viajes.Frontend.vistas;

import net.miginfocom.swing.*;

import javax.swing.*;
/*
 * Created by JFormDesigner on Fri May 10 12:20:37 CEST 2024
 */



/**
 * @author kenneth
 */
public class ErrorMensajeCampos extends JPanel implements VistasInterfaz{
    public ErrorMensajeCampos() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kenneth
        label1 = new JLabel();
        label2 = new JLabel();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border
        .EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing.border.TitledBorder.CENTER,javax
        .swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,
        12),java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans
        .PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("bord\u0065r".equals(e.
        getPropertyName()))throw new RuntimeException();}});
        setLayout(new MigLayout(
            "fill,hidemode 3",
            // columns
            "[fill]",
            // rows
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("\u00a1ERROR!");
        add(label1, "cell 0 0,alignx center,growx 0");

        //---- label2 ----
        label2.setText("Por favor, \u00a1rellene todos los campos! ");
        add(label2, "cell 0 1,alignx center,growx 0");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kenneth
    private JLabel label1;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

public class ErrorMensajeCampos extends JPanel {
	public ErrorMensajeCampos() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Kenneth
		label1 = new JLabel();
		label2 = new JLabel();

		//======== this ========
		setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
		EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder. CENTER, javax. swing
		. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ),
		java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( )
		{  public void propertyChange (java .beans .PropertyChangeEvent e) {if ("b\u006frde\u0072" .equals (e .getPropertyName () ))
		throw new RuntimeException( ); }} );
		setLayout(new MigLayout(
			"fill,hidemode 3",
			// columns
			"[fill]",
			// rows
			"[]" +
			"[]"));

		//---- label1 ----
		label1.setText("\u00a1ERROR!");
		add(label1, "cell 0 0,alignx center,growx 0");

		//---- label2 ----
		label2.setText("Por favor, \u00a1rellene todos los campos! ");
		add(label2, "cell 0 1,alignx center,growx 0");
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Kenneth
	private JLabel label1;
	private JLabel label2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
}
