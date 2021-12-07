package Job;
/**
 * Class untuk menulis pesan
 */
public class Message 
{
    final String messageContent;
     
    /**
     * method constructor
     * @param m
     */
    public Message (String m) {
        this.messageContent = m;
    }
 
    /**
     * method accessor untuk mengembalikan nilai messageContent
     * @return messageContent
     */
    public String getMessageContent() {
        return messageContent;
    }
}