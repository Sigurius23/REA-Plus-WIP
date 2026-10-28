package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class FeaturesetQueryTarget implements Serializable {
    private final FeaturesetDescriptor featureset;
    private final Value filter;

    /* JADX INFO: renamed from: id */
    private final Long f21947id;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public FeaturesetQueryTarget(FeaturesetDescriptor featuresetDescriptor, Value value, Long l7) {
        this.featureset = featuresetDescriptor;
        this.filter = value;
        this.f21947id = l7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FeaturesetQueryTarget.class != obj.getClass()) {
            return false;
        }
        FeaturesetQueryTarget featuresetQueryTarget = (FeaturesetQueryTarget) obj;
        return Objects.equals(this.featureset, featuresetQueryTarget.featureset) && Objects.equals(this.filter, featuresetQueryTarget.filter) && Objects.equals(this.f21947id, featuresetQueryTarget.f21947id);
    }

    public FeaturesetDescriptor getFeatureset() {
        return this.featureset;
    }

    public Value getFilter() {
        return this.filter;
    }

    public Long getId() {
        return this.f21947id;
    }

    public int hashCode() {
        return Objects.hash(this.featureset, this.filter, this.f21947id);
    }

    public String toString() {
        return "[featureset: " + RecordUtils.fieldToString(this.featureset) + ", filter: " + RecordUtils.fieldToString(this.filter) + ", id: " + RecordUtils.fieldToString(this.f21947id) + "]";
    }
}
