

import controller.AuthController;
import view.AuthView;

public class Main1 {

	public static void main(String[] args) {
		AuthView view = new AuthView();
        AuthController controller = new AuthController(view);        
        view.setVisible(true);
	}
}
