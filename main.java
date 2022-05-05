package wira;

public class main {
   float luas(){
      System.out.println("Menghitung Luas\t\t : ");
      return 0;
   }
   float keliling(){
      System.out.println("Menghitung Keliling\t : ");
      return 0;
   }
}
class Persegipanjang extends main{
   float panjang;
   float lebar;
   @Override 
   float luas(){
      float luas = panjang * lebar;
      System.out.println("Luas Persegi Panjang\t : " + luas);
      return luas;
   }
   @Override
   float keliling(){
      float keliling = 2 * (panjang + lebar);
      System.out.println("Keliling Persegi Panjang : " + keliling);
      return keliling;
   }
}
class Output {
   public static void main(String[] args) {
      main wira = new main();
      Persegipanjang persegipanjang = new Persegipanjang();
      persegipanjang.panjang = 10;
      persegipanjang.lebar = 5;

      wira.luas();
      wira.keliling();

      persegipanjang.luas();
      persegipanjang.keliling();
   }
}