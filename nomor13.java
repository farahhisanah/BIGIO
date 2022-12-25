import java.util.*;
class nomor13
{
   public static void main(String args[])
   {
      String kalimat, balik ="";
      Scanner in = new Scanner(System.in); 
      System.out.println("Reverse :");
      kalimat = in.nextLine();
      int panjang = kalimat.length();
      for ( int i = panjang - 1; i >= 0; i-- )
      {
          balik = balik + kalimat.charAt(i);
      }
      System.out.println("Output : "+ balik);
   }
} 