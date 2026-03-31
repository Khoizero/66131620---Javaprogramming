package org.example.no_gacha_no_life;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import java.util.List;

public class HelloController {
    @FXML private Label pityLabel, resultLabel, guaranteeLabel;
    @FXML private ImageView characterImage;
    @FXML private TextArea historyArea;

    private GachaEngine engine = new GachaEngine();

    @FXML
    protected void onRoll1Click() {
        GachaItem result = engine.roll();
        displayResult(result);
        historyArea.appendText(result.toString() + "\n");
    }

    @FXML
    protected void onRoll10Click() {
        List<GachaItem> results = engine.roll10();
        GachaItem best = results.get(0);

        historyArea.appendText("--- Lượt quay x10 ---\n");
        for (GachaItem item : results) {
            historyArea.appendText(item.toString() + "\n");
            if (item.getRarity() > best.getRarity()) best = item;
        }
        displayResult(best); // Hiện ảnh món hiếm nhất
    }

    private void displayResult(GachaItem item) {
        resultLabel.setText(item.getName());
        pityLabel.setText("CURRENT PITY: " + engine.getPity5());
        guaranteeLabel.setText("Bảo hiểm: " + (engine.isGuaranteed() ? "CÓ" : "KHÔNG"));

        // Hiệu ứng phát sáng
        if (item.getRarity() == 5) {
            resultLabel.setStyle("-fx-text-fill: #FFD700; -fx-font-weight: bold;");
            characterImage.setEffect(new DropShadow(30, Color.GOLD));
        } else if (item.getRarity() == 4) {
            resultLabel.setStyle("-fx-text-fill: #A29BFE;");
            characterImage.setEffect(new DropShadow(15, Color.PURPLE));
        } else {
            resultLabel.setStyle("-fx-text-fill: white;");
            characterImage.setEffect(null);
        }

        // Load ảnh
        try {
            String path = "/org/example/no_gacha_no_life/images/" + item.getName() + ".png";
            var stream = getClass().getResourceAsStream(path);
            if (stream != null) {
                characterImage.setImage(new Image(stream));
            } else {
                characterImage.setImage(new Image(getClass().getResourceAsStream("/org/example/no_gacha_no_life/images/default.png")));
            }
        } catch (Exception e) {
            System.out.println("Thiếu ảnh: " + item.getName());
        }
    }

    @FXML
    protected void onResetClick() {
        historyArea.clear();
        characterImage.setImage(null);
        resultLabel.setText("Đã làm mới!");
    }
}