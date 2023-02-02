package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LoginGUI extends JFrame {
	private JTextField campoLogin;
	private JPasswordField campoSenha;
	private JButton botaoEntrar;
	private JButton botaoLimpar;
	
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
		loginLabel.setBounds(67, 31, 200, 20);
		getContentPane().add(loginLabel);
		
		campoLogin = new JTextField();
		campoLogin.setBounds(67, 62, 200, 30);
		getContentPane().add(campoLogin);
		campoLogin.setColumns(10);
		
		JLabel labelSenha = new JLabel("Senha:");
		labelSenha.setHorizontalAlignment(SwingConstants.CENTER);
		labelSenha.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelSenha.setBounds(67, 111, 200, 20);
		getContentPane().add(labelSenha);
		
		campoSenha = new JPasswordField();
		campoSenha.setBounds(67, 142, 200, 30);
		getContentPane().add(campoSenha);
		
		botaoEntrar = new JButton("Entrar");
		botaoEntrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		botaoEntrar.setBounds(72, 201, 80, 23);
		getContentPane().add(botaoEntrar);
		
		botaoLimpar = new JButton("Limpar");
		botaoLimpar.setFont(new Font("Tahoma", Font.BOLD, 12));
		botaoLimpar.setBounds(182, 201, 80, 23);
		getContentPane().add(botaoLimpar);

	}
	
	public JButton getBotaoEntrar() {
		return botaoEntrar;
	}
	
	public JButton getBotaoLimpar() {
		return botaoLimpar;
	}
	
	public String getCampoLogin() {
		return campoLogin.getText();
	}
	
	public String getCampoSenha() {
		return campoSenha.getText();
	}
	
	public void setCampoLogin(String str) {
		campoLogin.setText(str);
	}
	
	public void setCampoSenha(String str) {
		campoSenha.setText(str);
	}
	
	public void adicionarOuvinte(ActionListener ouvinte) {
		botaoLimpar.addActionListener(ouvinte);
		botaoEntrar.addActionListener(ouvinte);
	}
}
