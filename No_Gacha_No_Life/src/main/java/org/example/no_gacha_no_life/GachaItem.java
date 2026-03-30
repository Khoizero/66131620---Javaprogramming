package org.example.no_gacha_no_life;

public class GachaItem {
    private String name;
    private int rarity;

    public GachaItem(String name, int rarity) {
        this.name = name;
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public int getRarity() {
        return rarity;
    }

    @Override
    public String toString() {
        String color = (rarity == 5) ? "VÀNG" : (rarity == 4 ? "TÍM" : "XANH");
        return "[" + rarity + " SAO - " + color + "] " + name;
    }
}