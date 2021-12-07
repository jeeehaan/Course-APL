package Job;
/**
 * Concrete Class dari Interface Observer
 */
public class Applicant1 implements Observer 
{
    
    /** 
     * @param m
     */
    @Override
    public void update(Message m) {
        System.out.println("Kim Yong-san : " + m.getMessageContent());
    }
}