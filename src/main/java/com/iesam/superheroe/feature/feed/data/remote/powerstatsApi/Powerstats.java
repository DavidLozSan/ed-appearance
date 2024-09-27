package com.iesam.superheroe.feature.feed.data.remote.powerstatsApi;

public class Powerstats {
    public final Integer intelligence;
    public final Integer strength;
    public final Integer speed;
    public final Integer durability;
    public final Integer power;
    public final Integer combat;

    public Powerstats(Integer intelligence, Integer strength, Integer speed, Integer durability, Integer power, Integer combat) {
        this.intelligence = intelligence;
        this.strength = strength;
        this.speed = speed;
        this.durability = durability;
        this.power = power;
        this.combat = combat;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public Integer getStrength() {
        return strength;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getDurability() {
        return durability;
    }

    public Integer getPower() {
        return power;
    }

    public Integer getCombat() {
        return combat;
    }
}
