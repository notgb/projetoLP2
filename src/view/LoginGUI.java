package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

/**
 * Classe para representação da tela de login
 * @author Gabriel e Alex
 */
public class LoginGUI extends JFrame {
	private JTextField campoLogin;
	private JPasswordField campoSenha;
	private JButton botaoEntrar;
	private JButton botaoLimpar;
	
	/**
	 * Construtor
	 */
	public LoginGUI() {
		setTitle("Instituição - Login");
		setResizable(false);
		setBounds(100, 100, 350, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel loginLabel = new JLabel("Login:");
		loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		loginLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		loginLabel.setBounds(67, 29, 200, 20);
		getContentPane().add(loginLabel);
		
		campoLogin = new JTextField();
		campoLogin.setBounds(67, 54, 200, 30);
		getContentPane().add(campoLogin);
		campoLogin.setColumns(10);
		
		JLabel labelSenha = new JLabel("Senha:");
		labelSenha.setHorizontalAlignment(SwingConstants.CENTER);
		labelSenha.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelSenha.setBounds(67, 103, 200, 20);
		getContentPane().add(labelSenha);
		
		campoSenha = new JPasswordField();
		campoSenha.setBounds(67, 128, 200, 30);
		getContentPane().add(campoSenha);
		
		botaoEntrar = new JButton("Entrar");
		botaoEntrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		botaoEntrar.setBounds(72, 193, 80, 23);
		getContentPane().add(botaoEntrar);
		
		botaoLimpar = new JButton("Limpar");
		botaoLimpar.setFont(new Font("Tahoma", Font.BOLD, 12));
		botaoLimpar.setBounds(182, 193, 80, 23);
		getContentPane().add(botaoLimpar);

	}
	
	/**
	 * Método para obter o componente do botão "Entrar"
	 * @return botaoEnviar
	 */
	public JButton getBotaoEntrar() {
		return botaoEntrar;
	}
	
	/**
	 * Método para obter o componente do botão "Limpar"
	 * @return botaoLimpar
	 */
	public JButton getBotaoLimpar() {
		return botaoLimpar;
	}
	
	/**
	 * Método para obter o login informado no campo de texto
	 * @return login
	 */
	public String getCampoLogin() {
		return campoLogin.getText();
	}
	
	/**
	 * Método para obter a senha informada no campo de texto
	 * @return senha
	 */
	public String getCampoSenha() {
		return campoSenha.getText();
	}
	
	/**
	 * Método para atualizar o campo texto referente ao login
	 * @param str string que será utilizada para atualizar o conteúdo do campo de texto
	 */
	public void setCampoLogin(String str) {
		campoLogin.setText(str);
	}
	
	/**
	 * Método para atualizar o campo referente à senha
	 * @param str string que será utilizada para atualizar o conteúdo do campo de texto
	 */
	public void setCampoSenha(String str) {
		campoSenha.setText(str);
	}
	
	/**
	 * Método para adicionar um ouvinte (Listener) aos botões da tela
	 * @param ouvinte
	 */
	public void adicionarOuvinte(ActionListener ouvinte) {
		botaoLimpar.addActionListener(ouvinte);
		botaoEntrar.addActionListener(ouvinte);
	}
}
