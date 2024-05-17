package org.viajes.Frontend.controladorVistas;

import vistas.*;

import javax.swing.*;
import java.awt.*;

public class Controlador {
    private static Controlador instance;
    private JFrame frame;

    private Controlador() {
        frame = new JFrame("Aplicación");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
    }

    public static Controlador getInstance() {
        if (instance == null) {
            instance = new Controlador();
        }
        return instance;
    }

    public void mostrarVista(VistasInterfaz vista) {
        frame.getContentPane().removeAll();
        frame.getContentPane().add((Component) vista);
        frame.revalidate();
        frame.repaint();
        vista.mostrar();
    }

    public void iniciar() {
        mostrarVista(new Principal());
        frame.setVisible(true);
    }

    public void enviarDatosDelViaje(String origen, String destino, String tipoTransporte, String tipoCategoria, int numeroPasajeros) {
        BackendService.enviarDatosDelViaje(origen, destino, tipoTransporte, tipoCategoria, numeroPasajeros);
    }
    public void iniciarSesion(String usuario, String contrasena) {
        System.out.println("Usuario: " + usuario);
        System.out.println("Contraseña: " + contrasena);
    }

    public void mostrarPrecioFinal(double precio) {
        PrecioFinal precioFinal = new PrecioFinal();
        precioFinal.setPrecioFinal(precio); // Establecer el precio final en la vista
        mostrarVista(precioFinal); // Mostrar la vista del precio final
    }

    private ventanaExtras ventanaExtras; // Variable de instancia para almacenar la ventana de extras

    public void mostrarVentanaExtras() {
        if (ventanaExtras == null) {
            ventanaExtras = new ventanaExtras(); // Creamos una nueva instancia si no existe
        }
        ventanaExtras.setVisible(true); // Mostramos la ventana de extras
    }

    public String[] obtenerExtrasSeleccionados() {
        return ventanaExtras.getExtrasSeleccionados[]();
    }
}
