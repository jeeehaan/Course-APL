public class Demo {
	public static void main(String[] args) {

		// Creating social Media Connect Object for connecting with friend by
		// any social media strategy.
		SocialMediaContext context = new SocialMediaContext();

		// Setting Facebook strategy.
		context.setSocialmediaStrategy(new FacebookStrategy());
		context.connect("Jessy");

		System.out.println("====================");

		// Setting Twitter strategy.
		context.setSocialmediaStrategy(new TwitterStrategy());
		context.connect("Jessy");

		System.out.println("====================");

		// Setting GooglePlus strategy.
		context.setSocialmediaStrategy(new TiktokStrategy());
		context.connect("Jessy");

		System.out.println("====================");

		// Setting Orkut strategy.
		context.setSocialmediaStrategy(new InstagramStrategy());
		context.connect("Jessy");
	}
}
