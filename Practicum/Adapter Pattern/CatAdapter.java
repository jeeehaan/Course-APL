class CatAdapter implements Duck
{
    // You need to implement the interface your
    // client expects to use.
    Cat duck;
    public CatAdapter(Cat duck)
    {
        // we need reference to the object we
        // are adapting
        this.duck = duck;
    }
  
    public void kwek()
    {
        // translate the methods appropriately
        duck.makeSound();
    }
}
