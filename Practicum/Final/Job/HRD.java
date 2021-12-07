package Job;
import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Class dari Interface Subject
 */
public class HRD implements Subject {
     
    private List<Observer> observers = new ArrayList<>();
 
    
    /** 
     * @param o
     */
    @Override
    public void attach(Observer o) {
        observers.add(o);
    }
 
    
    /** 
     * @param o
     */
    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }
 
    
    /** 
     * @param m
     */
    @Override
    public void notifyUpdate(Message m) {
        for(Observer o: observers) {
            o.update(m);
            IDivision backend = new BackendDivisionDecorator(new Division());  
            backend.addDivision();
            // IDivision frontend = new FrontendDivisionDecorator(new Division());  
            // frontend.addDivision();
        }
    }
}