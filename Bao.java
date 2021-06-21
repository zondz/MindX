package tutorial_1.ex2;

import java.time.LocalDate;

public class Bao extends TaiLieu {
	private LocalDate ngayPhatHanh;

	public Bao(int maTaiLieu, String nhaXuatBan, String soBanPhatHanh,LocalDate ngayPhatHanh) {
		super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
		// TODO Auto-generated constructor stub
		this.ngayPhatHanh = ngayPhatHanh;
	}

	public LocalDate getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(LocalDate ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}

	@Override
	public String toString() {
		return "Bao [ngayPhatHanh=" + ngayPhatHanh + "]";
	}

}
