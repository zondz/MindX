package tutorial_1.ex2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Manager <T> {
	private List<Bao> baoList;
	private List<Sach> sachList;
	private List<TapChi> tapChiList;
	
	public Manager() {
		// TODO Auto-generated constructor stub
		baoList = new ArrayList<Bao>();
		sachList = new ArrayList<Sach>();
		tapChiList = new ArrayList<TapChi>();
	}
	
	
	public int  classifyItem(T item) {
		
		if(item instanceof Bao) {
			return 1;
		}
		if(item instanceof Sach) {
			return 2;
		}
		if(item instanceof TapChi) {
			return 3;
		}
		return 0;
	}
	public void add(T item) {
		int type = this.classifyItem(item);
		switch(type) {
		case 1:
			baoList.add((Bao) item);
			break;
		case 2:
			sachList.add((Sach) item);
			break;
			
		case 3:
			tapChiList.add((TapChi) item);
			break;
		}
	}
	public void remove(int maTaiLieu, T loaiTaiLieu) {
		switch(classifyItem(loaiTaiLieu)) {
		case 1:
			baoList.stream().forEach((Bao b)->{
				if(b.getMaTaiLieu()==maTaiLieu) {
					baoList.remove(b);
					
				}
			});
			break;
		case 2:
			sachList.stream().forEach((Sach s)->{
				if(s.getMaTaiLieu()==maTaiLieu) {
					sachList.remove(s);
				}
			});
			break;
		case 3: 
			tapChiList.stream().forEach((TapChi s)->{
				if(s.getMaTaiLieu()==maTaiLieu) {
					tapChiList.remove(s);
				}
			});
			
		}
		
		
		
	}
	public void showInfor(int id , String loaiTaiLieu) {
		
		switch(loaiTaiLieu) {
		case "Bao":
			baoList.forEach((Bao b)->{
				if(b.getMaTaiLieu() == id) {
					b.toString();
				}
			});
			break;
		case "Sach":
			sachList.forEach((Sach s)->{
				if(s.getMaTaiLieu() == id) {
					s.toString();
				}
			});
			break;
			
		case "Tap Chi":
			tapChiList.forEach((TapChi t)->{
				if(t.getMaTaiLieu() == id) {
					t.toString();
				}
			});
			break;
		}
	}
	public List<?> Search(String loaiTaiLieu) {
		if(loaiTaiLieu.equals("Bao")) {
			return baoList;
		}
		if(loaiTaiLieu.equals("Sach")) {
			return sachList;
		}
		if(loaiTaiLieu.equals("Tap Chi")) {
			return tapChiList;

		}
		return null;
	}
	
	public List<Bao> getBaoList() {
		return baoList;
	}


	public void setBaoList(List<Bao> baoList) {
		this.baoList = baoList;
	}


	public List<Sach> getSachList() {
		return sachList;
	}


	public void setSachList(List<Sach> sachList) {
		this.sachList = sachList;
	}


	public List<TapChi> getTapChiList() {
		return tapChiList;
	}


	public void setTapChiList(List<TapChi> tapChiList) {
		this.tapChiList = tapChiList;
	}


	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Manager manager = new Manager ();
		manager.add(new Bao(1,"2","@",LocalDate.of(2021, 1, 1)));
		System.out.println(manager.getBaoList());
	}
}
