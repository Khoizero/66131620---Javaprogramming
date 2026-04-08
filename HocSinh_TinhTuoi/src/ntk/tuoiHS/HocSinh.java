package ntk.tuoiHS;

public class HocSinh {
    private String tenHS;
    private int namSinh;

    public HocSinh() {}
    public HocSinh(String tenHS, int namSinh) {
        this.tenHS = tenHS;
        this.namSinh = namSinh;
    }

    public String gettenHS () { return tenHS; }

    public int getnamSinh () { return namSinh; }

    public void setTenHS (String tenHS) {
        this.tenHS = tenHS;
    }
    public void setNamSinh (int namSinh) { this.namSinh = namSinh; }

    public int getTuoi() {
        return 2026 - namSinh;
    }
}
