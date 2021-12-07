public class ChocolateToppingDecorator extends ToppingDecorator {

    public ChocolateToppingDecorator(Donuts decoratedDonuts) {
       super(decoratedDonuts);		
    }
 
    @Override
    public void addTopping() {
       decoratedDonuts.addTopping();	       
       setChocolateTopping(decoratedDonuts);
    }
 
    private void setChocolateTopping(Donuts decoratedDonuts){
       System.out.println("Topping: Chocolate");
    }
 }