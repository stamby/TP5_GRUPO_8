package dominio;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class Pnl_Listar extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLabel  lblPeliculas;
	private JList<Pelicula> JlistPeliculas;
	private static DefaultListModel<Pelicula> dLModel;
	
	
	public Pnl_Listar(DefaultListModel<Pelicula> dLModel) {
		setLayout(null);
		
		lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setBounds(10, 0, 91, 300);
		add(lblPeliculas);
		
		JlistPeliculas = new JList<Pelicula>();
		JlistPeliculas.setBounds(72, 0, 410, 300);
				
		JlistPeliculas.setModel(dLModel);
		
		add(JlistPeliculas);
		
		

	}
}
