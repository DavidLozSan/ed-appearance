package com.iesam.superheroe.feature.feed.data.remote.idApi;

import com.google.gson.annotations.SerializedName;
import com.iesam.superheroe.feature.feed.data.remote.imagesApi.Images;
import com.iesam.superheroe.feature.feed.data.remote.workApi.Work;
import com.iesam.superheroe.feature.feed.data.remote.appearanceApi.Appearance;
import com.iesam.superheroe.feature.feed.data.remote.biographyApi.Biography;
import com.iesam.superheroe.feature.feed.data.remote.connectionsApi.Connections;
import com.iesam.superheroe.feature.feed.data.remote.powerstatsApi.Powerstats;

public class Id {
    @SerializedName("id")
    public final Integer id;
    @SerializedName("name")
    public final String name;
    public final String slug;
    public final Powerstats powerstats;
    public final Appearance appearance;
    public final Biography biography;
    public final Work work;
    public final Connections connections;
    public final Images images;

    public Id(Integer id, String name, String slug, Powerstats powerstats, Appearance appearance, Biography biography, Work work, Connections connections, Images images) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.powerstats = powerstats;
        this.appearance = appearance;
        this.biography = biography;
        this.work = work;
        this.connections = connections;
        this.images = images;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }

    public Powerstats getPowerstats() {
        return powerstats;
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public Biography getBiography() {
        return biography;
    }

    public Work getWork() {
        return work;
    }

    public Connections getConnections() {
        return connections;
    }

    public Images getImages() {
        return images;
    }
}
