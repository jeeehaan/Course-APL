package Job;
/**
 * Abstract Decorator Class yang mengimplements IDivision
 */
public abstract class DivisionDecorator implements IDivision {
    protected IDivision decoratedDivision;
 
    /**
     * Method Constructor
     * @param decoratedDivision
     */
    public DivisionDecorator(IDivision decoratedDivision){
       this.decoratedDivision = decoratedDivision;
    }
 
  /**
   * Method untuk menambahkan divisi
   */
  @Override
    public void addDivision(){
      decoratedDivision.addDivision();
    }	
 }