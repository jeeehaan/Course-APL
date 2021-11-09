class Main
{
    public static void main(String args[])
    {
        Jessy jessy = new Jessy();
        Indonesian indonesian = new David();
  
        // Wrap a cat in a CatAdapter so that it 
        // behaves like duck
        Indonesian englishAdapter = new EnglishAdapter(jessy);
  
        System.out.print("Jessy from England...");
        jessy.say();
  
        System.out.print("David from Indonesia...");
        indonesian.berkata();
  
        // duck behaving like a cat 
        System.out.print("EnglishAdapter...");
        englishAdapter.berkata();
    }
}