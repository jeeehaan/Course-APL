import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class KRSOnline implements Subject {

	Set<Observer> Observers;
	String password;

	public KRSOnline(String password) {
		Observers = new HashSet<Observer>();
		this.password = password;
	}

	@Override
	public void addObserver(Observer Observer) {
		Observers.add(Observer);
	}

	@Override
	public void removeObserver(Observer Observer) {
		Observers.remove(Observer);
	}

	@Override
	public void doNotify() {
		Iterator<Observer> it = Observers.iterator();
		while (it.hasNext()) {
			Observer Observer = it.next();
			Observer.doUpdate(password);
		}
	}

	public void setPassword(String newPassword) {
		System.out.println("\nPassword KRSOnline has changed to " + newPassword);
		password = newPassword;
		doNotify();
	}

}