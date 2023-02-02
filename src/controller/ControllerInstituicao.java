package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.InstituicaoGUI;

public class ControllerInstituicao {
	private InstituicaoGUI instCadastroTela;
	
	public ControllerInstituicao(InstituicaoGUI instCadastroTela) {
		this.instCadastroTela = instCadastroTela;
		Handler ouvinte = new Handler();
		instCadastroTela.adicionarOuvinte(ouvinte);
		instCadastroTela.setVisible(true);
	}
	
	public class Handler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == instCadastroTela.getBotaoEnviar()) {
				return;
			}
			else if (e.getSource() == instCadastroTela.getBotaoLimpar()) {
				instCadastroTela.setCampoCodigoMEC("");
				instCadastroTela.setCampoNome("");
				instCadastroTela.setCampoAnoFundacao("");
				instCadastroTela.setTipoComboBox(0);
			}
		}
		
	}

}
