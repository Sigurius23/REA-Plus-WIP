package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class StyleObjectInfo implements Serializable {

    /* JADX INFO: renamed from: id */
    private final String f22015id;
    private final String type;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public StyleObjectInfo(String str, String str2) {
        this.f22015id = str;
        this.type = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StyleObjectInfo.class != obj.getClass()) {
            return false;
        }
        StyleObjectInfo styleObjectInfo = (StyleObjectInfo) obj;
        return Objects.equals(this.f22015id, styleObjectInfo.f22015id) && Objects.equals(this.type, styleObjectInfo.type);
    }

    public String getId() {
        return this.f22015id;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.f22015id, this.type);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[id: ");
        AbstractC3855a.m11838v(this.f22015id, ", type: ", sb4);
        return AbstractC3855a.m11826j(this.type, "]", sb4);
    }
}
