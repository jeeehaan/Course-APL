class Main
{
    public static void main(String args[])
    {
        Ocicat ocicat = new Ocicat();
        Duck duck = new Eider();
  
        // Wrap a cat in a CatAdapter so that it 
        // behaves like duck
        Duck catAdapter = new CatAdapter(ocicat);
  
        System.out.print("ocicat make sound : ");
        ocicat.makeSound();
  
        System.out.print("duck make sound   : ");
        duck.kwek();
  
        // duck behaving like a cat 
        System.out.print("duck make sound   : ");
        catAdapter.kwek();
    }
}