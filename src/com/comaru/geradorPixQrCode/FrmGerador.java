package com.comaru.geradorPixQrCode;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.nio.charset.Charset;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import net.glxn.qrgen.image.ImageType;

public class FrmGerador extends JFrame {

	private JPanel contentPane;
	private JTextField txtChavePix;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;
	private int tamanho = 500;
	String pixCopiaCola = "";
	private JTextField txtPix;

	public FrmGerador() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(FrmGerador.class.getResource("/com/comaru/geradorPixQrCode/pix50x50.png")));
		setTitle("Gerador PIX Qr Code.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 330);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Chave PIX",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(6, 11, 490, 45);
		contentPane.add(panel);
		panel.setLayout(null);

		txtChavePix = new JTextField();
		txtChavePix.setBounds(110, 17, 370, 20);
		panel.add(txtChavePix);
		txtChavePix.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(SystemColor.inactiveCaptionBorder);
		comboBox.setBounds(10, 16, 90, 22);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Telefone", "E-mail", "CPF", "CNPJ", "Outro" }));

		JButton btnGerarPixQr = new JButton("Gerar PIX QR CODE");
		btnGerarPixQr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gerarPixQrCode();
			}
		});
		btnGerarPixQr.setBounds(318, 241, 178, 39);
		contentPane.add(btnGerarPixQr);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Nome Benifici\u00E1rio (at\u00E9 25 caracteres)", TitledBorder.LEADING, TitledBorder.TOP, null,
				new Color(0, 0, 0)));
		panel_1.setBounds(6, 60, 490, 45);
		contentPane.add(panel_1);

		textField_1 = new JTextField();
		textField_1.setBackground(Color.WHITE);
		textField_1.setColumns(10);
		textField_1.setBounds(10, 17, 470, 20);
		panel_1.add(textField_1);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Valor para transferencia (opcional)", TitledBorder.LEADING, TitledBorder.TOP, null,
				new Color(0, 0, 0)));
		panel_1_1.setBounds(6, 162, 302, 45);
		contentPane.add(panel_1_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 17, 282, 20);
		panel_1_1.add(textField_2);

		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"C\u00F3digo da transfer\u00EAncia - Sem espa\u00E7o (opcional - at\u00E9 20 Letras e/ou N\u00FAmeros)",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_1_1.setBounds(6, 108, 490, 45);
		contentPane.add(panel_1_1_1);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 17, 470, 20);
		panel_1_1_1.add(textField);

		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Tamanho QrCode", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_1_1_1.setBounds(318, 162, 178, 45);
		contentPane.add(panel_1_1_1_1);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("250");
		rdbtnNewRadioButton.setBackground(SystemColor.inactiveCaptionBorder);
		rdbtnNewRadioButton.setBounds(6, 15, 52, 23);
		panel_1_1_1_1.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("500");
		rdbtnNewRadioButton_1.setSelected(true);
		rdbtnNewRadioButton_1.setBackground(SystemColor.inactiveCaptionBorder);
		rdbtnNewRadioButton_1.setBounds(63, 15, 52, 23);
		panel_1_1_1_1.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("1000");
		rdbtnNewRadioButton_1_1.setBackground(SystemColor.inactiveCaptionBorder);
		rdbtnNewRadioButton_1_1.setBounds(117, 15, 52, 23);
		panel_1_1_1_1.add(rdbtnNewRadioButton_1_1);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Li e concordo com os termos de uso");
		chckbxNewCheckBox.setBackground(SystemColor.inactiveCaptionBorder);
		chckbxNewCheckBox.setBounds(6, 238, 233, 23);
		contentPane.add(chckbxNewCheckBox);

		JLabel lblNewLabel = new JLabel("Ler termos");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrmTermos frm = new FrmTermos();
				frm.setVisible(true);
			}
		});
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setBounds(6, 268, 63, 14);
		contentPane.add(lblNewLabel);

		txtPix = new JTextField();
		txtPix.setBounds(6, 211, 490, 20);
		contentPane.add(txtPix);
		txtPix.setColumns(10);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int o = 0xAAAF14DE;
				System.out.println(Integer.toHexString(o));
			}
		});
		btnNewButton.setBounds(100, 257, 89, 23);
		contentPane.add(btnNewButton);
	}

	protected void gerarPixQrCode() {

		int size = tamanho;
		String name = "pixqrcode.png";

		String id = "000201";
		String merchan = "26330014BR.GOV.BCB.PIX011101434779190";
		String catg = "52040000";
		String t = "5303986";
		// String valor = "5406123.45";
		String pais = "5802BR";
		String recebedor = "5906COMARU";
		String cidade = "6002CB";
		String add = "62070503***";

		pixCopiaCola += id;
		pixCopiaCola += merchan;
		pixCopiaCola += catg;
		pixCopiaCola += t;
		// pixCopiaCola += valor;
		pixCopiaCola += pais;
		pixCopiaCola += recebedor;
		pixCopiaCola += cidade;
		pixCopiaCola += add;
		pixCopiaCola += "6304";

		// crc
		System.out.println(pixCopiaCola);
		int polynomial = 0x11021;
		int initCrc = 0xFFFF;
		boolean reverse = false;
		int xorOut = 0x0000;
		byte[] data = pixCopiaCola.getBytes(Charset.forName("UTF-8"));
		int crc2 = calculateCrc(data, polynomial, initCrc, reverse, xorOut);
		System.out.println("CRC: " + Integer.toHexString(crc2));
		pixCopiaCola += String.valueOf(Integer.toHexString(crc2));

		System.out.println(pixCopiaCola);
		txtPix.setText(pixCopiaCola);

		try {

			FileOutputStream f = new FileOutputStream(name);
			ByteArrayOutputStream out = net.glxn.qrgen.QRCode.from(pixCopiaCola).to(ImageType.PNG).withSize(size, size)
					.stream();
			{
				f.write(out.toByteArray());
				f.close();
				mostrarImg(name);

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private static int calculateCrc(byte[] data, int polynomial, int initCrc, boolean reverse, int xorOut) {
		int crc = initCrc;

		for (byte b : data) {
			if (reverse) {
				crc ^= (b & 0xFF);
				for (int i = 0; i < 8; i++) {
					if ((crc & 0x0001) != 0) {
						crc = (crc >>> 1) ^ polynomial;
					} else {
						crc >>>= 1;
					}
				}
			} else {
				crc ^= (b << 8) & 0xFFFF;
				for (int i = 0; i < 8; i++) {
					if ((crc & 0x8000) != 0) {
						crc = (crc << 1) ^ polynomial;
					} else {
						crc <<= 1;
					}
				}
			}
		}

		return crc ^ xorOut;
	}

	protected void mostrarImg(String nomeArquivo) {

		FrmVisuaizador frm = new FrmVisuaizador();
		frm.setTxt(pixCopiaCola);
		frm.mostrarImg(nomeArquivo);
		frm.setVisible(true);

	}
}
