package tutorial_1.ex2;

public class TapChi extends TaiLieu {

	private String soPhatHanh;
	private int thangPhatHanh;

	public TapChi(int maTaiLieu, String nhaXuatBan, String soBanPhatHanh,String soPhatHanh,int thangPhatHanh) {
		super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
		// TODO Auto-generated constructor stub
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

	public String getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(String soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public int getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(int thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}

}
