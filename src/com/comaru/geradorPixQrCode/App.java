package com.comaru.geradorPixQrCode;

import javax.swing.UIManager;

import com.formdev.flatlaf.FlatLightLaf;

public class App {

	private static final String APPNOME = "GERADORPIXQRCODE";
	private static final String VERSAO = "1.0.0.0";

	public static final String getVersao() {
		return VERSAO;
	}

	public static final String getNome() {
		return APPNOME;
	}

	private static void defineTheme() {

		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
			System.out.println("Tema:FlatLight");
		} catch (Exception ex) {
			System.err.println("Failed to initialize LaF");
		}

	}

	public static void main(String[] args) {

		System.out.println("Iniciando a aplicação!");
		System.out.println("Versão: " + getVersao());

		defineTheme();

		FrmGerador load = new FrmGerador();
		load.setVisible(true);
	}
}
