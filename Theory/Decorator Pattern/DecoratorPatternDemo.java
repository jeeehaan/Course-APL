public class DecoratorPatternDemo {
    public static void main(String[] args) {
 
       Donuts regular = new RegularSize();
 
       Donuts chocolateRegular = new ChocolateToppingDecorator(new RegularSize());
 
       Donuts chocolateMini = new ChocolateToppingDecorator(new MiniSize());
       System.out.println("Donuts with no Topping");
       regular.addTopping();
 
       System.out.println("\nRegular Donuts with Chocolate Topping");
       chocolateRegular.addTopping();
 
       System.out.println("\nMini Donuts with Chocolate Topping");
       chocolateMini.addTopping();
    }
 }