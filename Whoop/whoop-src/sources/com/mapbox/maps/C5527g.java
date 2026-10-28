package com.mapbox.maps;

import com.mapbox.bindgen.Expected;
import com.mapbox.maps.interactions.QueryRenderedFeaturesetFeaturesCallback;
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor;
import java.util.List;

/* JADX INFO: renamed from: com.mapbox.maps.g */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C5527g implements QueryRenderedFeaturesCallback, Expected.Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ QueryRenderedFeaturesetFeaturesCallback f22039a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TypedFeaturesetDescriptor f22040b;

    public /* synthetic */ C5527g(TypedFeaturesetDescriptor typedFeaturesetDescriptor, QueryRenderedFeaturesetFeaturesCallback queryRenderedFeaturesetFeaturesCallback) {
        this.f22039a = queryRenderedFeaturesetFeaturesCallback;
        this.f22040b = typedFeaturesetDescriptor;
    }

    @Override // com.mapbox.maps.QueryRenderedFeaturesCallback
    public void run(Expected expected) {
        MapboxMap.queryRenderedFeatures$lambda$44(this.f22039a, this.f22040b, expected);
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        MapboxMap.queryRenderedFeatures$lambda$44$lambda$43(this.f22039a, this.f22040b, (List) obj);
    }
}
