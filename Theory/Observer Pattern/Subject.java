public interface Subject {

	public void addObserver(Observer Observer);

	public void removeObserver(Observer Observer);

	public void doNotify();

}