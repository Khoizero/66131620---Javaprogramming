package org.example.no_gacha_no_life;

public class GachaItem {
    private String name;
    private int rarity;

    public GachaItem(String name, int rarity) {
        this.name = name;
        this.rarity = rarity;
    }

    public String getName() { return name; }
    public int getRarity() { return rarity; }

    @Override
    public String toString() {
        String stars = (rarity == 5) ? "⭐⭐⭐⭐⭐" : (rarity == 4 ? "⭐⭐⭐⭐" : "⭐⭐⭐");
        return "[" + stars + "] " + name;
    }
}