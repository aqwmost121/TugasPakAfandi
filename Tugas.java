public class Tugas{
  public static void main(String[] args){
    Shinobi[] s = new Shinobi[3];

    s[0] = new Shinobi();
    s[0].setNoReg("012606");
    s[0].setNama("Uchiha Sasuke");
    s[0].setRank("Genin");

    s[1] = new Shinobi();
    s[1].setNoReg("012607");
    s[1].setNama("Uzumaki Naruto");
    s[1].setRank("Genin");

    s[2] = new Shinobi();
    s[2].setNoReg("012601");
    s[2].setNama("Haruno Sakura");
    s[2].setRank("Chunin");
    System.out.println("Data Shinobi \n");
    for(Shinobi x:s){
      System.out.println("Nomor Registrasi : " +x.getNoReg());
      System.out.println("Nama : " +x.getNama());
      System.out.println("Prodi : " +x.getRank());

    }
  }
}
