package main;
import controller.ControllerLogin;
import view.LoginGUI;

/**
 * Classe principal do programa
 * @author Gabriel e Alex
 */
public class Principal {

	/**
	 * método main
	 */
	public static void main(String[] args) {
		LoginGUI login = new LoginGUI();
		new ControllerLogin(login);
	}
}