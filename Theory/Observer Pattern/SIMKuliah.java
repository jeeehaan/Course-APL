public class SIMKuliah implements Observer {

	@Override
	public void doUpdate(String password) {
		System.out.println("Password SIMKuliah has changed to :" + password);
	}

}