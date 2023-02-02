package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.InstituicaoGUI;
import model.Instituicao;

/**
 * Classe controller da tela de cadastro de instituições
 * @author Gabriel e Alex
 */
public class ControllerInstituicao {
	private InstituicaoGUI instCadastroTela;
	
	/**
	 * Construtor
	 * @param instCadastroTela instância da tela de cadastro (InstituicaoGUI)
	 */
	public ControllerInstituicao(InstituicaoGUI instCadastroTela) {
		this.instCadastroTela = instCadastroTela;
		Handler ouvinte = new Handler();
		instCadastroTela.adicionarOuvinte(ouvinte);
		instCadastroTela.setVisible(true);
	}
	
	/**
	 * Classe interna para tratamento dos eventos gerados pelos botões da tela (handler)
	 */
	public class Handler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == instCadastroTela.getBotaoEnviar()) {
				Instituicao instituicao = new Instituicao(instCadastroTela.getCampoCodigoMEC(), instCadastroTela.getCampoNome(), instCadastroTela.getCampoAnoFundacao(), instCadastroTela.getTipoComboBoxSelectedText());
				
				if(!instituicao.getCodigoMEC().isBlank() && !instituicao.getNome().isBlank() && !instituicao.getAnoFundacao().isBlank()) {
					instCadastroTela.adicionarDados(instituicao.getCodigoMEC(), instituicao.getNome(), instituicao.getAnoFundacao(), instituicao.getTipo());
					JOptionPane.showMessageDialog(instCadastroTela, "Instituição cadastrada com sucesso!", "Instituição cadastrada", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(instCadastroTela, "Todos os campos devem ser preenchidos!", "Erro!", JOptionPane.ERROR_MESSAGE);
				}
			}
			else if (e.getSource() == instCadastroTela.getBotaoLimpar()) {
				instCadastroTela.setCampoCodigoMEC("");
				instCadastroTela.setCampoNome("");
				instCadastroTela.setCampoAnoFundacao("");
				instCadastroTela.setTipoComboBoxIndex(0);
			}
		}
		
	}

}
