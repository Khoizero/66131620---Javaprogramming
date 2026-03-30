package org.example.no_gacha_no_life;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class GachaEngine {
    // Các biến đếm Pity và trạng thái bảo hiểm
    private int pity5 = 0;
    private int pity4 = 0;
    private boolean isGuaranteed = false;
    private Random random = new Random();

    // Danh sách vật phẩm nạp từ file
    private List<String> limited5StarPool;
    private List<String> standard5StarPool;
    private List<String> pool4Star;

    public GachaEngine() {
        // Giai đoạn 2: Nạp dữ liệu từ file thông qua FileHandler
        this.limited5StarPool = FileHandler.loadItemsFromFile("limited_5star.txt");
        this.standard5StarPool = FileHandler.loadItemsFromFile("standard_5star.txt");
        this.pool4Star = FileHandler.loadItemsFromFile("items_4star.txt");

        // Kiểm tra an toàn: Nếu file trống, thêm dữ liệu mặc định để code không bị crash
        if (limited5StarPool.isEmpty()) limited5StarPool.add("Nhân vật 5 sao giới hạn mẫu");
        if (standard5StarPool.isEmpty()) standard5StarPool.add("Nhân vật 5 sao thường mẫu");
        if (pool4Star.isEmpty()) pool4Star.add("Vật phẩm 4 sao mẫu");
    }

    /**
     * Hàm thực hiện 1 lần quay đơn lẻ
     */
    public GachaItem roll() {
        pity5++;
        pity4++;

        double currentRate5 = calculate5StarRate();

        // 1. KIỂM TRA TRÚNG 5 SAO
        if (random.nextDouble() < currentRate5) {
            GachaItem item5Star = process5Star();
            pity4++; // 5 sao vẫn tính là 1 lượt tăng pity cho 4 sao (hoặc reset tùy game)
            FileHandler.saveHistory(item5Star.toString()); // Lưu lịch sử
            return item5Star;
        }

        // 2. KIỂM TRA TRÚNG 4 SAO (Nếu không trúng 5 sao)
        // Tỉ lệ 10% cơ bản hoặc chạm mốc 10 lần (Hard pity 4 sao)
        if (pity4 >= 10 || random.nextDouble() < 0.10) {
            pity4 = 0; // Reset pity 4 sao
            String name = pool4Star.get(random.nextInt(pool4Star.size()));
            GachaItem item4Star = new GachaItem(name, 4);
            FileHandler.saveHistory(item4Star.toString()); // Lưu lịch sử
            return item4Star;
        }

        // 3. TRÚNG ĐỒ 3 SAO (Mặc định)
        GachaItem item3Star = new GachaItem("Vũ khí 3 sao", 3);
        // Thường không cần lưu 3 sao vào lịch sử nếu bạn muốn bảng lịch sử gọn nhẹ
        return item3Star;
    }

    /**
     * Tính toán tỉ lệ rơi đồ 5 sao dựa trên số lần đã quay (Pity)
     */
    private double calculate5StarRate() {
        if (pity5 >= 100) return 1.0; // Hard Pity: 100% trúng ở lần 100

        if (pity5 >= 75) {
            // Soft Pity: Từ lượt 75 đến 99, mỗi lượt tăng thêm 4% tỉ lệ
            // 0.001 (0.1%) + (số lượt vượt quá 74) * 0.04
            return 0.001 + (pity5 - 74) * 0.04;
        }

        return 0.001; // Tỉ lệ mặc định 0.1%
    }

    /**
     * Xử lý logic khi đã xác định trúng 5 sao (Check 50/50)
     */
    private GachaItem process5Star() {
        int lastPity = pity5;
        pity5 = 0; // Reset pity 5 sao ngay lập tức

        String itemName;
        // Nếu đang có bảo hiểm (isGuaranteed) hoặc quay trúng 50% may mắn
        if (isGuaranteed || random.nextDouble() < 0.5) {
            // TRÚNG NHÂN VẬT HIẾM
            itemName = limited5StarPool.get(random.nextInt(limited5StarPool.size()));
            isGuaranteed = false; // Reset trạng thái bảo hiểm
            return new GachaItem(itemName + " (Thắng 50/50 - Pity: " + lastPity + ")", 5);
        } else {
            // BỊ LỆCH (THUA 50/50)
            itemName = standard5StarPool.get(random.nextInt(standard5StarPool.size()));
            isGuaranteed = true; // Kích hoạt bảo hiểm cho lần sau
            return new GachaItem(itemName + " (LỆCH - Pity: " + lastPity + ")", 5);
        }
    }

    /**
     * Hàm hỗ trợ quay 10 lần cùng lúc
     */
    public List<GachaItem> rollTen() {
        List<GachaItem> results = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            results.add(roll());
        }
        return results;
    }

    // Các hàm Getter để hiển thị lên giao diện sau này
    public int getPity5() { return pity5; }
    public boolean isGuaranteed() { return isGuaranteed; }
}