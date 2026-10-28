package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class QueriedFeature implements Serializable {
    private final Feature feature;
    private final FeaturesetFeatureId featuresetFeatureId;
    private final String source;
    private final String sourceLayer;
    private final Value state;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public QueriedFeature(Feature feature, String str, String str2, Value value, FeaturesetFeatureId featuresetFeatureId) {
        this.feature = feature;
        this.source = str;
        this.sourceLayer = str2;
        this.state = value;
        this.featuresetFeatureId = featuresetFeatureId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || QueriedFeature.class != obj.getClass()) {
            return false;
        }
        QueriedFeature queriedFeature = (QueriedFeature) obj;
        return Objects.equals(this.feature, queriedFeature.feature) && Objects.equals(this.source, queriedFeature.source) && Objects.equals(this.sourceLayer, queriedFeature.sourceLayer) && Objects.equals(this.state, queriedFeature.state) && Objects.equals(this.featuresetFeatureId, queriedFeature.featuresetFeatureId);
    }

    public Feature getFeature() {
        return this.feature;
    }

    public FeaturesetFeatureId getFeaturesetFeatureId() {
        return this.featuresetFeatureId;
    }

    public String getSource() {
        return this.source;
    }

    public String getSourceLayer() {
        return this.sourceLayer;
    }

    public Value getState() {
        return this.state;
    }

    public int hashCode() {
        return Objects.hash(this.feature, this.source, this.sourceLayer, this.state, this.featuresetFeatureId);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[feature: ");
        sb4.append(RecordUtils.fieldToString(this.feature));
        sb4.append(", source: ");
        AbstractC3855a.m11838v(this.source, ", sourceLayer: ", sb4);
        AbstractC3855a.m11838v(this.sourceLayer, ", state: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.state));
        sb4.append(", featuresetFeatureId: ");
        sb4.append(RecordUtils.fieldToString(this.featuresetFeatureId));
        sb4.append("]");
        return sb4.toString();
    }
}
