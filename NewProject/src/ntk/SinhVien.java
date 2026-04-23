package ntk;

public class SinhVien {
	protected int maSo;
	protected String name;
	protected double diemTB;
	
	public SinhVien() { }
	public SinhVien(int maSo, String name, double diemTB) {
		this.maSo = maSo;
		this.name = name;
		this.diemTB = diemTB;
	}
	
	public double getDiem() {
		return diemTB;
	}
	
	public void hienthi() {
		System.out.println("MSSV: " + maSo + " | Họ Tên: " + name + " | Điểm trung bình: " + diemTB);
	}
	
	
}
