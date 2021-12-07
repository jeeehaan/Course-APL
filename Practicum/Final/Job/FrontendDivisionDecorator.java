package Job;

/**
 * Concrete Class yang mengextend DivisionDecorator
 */
public class FrontendDivisionDecorator extends DivisionDecorator {

    /**
    * Method Constructor
    * @param decoratedDivision
    */ 
   public FrontendDivisionDecorator(IDivision decoratedDivision) {
       super(decoratedDivision);		
    }
 
    @Override
    public void addDivision() {
       decoratedDivision.addDivision();	       
       setBackendDivision(decoratedDivision);
    }
 
    /**
     * Method Mutator untuk mengubah nilai Divisi menjadi Frontend
     * @param decoratedDivision
     */
    private void setBackendDivision(IDivision decoratedDivision){
       System.out.println("Division: Frontend");
    }
 }