module com.example.no_gacha_no_life { // Tên module (thường IntelliJ tự đặt khi tạo)
    requires javafx.controls;
    requires javafx.fxml;

    // QUAN TRỌNG: Phải khớp với package bạn đã đặt
    opens org.example.no_gacha_no_life to javafx.fxml;
    exports org.example.no_gacha_no_life;
}