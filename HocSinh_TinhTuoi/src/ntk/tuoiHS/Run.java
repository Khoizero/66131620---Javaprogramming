package ntk.tuoiHS;

public class Run {
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh();
        hs1.setTenHS("Nguyễn Văn A");
        hs1.setNamSinh(2006);
        System.out.println(hs1.gettenHS());
        System.out.println("Tuổi học sinh: " + hs1.getTuoi());
    }
}
