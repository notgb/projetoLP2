package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class InstituicaoGUI extends JFrame {
	private JTextField campoCodigoMEC;
	private JButton botaoEnviar;
	private JButton botaoLimpar;
	private JTextField campoNome;
	private JTextField campoAnoFundacao;
	private JComboBox tipoComboBox;
	
	public InstituicaoGUI() {
		setResizable(false);
		setTitle("Instituição - Cadastro");
		setBounds(100, 100, 350, 550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel codigoMECLabel = new JLabel("Código do MEC:");
		codigoMECLabel.setHorizontalAlignment(SwingConstants.CENTER);
		codigoMECLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		codigoMECLabel.setBounds(67, 31, 200, 20);
		getContentPane().add(codigoMECLabel);
		
		campoCodigoMEC = new JTextField();
		campoCodigoMEC.setBounds(67, 62, 200, 30);
		getContentPane().add(campoCodigoMEC);
		campoCodigoMEC.setColumns(10);
		
		JLabel labelNome = new JLabel("Nome:");
		labelNome.setHorizontalAlignment(SwingConstants.CENTER);
		labelNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelNome.setBounds(67, 112, 200, 20);
		getContentPane().add(labelNome);
		
		botaoEnviar = new JButton("Enviar");
		botaoEnviar.setFont(new Font("Tahoma", Font.BOLD, 12));
		botaoEnviar.setBounds(72, 370, 80, 23);
		getContentPane().add(botaoEnviar);
		
		botaoLimpar = new JButton("Limpar");
		botaoLimpar.setFont(new Font("Tahoma", Font.BOLD, 12));
		botaoLimpar.setBounds(182, 370, 80, 23);
		getContentPane().add(botaoLimpar);
		
		campoNome = new JTextField();
		campoNome.setColumns(10);
		campoNome.setBounds(67, 143, 200, 30);
		getContentPane().add(campoNome);
		
		campoAnoFundacao = new JTextField();
		campoAnoFundacao.setColumns(10);
		campoAnoFundacao.setBounds(67, 224, 200, 30);
		getContentPane().add(campoAnoFundacao);
		
		JLabel labelAnoFundacao = new JLabel("Ano de fundação:");
		labelAnoFundacao.setHorizontalAlignment(SwingConstants.CENTER);
		labelAnoFundacao.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelAnoFundacao.setBounds(67, 193, 200, 20);
		getContentPane().add(labelAnoFundacao);
		
		JLabel labelTipo = new JLabel("Tipo:");
		labelTipo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTipo.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelTipo.setBounds(67, 274, 200, 20);
		getContentPane().add(labelTipo);
		
		tipoComboBox = new JComboBox();
		tipoComboBox.setModel(new DefaultComboBoxModel(new String[] {"Educação Infantil", "Ensino Fundamental", "Ensino Médio", "Educação Infantil e Ensino Fundamental", "Educação Infantil, Ensino Fundamental e Médio", "Ensino Fundamental e Médio", "Ensino Superior"}));
		tipoComboBox.setBounds(67, 305, 200, 30);
		getContentPane().add(tipoComboBox);
		
		setVisible(true);

	}
	
	public JButton getBotaoEnviar() {
		return botaoEnviar;
	}
	
	public JButton getBotaoLimpar() {
		return botaoLimpar;
	}
	
	public String getCampoCodigoMEC() {
		return campoCodigoMEC.getText();
	}
	
	public String getCampoNome() {
		return campoNome.getText();
	}
	
	public String getCampoAnoFundacao() {
		return campoAnoFundacao.getText();
	}
	
	public Object getTipoComboBox() {
		return tipoComboBox.getSelectedItem();
	}
	
	public void setCampoCodigoMEC(String str) {
		campoCodigoMEC.setText(str);
	}
	
	public void setCampoNome(String str) {
		campoNome.setText(str);
	}
	
	public void setCampoAnoFundacao(String str) {
		campoAnoFundacao.setText(str);
	}
	
	public void setTipoComboBox(int index) {
		tipoComboBox.setSelectedIndex(index);
	}
	
	public void adicionarOuvinte(ActionListener ouvinte) {
		botaoEnviar.addActionListener(ouvinte);
		botaoLimpar.addActionListener(ouvinte);
	}
}
