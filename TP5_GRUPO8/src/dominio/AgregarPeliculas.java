package dominio;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgregarPeliculas extends JPanel {
	private JTextField txtNombre;
	private Pelicula peliculaAgregada = new Pelicula(); 

	public AgregarPeliculas() {
		setLayout(null);
		
		JLabel lblID = new JLabel("ID");
		lblID.setBounds(107, 75, 56, 16);
		add(lblID);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(107, 126, 56, 16);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setHorizontalAlignment(SwingConstants.TRAILING);
		lblGenero.setBounds(91, 182, 56, 16);
		add(lblGenero);
		
		JLabel lblNumID = new JLabel("");
		lblNumID.setBounds(197, 75, 56, 16);
		add(lblNumID);
		Pelicula peli = new Pelicula(); 
		
		String id = peli.muestraID(); 
		lblNumID.setText(id);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(197, 123, 116, 22);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JComboBox cboxGenero = new JComboBox();
		cboxGenero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Categoria cat = new Categoria(); 
				cat.setNombre((String) cboxGenero.getSelectedItem()); 
				peliculaAgregada.setCat(cat);
				
			}
		});
		cboxGenero.setBounds(197, 179, 116, 22);
		add(cboxGenero);
		Categoria cat= new Categoria(); 
		for (Categoria item : cat.Obtener()) { 
			cboxGenero.addItem(item.getNombre());
			
		}
		
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtNombre.getText() != "") { 
					peliculaAgregada.setNombre(txtNombre.getText());
					DefaultListModel<Pelicula> lista = Programa.getMiLista();
					lista.addElement(peliculaAgregada);
					txtNombre.setText("");
					
					Pelicula peli = new Pelicula(); 
					lblNumID.setText(peli.muestraID());
				}
				
			}
		});
		btnAceptar.setBounds(131, 233, 97, 25);
		add(btnAceptar);
		

	}
}
