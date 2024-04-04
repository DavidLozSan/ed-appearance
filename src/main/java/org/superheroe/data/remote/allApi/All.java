package org.superheroe.data.remote.allApi;

import org.superheroe.data.remote.idApi.Id;

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
