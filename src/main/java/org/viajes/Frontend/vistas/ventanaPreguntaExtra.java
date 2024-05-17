package org.viajes.Frontend.vistas;

import net.miginfocom.swing.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * Created by JFormDesigner on Fri May 10 12:18:16 CEST 2024
 */



/**
 * @author kenneth
 */
public class ventanaPreguntaExtra extends JPanel implements VistasInterfaz{
    public ventanaPreguntaExtra() {
        initComponents();
    }


	//	Si pulsa si en que quiere extra, pasará a la ventana quiere extra
	private void jButton1ActionPerformed(ActionEvent e) {
		ventanaExtras extras = new ventanaExtras();
		extras.setVisible(true);
		this.setVisible(false);
	}

	//Si pulsa no, mostrará la ventana del precio final
	private void jButton2ActionPerformed(ActionEvent e) {
		PrecioFinal precioFinal = new PrecioFinal();
		precioFinal.setVisible(true);
		this.setVisible(false);
	}

	@Override
	public void mostrar() {

	}

	@Override
	public void ocultar() {

	}


	/**
	 * @author kenneth
	 */
	public class ventanaPreguntaExtra extends JPanel {
		public ventanaPreguntaExtra() {
			initComponents();
		}

		private void initComponents() {
			// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
			// Generated using JFormDesigner Evaluation license - Kenneth
			textField1 = new JTextField();
			button1 = new JButton();
			button2 = new JButton();

			//======== this ========
			setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder
					(0,0,0,0), "JF\u006frmDes\u0069gner \u0045valu\u0074ion",javax.swing.border.TitledBorder.CENTER,javax.swing.border
					.TitledBorder.BOTTOM,new Font("D\u0069alog",Font.BOLD,12),Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){ public void
			propertyChange(java.beans.PropertyChangeEvent e){if("bor\u0064er".equals(e.getPropertyName()))throw new RuntimeException()
					;}});
			setLayout(new MigLayout(
					"fill,hidemode 3",
					// columns
					"[fill]" +
							"[fill]",
					// rows
					"[]" +
							"[]"));

			//---- textField1 ----
			textField1.setText("\u00bfDESEAS ALG\u00daN EXTRA?");
			add(textField1, "cell 0 0 2 1,alignx center,growx 0");

			//---- button1 ----
			button1.setText("SI");
			button1.setBackground(Color.green);
			button1.setForeground(Color.black);
			add(button1, "cell 0 1");

			//---- button2 ----
			button2.setText("NO");
			button2.setBackground(Color.red);
			add(button2, "cell 1 1");
			// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on

			// PROGRAMACIÓN: LOGICA BOTONES

			//Si es el botón de si, mostrará la ventana de extras
			button1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// Show the extra options window
					JFrame frame = new JFrame("Extras");
					frame.setContentPane(new vistas.ventanaPreguntaExtra());
					frame.pack();
					frame.setVisible(true);
					// Hide the current window
					SwingUtilities.getWindowAncestor(ventanaPreguntaExtra.this).dispose();
				}
			});

			//Si es que no, no mostrará la ventana de extras. Pasará directamente a la final donde muestre el precio
			button2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// Show the final price window (assuming you have a class PrecioFinal)
					JFrame frame = new JFrame("Precio Final");
					frame.setContentPane(new PrecioFinal());
					frame.pack();
					frame.setVisible(true);
					// Escondemos la ventana actual cuando mostramos la otra
					SwingUtilities.getWindowAncestor(ventanaPreguntaExtra.this).dispose();
				}
			});
		}

		// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
		// Generated using JFormDesigner Evaluation license - Kenneth
		private JTextField textField1;
		private JButton button1;
		private JButton button2;
		// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
	}

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kenneth
        textField1 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .EmptyBorder
        ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion" , javax. swing .border . TitledBorder. CENTER ,javax . swing. border
        .TitledBorder . BOTTOM, new Font ( "Dia\u006cog", Font. BOLD ,12 ) ,Color .red ) , getBorder () ) );  addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void
        propertyChange (java . beans. PropertyChangeEvent e) { if( "bord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException( )
        ;} } );
        setLayout(new MigLayout(
            "fill,hidemode 3",
            // columns
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]"));

        //---- textField1 ----
        textField1.setText("\u00bfDESEAS ALG\u00daN EXTRA?");
        add(textField1, "cell 0 0 2 1,alignx center,growx 0");

        //---- button1 ----
        button1.setText("SI");
        button1.setBackground(Color.green);
        button1.setForeground(Color.black);
        add(button1, "cell 0 1");

        //---- button2 ----
        button2.setText("NO");
        button2.setBackground(Color.red);
        add(button2, "cell 1 1");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kenneth
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
