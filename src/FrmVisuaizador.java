import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FrmVisuaizador extends JFrame {

	private JPanel contentPane;
	private JLabel foto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmVisuaizador frame = new FrmVisuaizador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmVisuaizador() {
		setTitle("Gerador PIX Qr Code.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 624);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		foto = new JLabel("");
		foto.setBackground(Color.GRAY);
		contentPane.add(foto);
		mostrarImg("pixqrcode.png");
	}
	
	protected void mostrarImg(String nomeArquivo) {
		
		ImageIcon img = new ImageIcon(nomeArquivo);
		foto.setIcon(img);
		
		
	}
	
	
}
