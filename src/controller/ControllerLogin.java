package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.LoginGUI;
import view.InstituicaoGUI;

/**
 * Classe controller da tela de login
 * @author Gabriel e Alex
 */
public class ControllerLogin {
	private LoginGUI loginTela;
	private InstituicaoGUI instCadastroTela;
	
	/**
	 * Construtor
	 * @param loginTela instância da tela de login (LoginGUI)
	 */
	
	public ControllerLogin(LoginGUI loginTela) {
		this.loginTela = loginTela;
		Handler ouvinte = new Handler();
		loginTela.adicionarOuvinte(ouvinte);
		loginTela.setVisible(true);
	}
	
	/**
	 * Classe interna para tratamento dos eventos gerados pelos botões da tela (handler)
	 */
	public class Handler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == loginTela.getBotaoEntrar()) {
				if (loginTela.getCampoLogin().equals("user") && loginTela.getCampoSenha().equals("12345")) {
					loginTela.dispose();
					instCadastroTela = new InstituicaoGUI();
					new ControllerInstituicao(instCadastroTela);
				}
				else {
					JOptionPane.showMessageDialog(loginTela, "Login ou senha incorretos!", "Erro!", JOptionPane.ERROR_MESSAGE);
				}
			}
			else if (e.getSource() == loginTela.getBotaoLimpar()) {
				loginTela.setCampoLogin("");
				loginTela.setCampoSenha("");
			}
		}
		
	}

}
