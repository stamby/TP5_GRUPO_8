package dominio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Programa extends JFrame {

	private JPanel contentPane;
	public static DefaultListModel<Pelicula> listModel;

	public Programa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Programa");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenuPeliculas = new JMenu("Peliculas");
		menuBar.add(mnNewMenuPeliculas);
		
		JMenuItem mntmNewMenuItemAgregar = new JMenuItem("Agregar");
		mntmNewMenuItemAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AgregarPeliculas panelPelicula = new AgregarPeliculas(); 
				contentPane.add(panelPelicula, BorderLayout.CENTER);
				panelPelicula.setVisible(true);
				revalidate();
                repaint();
			}
		});
		mnNewMenuPeliculas.add(mntmNewMenuItemAgregar);
		
		JMenuItem mntmNewMenuItemListar = new JMenuItem("Listar");
		mnNewMenuPeliculas.add(mntmNewMenuItemListar);
		
		
		// cambiar por funciones de menu
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		

	}
	
	
	public static DefaultListModel<Pelicula> getMiLista() {
		listModel = new DefaultListModel<Pelicula>();
        return listModel;
    }

	public void cambiarVisibilidad(boolean estado) {
		setVisible(true);
	}

}
