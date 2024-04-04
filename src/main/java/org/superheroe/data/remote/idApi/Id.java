package org.superheroe.data.remote.idApi;

import org.superheroe.data.remote.appearanceApi.Appearance;
import org.superheroe.data.remote.biographyApi.Biography;
import org.superheroe.data.remote.connectionsApi.Connections;
import org.superheroe.data.remote.imagesApi.Images;
import org.superheroe.data.remote.powerstatsApi.Powerstats;
import org.superheroe.data.remote.workApi.Work;

public class Id {
    public final Integer id;
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
