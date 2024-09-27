package com.iesam.superheroe.feature.feed.data.remote.workApi;

public class Work {
    public final String occupation;
    public final String base;

    public Work(String occupation, String base) {
        this.occupation = occupation;
        this.base = base;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getBase() {
        return base;
    }
}
