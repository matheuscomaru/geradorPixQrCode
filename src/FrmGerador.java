import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import net.glxn.qrgen.image.ImageType;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmGerador extends JFrame {

	private JPanel contentPane;
	private JTextField txtChavePix;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					FrmGerador frame = new FrmGerador();
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
	public FrmGerador() {
		setTitle("Gerador PIX Qr Code.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 307);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Chave PIX", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Telefone", "E-mail", "CPF", "CNPJ", "Outro"}));

		JButton btnGerarPixQr = new JButton("Gerar PIX QR CODE");
		btnGerarPixQr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gerarPixQrCode();
			}
		});
		btnGerarPixQr.setBounds(318, 218, 178, 39);
		contentPane.add(btnGerarPixQr);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Nome Benifici\u00E1rio (at\u00E9 25 caracteres)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
		panel_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Valor para transferencia (opcional)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_1.setBounds(6, 162, 302, 45);
		contentPane.add(panel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 17, 282, 20);
		panel_1_1.add(textField_2);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "C\u00F3digo da transfer\u00EAncia - Sem espa\u00E7o (opcional - at\u00E9 20 Letras e/ou N\u00FAmeros)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_1_1.setBounds(6, 108, 490, 45);
		contentPane.add(panel_1_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 17, 470, 20);
		panel_1_1_1.add(textField);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tamanho QrCode", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
		chckbxNewCheckBox.setBounds(6, 238, 208, 23);
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
		lblNewLabel.setBounds(220, 243, 63, 14);
		contentPane.add(lblNewLabel);
	}

	protected void gerarPixQrCode() {

		int size = Integer.parseInt(txtTamanho.getText());
		String name = "pixqrcode.png";

		try {

			FileOutputStream f = new FileOutputStream(name);
			ByteArrayOutputStream out = net.glxn.qrgen.QRCode.from(txtChavePix.getText()).to(ImageType.PNG).withSize(size, size).stream();
			{
				f.write(out.toByteArray());
				f.close();
				//mostrarImg(name);
				FrmVisuaizador frm = new FrmVisuaizador();
				frm.setBounds(100, 100, size, size);
				frm.setVisible(true);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	protected void mostrarImg(String nomeArquivo) {
		
		ImageIcon img = new ImageIcon(nomeArquivo);
		foto.setIcon(img);
		
		
	}
}
