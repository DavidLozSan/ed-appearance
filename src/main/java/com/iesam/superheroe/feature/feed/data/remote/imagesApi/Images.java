package com.iesam.superheroe.feature.feed.data.remote.imagesApi;

public class Images {
    public final String xs;
    public final String sm;
    public final String md;
    public final String lg;

    public Images(String xs, String sm, String md, String lg) {
        this.xs = xs;
        this.sm = sm;
        this.md = md;
        this.lg = lg;
    }

    public String getXs() {
        return xs;
    }

    public String getSm() {
        return sm;
    }

    public String getMd() {
        return md;
    }

    public String getLg() {
        return lg;
    }
}
