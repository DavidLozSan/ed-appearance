package com.iesam.superheroe.feature.feed.data.remote.allApi;

import com.iesam.superheroe.feature.feed.data.remote.idApi.Id;

import java.util.List;

public class All {
    public final List<Id> ids;

    public All(List<Id> ids) {
        this.ids = ids;
    }

    public List<Id> getIds() {
        return ids;
    }
}
