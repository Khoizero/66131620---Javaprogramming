package ntk.quanli_hocsinh;

public class HocSinh {
    private String tenHS;
    private int tuoiHS;
    private String lopHS;

    public HocSinh() {}

    public HocSinh(String tenHS, int tuoiHS, String lopHS) {
        this.tenHS = tenHS;
        this.tuoiHS = tuoiHS;
        this.lopHS = lopHS;
    }

    //GETTER
    public String gettenHS () { return tenHS; }

    public int gettuoiHS () { return tuoiHS; }

    public String getlopHS () { return lopHS; }

    //SETTER
    public void setTenHS (String tenHS) {
        this.tenHS = tenHS;
    }

    public void setTuoiHS (int tuoiHS) {
        if (tuoiHS > 0) this.tuoiHS = tuoiHS;
        else System.out.println("Tuoi khong hop le");
    }

    public void setLopHS (String lopHS) {
        this.lopHS = lopHS;
    }

    @Override
    public String toString() {
//        StringBuilder sb = new StringBuilder();
//
//        sb.append("===Thong tin Hoc Sinh===").append("\n");
//        sb.append("Ten Hoc Sinh: ").append(tenHS).append("\n");
//        sb.append("Tuoi Hoc Sinh: ").append(tuoiHS).append("\n");
//        sb.append("Lop Hoc Sinh: ").append(lopHS).append("\n");
//        sb.append("========================");
//
//        return sb.toString();
        return "===Thong tin hoc sinh===\n" +
                       "- Ten: " + this.tenHS + "\n" +
                       "- Tuoi: " + this.tuoiHS + "\n" +
                       "- Lop: " + this.lopHS + "\n" +
                       "========================";
    }
}
