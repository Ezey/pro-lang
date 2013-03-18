
public class Memur extends Hoca {
	private int M_SicilNo;
	
	String Birim;
	public void Memur_Tanýmla(int M_SicilNo, String Birim){
		this.setM_SicilNo(M_SicilNo);
		this.Birim = Birim;
	}
	public static void Evrak_getir(String string){
		System.out.println("Memur evrak getirir...");
	}
	public static void Evrak_gotur(String string){
		System.out.println("Memur evrak götürür...");
	}
	public int getM_SicilNo() {
		return M_SicilNo;
	}
	public void setM_SicilNo(int m_SicilNo) {
		M_SicilNo = m_SicilNo;
	}
	

}
