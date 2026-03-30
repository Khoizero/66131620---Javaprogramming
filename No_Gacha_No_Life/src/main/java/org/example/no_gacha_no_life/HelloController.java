package org.example.no_gacha_no_life;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import java.util.List;

public class HelloController {
    // Gọi bộ não đã viết ở Giai đoạn 1 & 2
    private GachaEngine engine = new GachaEngine();

    @FXML
    private Label pityLabel;
    @FXML
    private Label resultLabel;
    @FXML
    private TextArea historyArea;

    @FXML
    protected void onRoll1Click() {
        GachaItem item = engine.roll();
        displayResult(item);
    }

    @FXML
    protected void onRoll10Click() {
        List<GachaItem> results = engine.rollTen();
        historyArea.appendText("--- Lượt quay x10 ---\n");
        for (GachaItem item : results) {
            displayResult(item);
        }
    }

    @FXML
    protected void onResetClick() {
        // 1. Xóa nội dung trên ô lịch sử (Giao diện)
        historyArea.clear();

        // 2. Cập nhật nhãn kết quả về mặc định
        resultLabel.setText("Đã làm mới hệ thống!");
        resultLabel.setStyle("-fx-text-fill: white;");

        // 3. Nếu bạn muốn reset luôn cả Pity về 0 (Logic):
        // engine = new GachaEngine();
        // updatePityDisplay();

        System.out.println("Đã xóa lịch sử hiển thị.");
    }

    private void displayResult(GachaItem item) {
        // Cập nhật nhãn kết quả
        resultLabel.setText("Nhận được: " + item.getName());

        // Đổi màu theo độ hiếm
        if (item.getRarity() == 5) resultLabel.setStyle("-fx-text-fill: #FFD700;"); // Vàng
        else if (item.getRarity() == 4) resultLabel.setStyle("-fx-text-fill: #A020F0;"); // Tím
        else resultLabel.setStyle("-fx-text-fill: #808080;"); // Xám

        // Cập nhật Pity
        pityLabel.setText("Pity 5 sao: " + engine.getPity5() + " | Bảo hiểm: " + (engine.isGuaranteed() ? "ON" : "OFF"));

        // Ghi vào bảng lịch sử trên giao diện
        historyArea.appendText(item.toString() + "\n");
    }
}