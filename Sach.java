package tutorial_1.ex2;

public class Sach extends TaiLieu{
	
	private String tenTacGia;
	private int soTrang;
	public Sach(int maTaiLieu, String nhaXuatBan, String soBanPhatHanh, String tenTacGia, int soTrang) {
		super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
		// TODO Auto-generated constructor stub
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
	}

	
	public String getTenTacGia() {
		return tenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	public int getSoTrang() {
		return soTrang;
	}
	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	
}
