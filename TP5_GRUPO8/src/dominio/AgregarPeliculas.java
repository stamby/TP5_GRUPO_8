package dominio;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class AgregarPeliculas extends JPanel {
	private JTextField txtNombre;


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
		
		txtNombre = new JTextField();
		txtNombre.setBounds(197, 123, 116, 22);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JComboBox cboxGenero = new JComboBox();
		cboxGenero.setBounds(197, 179, 31, 22);
		add(cboxGenero);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(131, 233, 97, 25);
		add(btnAceptar);

	}
}
