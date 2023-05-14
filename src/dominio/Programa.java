package dominio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dominio.Pnl_Listar;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Programa extends JFrame {

	private JPanel contentPane;
	public static DefaultListModel<Pelicula> dLModel;

	public Programa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Programa");
		
		dLModel = new DefaultListModel<Pelicula>();
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenuPeliculas = new JMenu("Peliculas");
		menuBar.add(mnNewMenuPeliculas);
		
		JMenuItem mntmNewMenuItemAgregar = new JMenuItem("Agregar");
		mntmNewMenuItemAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.removeAll();
				
				AgregarPeliculas panelPelicula = new AgregarPeliculas(dLModel); 
				contentPane.add(panelPelicula, BorderLayout.CENTER);
				panelPelicula.setVisible(true);
				revalidate();
                repaint();
			}
		});
		mnNewMenuPeliculas.add(mntmNewMenuItemAgregar);
		
		JMenuItem mntmNewMenuItemListar = new JMenuItem("Listar");
		mntmNewMenuItemListar.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent arg0) {
				
				contentPane.removeAll();
				
				Pnl_Listar panel = new Pnl_Listar(dLModel);
				contentPane.add(panel,BorderLayout.CENTER);
				panel.setVisible(true);
				contentPane.repaint();
				contentPane.revalidate();
				
			}
		});
		
		mnNewMenuPeliculas.add(mntmNewMenuItemListar);
		
		
		
		// cambiar por funciones de menu
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		

	}

	public void cambiarVisibilidad(boolean estado) {
		setVisible(true);
	}

}
