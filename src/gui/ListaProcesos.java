/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author FernandoAnzola
 */
public class ListaProcesos extends JPanel{
private JScrollPane jScrollPane;
  private JList lista;
  private DefaultListModel model;
    public ListaProcesos() {
  //Creación del panel, que contendra JList
this.setLayout(null);
//creación del objeto lista
model = new DefaultListModel();
      lista = new JList();
      
      lista.setModel(model);
//se cambia la orientación de presentación y el ajuste
lista.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
// barra de desplazamiento
 jScrollPane = new JScrollPane(lista);
jScrollPane.setBounds(10,30,200,110);
//Agrega la barra de desplazamiento al panel
this.add(jScrollPane);

    
}

    /**
     * @return the model
     */
    public DefaultListModel getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(DefaultListModel model) {
        this.model = model;
    }
}
