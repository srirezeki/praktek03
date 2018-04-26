package praktek03;
public class sepedaaksi {
    public static void main(String[] args) {   
    sepeda s = new sepeda();
    
    s.setMerk("butterfly");
    s.setWarna("merah");
    s.setHarga(1000);
    
    s.cetakinfo();
    
    System.out.print("Merknya \t: ");
    System.out.println(s.getMerk());
    System.out.print("Warnanya \t: ");
    System.out.println(s.getWarna());
    System.out.print("Harganya \t: "); 
    System.out.println(s.getHarga());
    }
}
