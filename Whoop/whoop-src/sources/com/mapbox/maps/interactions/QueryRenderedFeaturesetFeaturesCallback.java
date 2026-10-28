package com.mapbox.maps.interactions;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.interactions.FeaturesetFeature;
import java.util.List;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003J\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/mapbox/maps/interactions/QueryRenderedFeaturesetFeaturesCallback;", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "FF", "", "", "featuresetFeatures", "Ll83/a0;", "onQueryRenderedFeatures", "(Ljava/util/List;)V", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@MapboxExperimental
public interface QueryRenderedFeaturesetFeaturesCallback<FF extends FeaturesetFeature<?>> {
    void onQueryRenderedFeatures(List<? extends FF> featuresetFeatures);
}
