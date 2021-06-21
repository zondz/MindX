package tutorial_1.ex2;

public abstract class TaiLieu {
	private int MaTaiLieu;
	private String NhaXuatBan;
	private String soBanPhatHanh;
	
	public TaiLieu(int maTaiLieu, String nhaXuatBan, String soBanPhatHanh) {
		super();
		MaTaiLieu = maTaiLieu;
		NhaXuatBan = nhaXuatBan;
		this.soBanPhatHanh = soBanPhatHanh;
	}
	public int getMaTaiLieu() {
		return MaTaiLieu;
	}
	public void setMaTaiLieu(int maTaiLieu) {
		MaTaiLieu = maTaiLieu;
	}
	public String getNhaXuatBan() {
		return NhaXuatBan;
	}
	public void setNhaXuatBan(String nhaXuatBan) {
		NhaXuatBan = nhaXuatBan;
	}
	public String getSoBanPhatHanh() {
		return soBanPhatHanh;
	}
	public void setSoBanPhatHanh(String soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}
	
}
