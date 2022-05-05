package wira;

class Susu {
   String nama;
   String nim;
   String jurusan;
   String alamat;
   String jenisKelamin;
   int umur;
   double IPK;
}


class Jaja {
   public static void main(String[] args) throws Exception{
      Susu wira = new Susu();
      wira.nama = "wira sukma saputra";
      wira.nim = "20210810075";
      wira.jurusan = "teknik informatika";
      wira.alamat = "Kelurahan Cijoho Landeuh";
      wira.jenisKelamin = "laki - laki";
      wira.umur = 20;
      wira.IPK = 4.0;

      System.out.println(wira.nama);
      System.out.println(wira.nim);
      System.out.println(wira.jurusan);
      System.out.println(wira.alamat);
      System.out.println(wira.jenisKelamin);
      System.out.println(wira.umur);
      System.out.println(wira.IPK);
   }
}