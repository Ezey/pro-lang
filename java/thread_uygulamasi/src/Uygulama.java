public class Uygulama
{
   public static void main(String args[])
   {
    Islem i1 = new Islem("EMre zeyrek", 2); // iki kere emre zeyrek
    Islem i2 = new Islem("CENG", 3); // 3 kere ceng  yazıdırılacak
    Islem i3 = new Islem("OMU", 3); // 3 kere omu yazdırılacak

    i1.start();
    i2.start();
    i3.start();
   }
}
