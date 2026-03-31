package org.example.no_gacha_no_life;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GachaEngine {
    private int pity5 = 0;
    private int pity4 = 0;
    private boolean isGuaranteed = false;
    private Random random = new Random();

    // Danh sách nhân vật (Hãy đảm bảo tên này khớp với tên file ảnh .png)
    private String[] limited5Star = {"Acheron", "Kazuha", "Firefly"};
    private String[] standard5Star = {"Diluc", "Jean", "Qiqi"};

    public GachaItem roll() {
        pity5++;
        pity4++;

        // 1. Check 5 sao (Tỉ lệ 0.6% hoặc Pity 90)
        if (pity5 >= 90 || random.nextDouble() < 0.006) {
            return trigger5Star();
        }
        // 2. Check 4 sao (Tỉ lệ 5.1% hoặc Pity 10)
        if (pity4 >= 10 || random.nextDouble() < 0.051) {
            pity4 = 0;
            return new GachaItem("Nhân vật 4 sao", 4);
        }
        // 3. 3 sao
        return new GachaItem("Vũ khí 3 sao", 3);
    }

    private GachaItem trigger5Star() {
        pity5 = 0;
        pity4 = 0;

        // Cơ chế 50/50
        if (isGuaranteed || random.nextBoolean()) {
            // Trúng nhân vật giới hạn
            isGuaranteed = false;
            return new GachaItem(limited5Star[random.nextInt(limited5Star.length)], 5);
        } else {
            // Lệch rate (Ra nhân vật thường)
            isGuaranteed = true; // Lần sau chắc chắn trúng giới hạn
            return new GachaItem(standard5Star[random.nextInt(standard5Star.length)], 5);
        }
    }

    public List<GachaItem> roll10() {
        List<GachaItem> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) list.add(roll());
        return list;
    }

    // Getters để Controller hiển thị lên màn hình
    public int getPity5() { return pity5; }
    public boolean isGuaranteed() { return isGuaranteed; }
}