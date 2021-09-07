/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.principal.controladores;

import gui.areas.controladores.ControladorAreas;
import gui.interfaces.IControladorAreas;
import gui.interfaces.IControladorPersonas;
import gui.interfaces.IControladorPrincipal;
import gui.interfaces.IControladorTrabajos;
//import gui.personas.controladores.ControladorPersonas;
import gui.principal.vistas.VentanaPrincipal;
//import gui.trabajos.controladores.ControladorTrabajos;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class ControladorPrincipal implements IControladorPrincipal {
    private VentanaPrincipal ventana;

    /**
     * Constructor
     * Muestra la ventana principal
     */
    public ControladorPrincipal() {
        this.ventana = new VentanaPrincipal(this);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.setVisible(true);
    }

    /**
     * Acción a ejecutar cuando se selecciona el botón Areas
     * @param evt evento
     */                            
    @Override
    public void btnAreasClic(ActionEvent evt) {
        IControladorAreas controlador = new ControladorAreas(this.ventana);
    }

    /**
     * Acción a ejecutar cuando se selecciona el botón Personas
     * @param evt evento
     */                            
    @Override
    public void btnPersonasClic(ActionEvent evt) {
  //    IControladorPersonas controlador = new ControladorPersonas(this.ventana);
    }

    /**
     * Acción a ejecutar cuando se selecciona el botón Trabajos
     * @param evt evento
     */                            
    @Override
    public void btnTrabajosClic(ActionEvent evt) {
    //    IControladorTrabajos controlador = new ControladorTrabajos(this.ventana);
    }
    
    /**
     * Acción a ejecutar cuando se selecciona el botón Salir
     * @param evt evento
     */                            
    @Override
    public void btnSalirClic(ActionEvent evt) {
        int opcion = JOptionPane.showOptionDialog(null, CONFIRMACION, TITULO_VENTANA, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, this);
        if (opcion == JOptionPane.YES_OPTION) {
            this.ventana.dispose();
            System.exit(0);
        }       
    }
        
    public static void main(String[] args) {
        IControladorPrincipal controladorPrincipal = new ControladorPrincipal();
    }    
}
