package Job;
/**
 * Interface untuk menambahkan atau menghapus ke/dari daftar obeserver dan memberi notifikasi ke obeserver
 */
public interface Subject 
{
    /**
     * method untuk menmbahkan objek ke dalam daftar observer
     * @param o
     */
    public void attach(Observer o);

    /**
     * method untuk menghapus objek dari daftar observer
     * @param o
     */
    public void detach(Observer o);

    /**
     * method untuk memberi notifikasi ke observer
     * @param m
     */
    public void notifyUpdate(Message m);
}