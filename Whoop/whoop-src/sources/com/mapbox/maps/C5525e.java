package com.mapbox.maps;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.interactions.FeatureStateCallback;
import com.mapbox.maps.interactions.FeaturesetFeature;

/* JADX INFO: renamed from: com.mapbox.maps.e */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C5525e implements Expected.Action, QueryFeatureStateCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FeatureStateCallback f22036a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FeaturesetFeature f22037b;

    public /* synthetic */ C5525e(FeaturesetFeature featuresetFeature, FeatureStateCallback featureStateCallback) {
        this.f22036a = featureStateCallback;
        this.f22037b = featuresetFeature;
    }

    @Override // com.mapbox.maps.QueryFeatureStateCallback
    public void run(Expected expected) {
        MapboxMap.getFeatureState$lambda$30$lambda$29(this.f22036a, this.f22037b, expected);
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        MapboxMap.getFeatureState$lambda$30$lambda$29$lambda$28(this.f22036a, this.f22037b, (Value) obj);
    }
}
