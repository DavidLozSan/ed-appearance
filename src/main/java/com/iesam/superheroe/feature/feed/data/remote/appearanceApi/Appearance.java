package com.iesam.superheroe.feature.feed.data.remote.appearanceApi;
import java.util.List;
public class Appearance {
    public final String gender;
    public final String race;
    public final List<String> height;
    public final List<String> weight;
    public final String eyeColor;
    public final String hairColor;

    public Appearance(String gender, String race, List<String> height, List<String> weight, String eyeColor, String hairColor) {
        this.gender = gender;
        this.race = race;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

    public String getGender() {
        return gender;
    }

    public String getRace() {
        return race;
    }

    public List<String> getHeight() {
        return height;
    }

    public List<String> getWeight() {
        return weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }
}
