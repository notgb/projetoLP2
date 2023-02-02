package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;

/**
 * Classe para representação da tela de cadastro
 * @author Gabriel e Alex
 */
public class InstituicaoGUI extends JFrame {
	private JTextField campoCodigoMEC;
	private JButton botaoEnviar;
	private JButton botaoLimpar;
	private JTextField campoNome;
	private JTextField campoAnoFundacao;
	private JComboBox tipoComboBox;
	
	private JTable tableInstituicao;
	private DefaultTableModel modelo;
	private JScrollPane scrollPaneInstituicao;
	
	/**
	 * Construtor
	 */
	public InstituicaoGUI() {
		setResizable(false);
		setTitle("Instituição - Cadastro");
		setBounds(100, 100, 700, 430);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel codigoMECLabel = new JLabel("Código do MEC:");
		codigoMECLabel.setHorizontalAlignment(SwingConstants.CENTER);
		codigoMECLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		codigoMECLabel.setBounds(242, 19, 200, 20);
		getContentPane().add(codigoMECLabel);
		
		campoCodigoMEC = new JTextField();
		campoCodigoMEC.setBounds(242, 44, 200, 30);
		getContentPane().add(campoCodigoMEC);
		campoCodigoMEC.setColumns(10);
		
		JLabel labelNome = new JLabel("Nome:");
		labelNome.setHorizontalAlignment(SwingConstants.CENTER);
		labelNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelNome.setBounds(242, 85, 200, 20);
		getContentPane().add(labelNome);
		
		botaoEnviar = new JButton("Enviar");
		botaoEnviar.setFont(new Font("Tahoma", Font.BOLD, 12));
		botaoEnviar.setBounds(247, 315, 80, 23);
		getContentPane().add(botaoEnviar);
		
		botaoLimpar = new JButton("Limpar");
		botaoLimpar.setFont(new Font("Tahoma", Font.BOLD, 12));
		botaoLimpar.setBounds(357, 315, 80, 23);
		getContentPane().add(botaoLimpar);
		
		campoNome = new JTextField();
		campoNome.setColumns(10);
		campoNome.setBounds(242, 110, 200, 30);
		getContentPane().add(campoNome);
		
		campoAnoFundacao = new JTextField();
		campoAnoFundacao.setColumns(10);
		campoAnoFundacao.setBounds(242, 176, 200, 30);
		getContentPane().add(campoAnoFundacao);
		
		JLabel labelAnoFundacao = new JLabel("Ano de fundação:");
		labelAnoFundacao.setHorizontalAlignment(SwingConstants.CENTER);
		labelAnoFundacao.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelAnoFundacao.setBounds(242, 151, 200, 20);
		getContentPane().add(labelAnoFundacao);
		
		JLabel labelTipo = new JLabel("Tipo:");
		labelTipo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTipo.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelTipo.setBounds(242, 217, 200, 20);
		getContentPane().add(labelTipo);
		
		tipoComboBox = new JComboBox();
		tipoComboBox.setModel(new DefaultComboBoxModel(new String[] {"Educação Infantil", "Ensino Fundamental", "Ensino Médio", "Educação Infantil e Ensino Fundamental", "Educação Infantil, Ensino Fundamental e Médio", "Ensino Fundamental e Médio", "Ensino Superior"}));
		tipoComboBox.setBounds(217, 242, 250, 30);
		getContentPane().add(tipoComboBox);
		
		definirJTable();
		scrollPaneInstituicao = new JScrollPane(tableInstituicao);
		scrollPaneInstituicao.setBounds(67, 370, 550, 220);
		getContentPane().add(scrollPaneInstituicao);
		scrollPaneInstituicao.setVisible(false);
	}
	
	/**
	 * Método para definir o modelo da table
	 */
	private void definirJTable() {
		modelo = new DefaultTableModel();
		modelo.addColumn("Código MEC");
		modelo.addColumn("Nome");
		modelo.addColumn("Ano de Fundação");
		modelo.addColumn("Tipo");
		tableInstituicao = new JTable(modelo);
	}
	
	/**
	 * Método para adicionar dados à table
	 * @param codigoMEC código MEC da instituição
	 * @param nome nome da instituição
	 * @param anoFundacao ano em que a instituição foi criada
	 * @param tipo tipo de instituição
	 */
	public void adicionarDados(String codigoMEC, String nome, String anoFundacao, String tipo) {
		Object[] dados = {codigoMEC, nome, anoFundacao, tipo};
		modelo.addRow(dados);
		if(!scrollPaneInstituicao.isVisible()){
			scrollPaneInstituicao.setVisible(true);
			setSize(700, 650);
			setLocation(new Point(getLocation().x, getLocation().y - 110));
			
		}
	}

	/**
	 * Método para obter o componente do botão "Enviar"
	 * @return botaoEnviar
	 */
	public JButton getBotaoEnviar() {
		return botaoEnviar;
	}
	
	/**
	 * Método para obter o componente do botão "Limpar"
	 * @return botaoLimpar
	 */
	public JButton getBotaoLimpar() {
		return botaoLimpar;
	}
	
	/**
	 * Método para obter o código MEC da instituição informado no campo de texto
	 * @return codigoMEC
	 */
	public String getCampoCodigoMEC() {
		return campoCodigoMEC.getText();
	}
	
	/**
	 * Método para obter o nome da instituição informado no campo de texto
	 * @return nome
	 */
	public String getCampoNome() {
		return campoNome.getText();
	}
	
	/**
	 * Método para obter o ano de fundação da instituição informado no campo de texto
	 * @return anoFundacao
	 */
	public String getCampoAnoFundacao() {
		return campoAnoFundacao.getText();
	}
	
	/**
	 * Método para obter o nome do tipo de instituição selecionado na combo box
	 * @return tipo
	 */
	public String getTipoComboBoxSelectedText() {
		return (String) tipoComboBox.getSelectedItem();
	}
	
	/**
	 * Método para atualizar o campo texto referente ao código MEC da instituição
	 * @param str string que será utilizada para atualizar o conteúdo do campo de texto
	 */
	public void setCampoCodigoMEC(String str) {
		campoCodigoMEC.setText(str);
	}
	
	/**
	 * Método para atualizar o campo texto referente ao nome da instituição
	 * @param str string que será utilizada para atualizar o conteúdo do campo de texto
	 */
	public void setCampoNome(String str) {
		campoNome.setText(str);
	}
	
	/**
	 * Método para atualizar o campo texto referente ao ano de criação da instituição
	 * @param str string que será utilizada para atualizar o conteúdo do campo de texto
	 */
	public void setCampoAnoFundacao(String str) {
		campoAnoFundacao.setText(str);
	}
	
	/**
	 * Método para atualizar através do index o tipo selecionado na combo box
	 * @param index index do elemento a ser selecionado
	 */
	public void setTipoComboBoxIndex(int index) {
		tipoComboBox.setSelectedIndex(index);
	}
	
	/**
	 * Método para adicionar um ouvinte (Listener) aos botões da tela
	 * @param ouvinte
	 */
	public void adicionarOuvinte(ActionListener ouvinte) {
		botaoEnviar.addActionListener(ouvinte);
		botaoLimpar.addActionListener(ouvinte);
	}
}
