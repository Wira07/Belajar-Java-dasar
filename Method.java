package wira;

public class Method {
   
   public String username;
   public String password;

   public Method(String username, String password) {
      this.username = username;
      this.password = password;
   }
   // membuat method tanpa return dan tanpa parameter
   public void show(){
      System.out.println(" masukan username : "+this.username);
      System.out.println(" masukan password : "+this.password);
   }
   // membuat method tanpa return dan tapi pakai parameter
   public void setNama(String username){
      this.username = username;
   }
   // membuat method dengan return dan tanpa parameter
   public String getNama(){
      return this.username;
   }
   public String getNim(){
      return this.password;
   }
   // membuat method dengan return dan dengan parameter
   String haloHai(String perkenalan){
      return perkenalan + "Hai, Nama Saya Wira Sukma Saputra" +this.username;
   }
}
class Gajah {
   public static void main(String[] args) {
      Method wira = new Method ("wira sukma saputra","090909");
      wira.show();
      wira.setNama(" Lucky Mayasari");
      wira.show();
      System.out.println(wira.getNama());
      System.out.println(wira.getNim());
      String data = wira.haloHai("ganteng ");
      System.out.println(data);
   }
}
