package wira;

class Wira {
   public String username;
   public String password;

   public Wira(String username, String password){
      this.username = username;
      this.password = password;
      Neno.sukma();
   }
   public void kelas(){ 
      System.out.println("Masukan username\t : "+this.username);
      System.out.println("Masukan password\t : "+this.password);
   }
   public void setNama(String username){
      this.username = username;
   }
   public String getNama(){
      return this.username;
   }
   public String getNim(){
      return this.password;
   }
}
class Neno {   
   public static void main(String[] args) {
      Wira lucky = new Wira("Wira Sukma Saputra","87979898");
      System.out.println("username\t : "+lucky.username);
      System.out.println("password\t : "+lucky.password);
      lucky.kelas();
      lucky.setNama("Wira baelah naha deuih masalah");
      lucky.kelas();

      System.out.println(lucky.getNama());
      System.out.println(lucky.getNim());
   }
   public static void sukma() {
      System.out.println("saya sedang bermain java");
   }
   
}