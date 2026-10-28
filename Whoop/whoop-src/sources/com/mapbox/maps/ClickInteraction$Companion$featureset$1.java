package com.mapbox.maps;

import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.interactions.FeatureState;
import com.mapbox.maps.interactions.FeaturesetFeature;
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\f\b\u0000\u0010\u0003*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0002\b\n"}, m65681d2 = {"<anonymous>", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/FeatureState;", "T", "feature", "Lcom/mapbox/geojson/Feature;", "featuresetFeatureId", "Lcom/mapbox/maps/FeaturesetFeatureId;", "state", "Lcom/mapbox/bindgen/Value;", "invoke"}, m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class ClickInteraction$Companion$featureset$1 extends AbstractC22680m implements Function3 {
    final /* synthetic */ String $id;
    final /* synthetic */ String $importId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickInteraction$Companion$featureset$1(String str, String str2) {
        super(3);
        this.$id = str;
        this.$importId = str2;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final FeaturesetFeature<FeatureState> invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value state) {
        AbstractC22676k.m65750j(feature, "feature");
        AbstractC22676k.m65750j(state, "state");
        return new FeaturesetFeature<>(featuresetFeatureId, new TypedFeaturesetDescriptor.Featureset(this.$id, this.$importId), new FeatureState(state), feature);
    }
}
