public class Demo {

	public static void main(String[] args) {
		
		KRSOnline KRSOnline = new KRSOnline("xyz123");
		
		SIMKuliah s = new SIMKuliah();
		Elearning e = new Elearning();
		
        KRSOnline.addObserver(s);
		KRSOnline.addObserver(e);
		
		KRSOnline.setPassword("abc123");
		System.out.println("\n----------------------------------------");
		KRSOnline.removeObserver(s);
		KRSOnline.setPassword("xyz456");
		System.out.println("\n----------------------------------------");

       
	}

}