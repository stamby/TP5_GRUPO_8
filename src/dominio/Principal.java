package dominio;

import java.awt.EventQueue;

public class Principal {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Programa frame = new Programa();
					frame.cambiarVisibilidad(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
