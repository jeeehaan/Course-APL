package Job;
/**
 * Concrete Class dari Interface Observer
 */
public class Applicant2 implements Observer 
{
    
    /** 
     * @param m
     */
    @Override
    public void update(Message m) {
        System.out.println("Lee Chul San : " + m.getMessageContent());
    }
}