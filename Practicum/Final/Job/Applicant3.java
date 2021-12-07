package Job;
/**
 * Concrete Class dari Interface Observer
 */
public class Applicant3 implements Observer 
{
    
    /** 
     * @param m
     */
    @Override
    public void update(Message m) {
        System.out.println("Nam Do-san : " + m.getMessageContent());
    }
}