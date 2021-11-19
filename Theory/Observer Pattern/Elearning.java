public class Elearning implements Observer {

	@Override
	public void doUpdate(String password) {
		System.out.println("Password Elearning has changed to:" + password);
	}

}