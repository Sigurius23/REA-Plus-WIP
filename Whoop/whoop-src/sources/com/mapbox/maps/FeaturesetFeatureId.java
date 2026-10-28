package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class FeaturesetFeatureId implements Serializable {
    private final String featureId;
    private final String featureNamespace;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public FeaturesetFeatureId(String str, String str2) {
        this.featureId = str;
        this.featureNamespace = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FeaturesetFeatureId.class != obj.getClass()) {
            return false;
        }
        FeaturesetFeatureId featuresetFeatureId = (FeaturesetFeatureId) obj;
        return Objects.equals(this.featureId, featuresetFeatureId.featureId) && Objects.equals(this.featureNamespace, featuresetFeatureId.featureNamespace);
    }

    public String getFeatureId() {
        return this.featureId;
    }

    public String getFeatureNamespace() {
        return this.featureNamespace;
    }

    public int hashCode() {
        return Objects.hash(this.featureId, this.featureNamespace);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[featureId: ");
        AbstractC3855a.m11838v(this.featureId, ", featureNamespace: ", sb4);
        return AbstractC3855a.m11826j(this.featureNamespace, "]", sb4);
    }
}
