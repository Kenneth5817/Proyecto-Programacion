package org.viajes.Frontend.vistas;

import controladorVistas.Controlador;
import net.miginfocom.swing.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author kenneth
 */
public class Principal extends JPanel implements VistasInterfaz {
	public Principal() {
		initComponents();
	}

    //Cuando le damos a enviar datos, nos salta la pantalla que nos pregunta si queremos extras
    private void jButton2ActionPerformed(ActionEvent e) {
        ventanaPreguntaExtra preguntaExtra = new ventanaPreguntaExtra();
        preguntaExtra.setVisible(true);
        this.setVisible(false);
    }

    private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kenneth
        label6 = new JLabel();
        label4 = new JLabel();
        comboBox6 = new JComboBox<>();
        comboBox4 = new JComboBox<>();
        label1 = new JLabel();
        label5 = new JLabel();
        comboBox1 = new JComboBox<>();
        comboBox3 = new JComboBox<>();
        label2 = new JLabel();
        label3 = new JLabel();
        comboBox5 = new JComboBox<>();
        comboBox2 = new JComboBox<>();
        button2 = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
        . border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing. border. TitledBorder
        . CENTER, javax. swing. border. TitledBorder. BOTTOM, new Font ("Dialo\u0067" ,Font .BOLD ,12 ), Color. red) , getBorder( )) )
        ;  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
        ) {if ("borde\u0072" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
        ;
        setLayout(new MigLayout(
            "fill,hidemode 3",
            // columns
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- label6 ----
        label6.setText("  Selecciona el tipo de viaje:");
        add(label6, "cell 0 0");

        //---- label4 ----
        label4.setText("Tipo de categor\u00eda:");
        label4.setFont(new Font("Calibri", label4.getFont().getStyle() & ~Font.ITALIC, label4.getFont().getSize()));
        add(label4, "cell 1 0,alignx center,growx 0");

        //---- comboBox6 ----
        comboBox6.setModel(new DefaultComboBoxModel<>(new String[] {
            "IDA ",
            "IDA/VUELTA"
        }));
        comboBox6.setMaximumSize(new Dimension(16767, 32767));
        add(comboBox6, "cell 0 1,alignx center,growx 0");

        //---- comboBox4 ----
        comboBox4.setBackground(new Color(0xc6355f88, true));
        comboBox4.setModel(new DefaultComboBoxModel<>(new String[] {
            "1\u00aa clase",
            "2\u00aa clase",
            "3\u00aa clase"
        }));
        add(comboBox4, "cell 1 1,alignx center,growx 0,wmin 140");

        //---- label1 ----
        label1.setText("Elige tu origen:");
        label1.setFont(new Font("Calibri", label1.getFont().getStyle() & ~Font.ITALIC, label1.getFont().getSize()));
        add(label1, "cell 0 2,alignx center,growx 0");

        //---- label5 ----
        label5.setText("Tipo de transporte:");
        label5.setFont(new Font("Calibri", label5.getFont().getStyle() & ~Font.ITALIC, label5.getFont().getSize()));
        add(label5, "cell 1 2,alignx center,growx 0");

        //---- comboBox1 ----
        comboBox1.setBackground(new Color(0xc6355f88, true));
        comboBox1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
            "M\u00e1laga",
            "Sevilla",
            "Londres",
            "Copenhagen",
            "Hamburgo",
            "Bruselas",
            "Valencia"
        }));
        add(comboBox1, "cell 0 3,alignx center,growx 0,wmin 140");

        //---- comboBox3 ----
        comboBox3.setBackground(new Color(0xc6355f88, true));
        comboBox3.setModel(new DefaultComboBoxModel<>(new String[] {
            "Avi\u00f3n",
            "Tren",
            "Barco"
        }));
        add(comboBox3, "cell 1 3,alignx center,growx 0,wmin 140");

        //---- label2 ----
        label2.setText("Elige tu destino:");
        label2.setFont(new Font("Calibri", label2.getFont().getStyle(), label2.getFont().getSize()));
        add(label2, "cell 0 4,alignx center,growx 0");

        //---- label3 ----
        label3.setText("N\u00fameros de pasajeros");
        label3.setFont(new Font("Calibri", label3.getFont().getStyle(), label3.getFont().getSize()));
        add(label3, "cell 1 4,alignx center,growx 0");

        //---- comboBox5 ----
        comboBox5.setBackground(new Color(0xc6355f88, true));
        comboBox5.setModel(new DefaultComboBoxModel<>(new String[] {
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8"
        }));
        add(comboBox5, "cell 1 4");

        //---- comboBox2 ----
        comboBox2.setBackground(new Color(0xc6355f88, true));
        comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
            "M\u00e1laga",
            "Londres",
            "Sevilla",
            "Madrid",
            "Conpenhagen",
            "Hamburgo"
        }));
        add(comboBox2, "cell 0 5,alignx center,growx 0,wmin 140");

        //---- button2 ----
        button2.setText("Enviar Datos");
        button2.setFont(new Font("Calibri", button2.getFont().getStyle(), button2.getFont().getSize()));
        button2.setBackground(new Color(0x324d6d));
        button2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        button2.setPreferredSize(new Dimension(105, 36));
        add(button2, "cell 1 5,alignx center,growx 0,wmin 80");
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on

		// Añadir ActionListener al botón "Enviar Datos"
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				enviarDatos();
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

	private void enviarDatos() {
		// Suponemos que tenemos una clase Controlador que maneja la navegación entre vistas
		Controlador controlador = Controlador.getInstance();

		// Validamos datos (aquí solo un ejemplo básico de validación)
		if (comboBox1.getSelectedIndex() == -1 || comboBox2.getSelectedIndex() == -1 ||
				comboBox3.getSelectedIndex() == -1 || comboBox4.getSelectedIndex() == -1 ||
				comboBox5.getSelectedIndex() == -1) {
			// Mostramos ventana de fallos si algún campo está vacío
			controlador.mostrarVista(new ErrorMensajeCampos());
		} else {
			JOptionPane.showMessageDialog(this, "Datos enviados correctamente", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
			// Aquí puedes enviar los datos al controlador
			String origen = (String) comboBox1.getSelectedItem();
			String destino = (String) comboBox2.getSelectedItem();
			String tipoTransporte = (String) comboBox3.getSelectedItem();
			String tipoCategoria = (String) comboBox4.getSelectedItem();
			int numeroPasajeros = Integer.parseInt((String) comboBox5.getSelectedItem());
			controlador.enviarDatosDelViaje(origen, destino, tipoTransporte, tipoCategoria, numeroPasajeros);;
            //Hacemos que salte a otra ventana
            ventanaPreguntaExtra ventanaPregExtra = new ventanaPreguntaExtra();
            ventanaPregExtra.setVisible(true);
        }
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kenneth
    private JLabel label6;
    private JLabel label4;
    private JComboBox<String> comboBox6;
    private JComboBox<String> comboBox4;
    private JLabel label1;
    private JLabel label5;
    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox3;
    private JLabel label2;
    private JLabel label3;
    private JComboBox<String> comboBox5;
    private JComboBox<String> comboBox2;
    private JButton button2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}

