package main;
import controller.ControllerLogin;
import view.LoginGUI;

public class Principal {

	public static void main(String[] args) {
		LoginGUI login = new LoginGUI();
		new ControllerLogin(login);
	}
}