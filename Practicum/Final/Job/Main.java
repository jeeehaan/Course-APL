package Job;

/**
  * Class untuk menjalankan program
   * @author Jessy Hanifiah
  */
public class Main 
{
    
    /** 
     * method untuk menjalankan program
     * @param args
     */
    public static void main(String[] args) 
    {
        // inisialisasi
        // Applicant1 yongsan = new Applicant1();
        // Applicant2 chulsan = new Applicant2();
        Applicant3 dosan = new Applicant3();
        HRD hrd = new HRD();
         
        // menambahkan objek ke dalam daftar observer
        // hrd.attach(yongsan);
        // hrd.attach(chulsan);
        
        // menghapus objek ke dalam daftar observer
        // hrd.detach(a1);
        // hrd.detach(a2);

        // mengirim notifikasi ke a1 dan a2
        hrd.notifyUpdate(new Message("Congratulation! You have been accepted to work at Samsan Tech"));   

        // mengirim notifikasi ke a3
        hrd.attach(dosan);
        hrd.notifyUpdate(new Message("Congratulation! You have been accepted to work at Samsan Tech"));   
        
    }
} 