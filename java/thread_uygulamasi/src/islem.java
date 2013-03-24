class Islem extends Thread
{
	
   private String isim="";
   private int donguSay=0;
   public Islem(String isim, int donguSay)
   {
        this.donguSay=donguSay;
       this.isim=isim;
   }
   public void run()
   {
       for (int i=0; i<donguSay; i++)
      {
         System.out.println(i +"." + this.isim + " yazdirildi");
      }
   }
}