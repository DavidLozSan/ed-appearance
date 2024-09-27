package com.iesam.superheroe.feature.feed.data.remote.connectionsApi;

public class Connections {
    public final String groipAffiliation;
    public final String relatives;

    public Connections(String groipAffiliation, String relatives) {
        this.groipAffiliation = groipAffiliation;
        this.relatives = relatives;
    }

    public String getGroipAffiliation() {
        return groipAffiliation;
    }

    public String getRelatives() {
        return relatives;
    }
}
