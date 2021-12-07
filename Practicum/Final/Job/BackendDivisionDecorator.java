package Job;
/**
 * Concrete Class yang mengextend DivisionDecorator
 */
public class BackendDivisionDecorator extends DivisionDecorator {

   /**
    * Method Constructor
    * @param decoratedDivision
    */
    public BackendDivisionDecorator(IDivision decoratedDivision) {
       super(decoratedDivision);		
    }
 
    @Override
    public void addDivision() {
       decoratedDivision.addDivision();	       
       setBackendDivision(decoratedDivision);
    }
 
    /**
     * Method Mutator untuk mengubah nilai Divisi menjadi Backend
     * @param decoratedDivision
     */
    private void setBackendDivision(IDivision decoratedDivision){
       System.out.println("Division: Backend");
    }
 }