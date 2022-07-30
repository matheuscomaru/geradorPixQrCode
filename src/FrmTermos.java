import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JButton;

public class FrmTermos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTermos frame = new FrmTermos();
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
	public FrmTermos() {
		setTitle("Termos de uso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 538);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JEditorPane txtpnIsenoDeResponsabilidade = new JEditorPane();
		txtpnIsenoDeResponsabilidade.setText("Isen\u00E7\u00E3o de responsabilidade\r\n\r\nOs QR codes n\u00E3o foram testadas em todos os bancos, antes de transferir verifique se as informa\u00E7\u00F5es est\u00E3o corretas. O site se isenta de qualquer responsabilidade pela exatid\u00E3o e integridade das informa\u00E7\u00F5es divulgada.\r\n\r\nMantenha sempre seu computador atualizado e verifique o antivirus, se notar que alguma imagem foi alterada verifique seus programas instalados.\r\n\r\nOs QRCodes foram programados a partir da documenta\u00E7\u00E3o do BACEN BRCode 2.0.1 https://www.bcb.gov.br/content/estabilidadefinanceira/spb_docs/ManualBRCode.pdf\r\n\r\nPara a gera\u00E7\u00E3o do QRcode Est\u00E1tico n\u00E3o \u00E9 feita nenhuma integra\u00E7\u00E3o com o sistema PIX e bancos, \u00E9 apenas uma forma de demostrar os dados PIX do pagador em um QrCODE, utilizando o padr\u00E3o BRCode\r\n\r\nEsta plataforma armazena meus dados banc\u00E1rios?\r\n\r\nN\u00E3o! N\u00E3o armazenamos em nenhum momento! N\u00E3o armazenamos os dados informados como CPF, Telefone. N\u00E3o armazenamos nenhum dos dados gerados!\r\n\r\nOs dados s\u00E3o processados pelo servidor e retornados sem armazenar qualquer dado sens\u00EDvel\r\n\r\n\r\nO que \u00E9 o PIX?\r\n\r\nAprovado em 12 de agosto deste ano, o PIX \u00E9 um sistema de pagamento instant\u00E2neo e gratuito que foi criado pelo Banco Central (BACEN), com o intuito de facilitar as transa\u00E7\u00F5es Brasil afora.\r\n\r\nProvavelmente, voc\u00EA j\u00E1 precisou fazer uma transfer\u00EAncia urgente, mas, quando se deparou com a data, lembrou que teria um problem\u00E3o, uma vez que era uma sexta-feira \u00E0 noite e o dinheiro enviado por TED ou DOC s\u00F3 cairia na conta terceira na segunda-feira.\r\n\r\nO PIX, portanto, chegou para que problemas como esse fossem resolvidos da maneira mais simples, segura e r\u00E1pida poss\u00EDvel. Imagine s\u00F3 n\u00E3o precisar mais informar ag\u00EAncia, banco, conta, d\u00EDgitos etc. para realizar uma transa\u00E7\u00E3o financeira.\r\n\r\n\r\nComo funciona o PIX?\r\n\r\nComo o PIX foi criado para que funcione da maneira mais simples poss\u00EDvel, n\u00E3o existem muitos segredos para conseguir coloc\u00E1-lo em a\u00E7\u00E3o.\r\n\r\nVoc\u00EA precisa cadastrar a sua chave PIX, que pode ser realizado em quaisquer servi\u00E7os de banco, fintechs ou cooperativas de cr\u00E9dito, desde que voc\u00EA j\u00E1 seja cliente.\r\n\r\nDessa forma, as op\u00E7\u00F5es principais de chave PIX s\u00E3o: n\u00FAmero de celular, e-mail, CPF ou CNPJ e, para cadastrar, \u00E9 s\u00F3 voc\u00EA ir at\u00E9 ao menu PIX da plataforma que est\u00E1 utilizando e seguir as instru\u00E7\u00F5es para inser\u00E7\u00E3o dos dados e verifica\u00E7\u00E3o da conta.\r\n\r\nLembre-se de que o cadastro deve ser realizado de acordo com a sua prefer\u00EAncia e necessidade, isto \u00E9, n\u00E3o tente cadastrar uma chave em um meio que voc\u00EA n\u00E3o conseguir\u00E1 acessar.\r\n\r\nLembrando que para pessoa f\u00EDsica \u00E9 totalmente gr\u00E1tis para realizar transa\u00E7\u00F5es.\r\n\r\nAo cadastrar a sua chave em uma dessas op\u00E7\u00F5es, voc\u00EA poder\u00E1 realizar transa\u00E7\u00F5es banc\u00E1rias em qualquer hora do dia (24 horas), e elas s\u00E3o conclu\u00EDdas dentro de alguns segundos. Vale lembrar que \u00E9 poss\u00EDvel ter no m\u00E1ximo 5 chaves PIX por usu\u00E1rio na mesma institui\u00E7\u00E3o.\r\n\r\nPara isso, voc\u00EA precisa estar registrado no PIX e a pessoa ou institui\u00E7\u00E3o para a qual voc\u00EA est\u00E1 enviando o dinheiro, tamb\u00E9m. Se o registro j\u00E1 foi realizado por ambos, basta que voc\u00EA mostre o QrCode ou troque informa\u00E7\u00F5es da chave e realizem a transa\u00E7\u00E3o pelo PIX da plataforma escolhida.\r\n\r\nAl\u00E9m disso, com essa nova forma de pagamento, \u00E9 poss\u00EDvel pagar compras em qualquer com\u00E9rcio que tamb\u00E9m j\u00E1 esteja cadastrado no PIX. E o melhor \u00E9 que \u00E9 tudo digital, ou seja, grande praticidade.\r\n\r\n\r\nComo gerar o QrCode Est\u00E1tico Pix?\r\n\r\nQRCode PIX Est\u00E1tico pode ser usado para mais de uma transa\u00E7\u00E3o. Pode, inclusive, estar impresso no ponto de venda f\u00EDsico, site, aplicativo, live e shows online\r\n\r\nPor isso, \u00E9 o ideal para quem atua no varejo e com presta\u00E7\u00E3o de servi\u00E7o ou quem deseja dividir uma conta com um grupo de amigos e quer facilitar a transfer\u00EAncia\r\n\r\n\u00C9 obrigat\u00F3rio inserir a cidade de origem do benefici\u00E1rio ou local da Transfer\u00EAncia, nome do benefici\u00E1rio e a chave PIX. O QrCode pode ter um valor determinado ou pode ter o valor em aberto, para que o consumidor coloque o valor adequado ap\u00F3s o c\u00F3digo ser escaneado.");
		scrollPane.setViewportView(txtpnIsenoDeResponsabilidade);
		
		JButton btnNewButton = new JButton("CONCORDO COM OS TERMOS DE USO ACIMA");
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
	}

}
