public class baitap3 {
    public static void main(String[] args){
        //BMI = Cân nặng (kg) / (Chiều cao (m) * Chiều cao (m))

        double weight = 65.5;
        double height = 1.70;

        double bmi = weight / (height * height);

        System.out.println("Cân nặng: " + weight + "kg");
        System.out.println("Chiều cao: " + height + " m");
        System.out.println("Chỉ số BMI: " + bmi);

        //Phân loại BMI
        if (bmi < 18.5) {
            System.out.println("Phân loại: Thiếu cân");
        } else if (bmi < 25) {
            System.out.println("Phân loại: Bình thường");
        } else if (bmi < 30) {
            System.out.println("Phân loại: Thừa cân");
        } else {
            System.out.println("Phân loại: Béo phì");
        }
    }
}