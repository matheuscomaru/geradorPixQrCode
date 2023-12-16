package com.comaru.geradorPixQrCode;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JTextField;

public class FrmVisuaizador extends JFrame {

	private JPanel contentPane;
	private JLabel foto;
	private JTextField txtPix;

	public FrmVisuaizador() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(FrmVisuaizador.class.getResource("/com/comaru/geradorPixQrCode/pix50x50.png")));
		setTitle("Gerador PIX Qr Code.");
		setBounds(100, 100, 522, 624);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);

		foto = new JLabel("");
		foto.setBackground(Color.GRAY);
		contentPane.add(foto);

		txtPix = new JTextField();
		contentPane.add(txtPix, BorderLayout.NORTH);
		txtPix.setColumns(10);
		mostrarImg("pixqrcode.png");
	}

	protected void setTxt(String pix) {

		txtPix.setText(pix);

	}

	protected void mostrarImg(String nomeArquivo) {

		ImageIcon img = new ImageIcon(nomeArquivo);
		foto.setIcon(img);

	}

}
