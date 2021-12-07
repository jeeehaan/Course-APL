public abstract class ToppingDecorator implements Donuts {
    protected Donuts decoratedDonuts;
 
    public ToppingDecorator(Donuts decoratedDonuts){
       this.decoratedDonuts = decoratedDonuts;
    }
 
    public void addTopping(){
       decoratedDonuts.addTopping();
    }	
 }