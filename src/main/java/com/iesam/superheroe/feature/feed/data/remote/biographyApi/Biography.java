package com.iesam.superheroe.feature.feed.data.remote.biographyApi;
import java.util.List;
public class Biography {
    public final String fullName;
    public final String alterEgos;
    public final List<String> aliases;
    public final String placeOfBirth;
    public final String firstAppearance;
    public final String publisher;
    public final String alignment;

    public Biography(String fullName, String alterEgos, List<String> aliases, String placeOfBirth, String firstAppearance, String publisher, String alignment) {
        this.fullName = fullName;
        this.alterEgos = alterEgos;
        this.aliases = aliases;
        this.placeOfBirth = placeOfBirth;
        this.firstAppearance = firstAppearance;
        this.publisher = publisher;
        this.alignment = alignment;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAlterEgos() {
        return alterEgos;
    }

    public List<String> getAliases() {
        return aliases;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public String getFirstAppearance() {
        return firstAppearance;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAlignment() {
        return alignment;
    }
}
