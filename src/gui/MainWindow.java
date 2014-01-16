/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListModel;

/**
 *
 * @author FernandoAnzola
 */
public class MainWindow extends JFrame{

    ListaProcesos listaProcesos;
    
    private JLabel lNombreProceso;
    private JLabel lTiempoProceso;
    private JTextField jtNombreProceso;
    private JTextField jtTiempoProceso;
    private JButton buttonAgregarProceso;
    public MainWindow() throws HeadlessException {
    
        this.setSize(500, 500);
        this.setResizable(false);
        this.setTitle("Procesos");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        
        
        listaProcesos = new ListaProcesos();
        listaProcesos.setBounds(10, 100, 250,400);
        
        listaProcesos.getModel().addElement("aaaaaa");
        this.add(listaProcesos);
        
    }
    
    
    public void iniciallizar(){
        lNombreProceso= new JLabel("Nombre del proceso");
     lTiempoProceso=new JLabel("tiempo proceso");
     jtNombreProceso=new JTextField();
     jtTiempoProceso=new JTextField();
     buttonAgregarProceso= new JButton("Agregar Proceso");
     
     
     
     
    }

    
    
       
    
    
    
    
    
    
    
    
}
