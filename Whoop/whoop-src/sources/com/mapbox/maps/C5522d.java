package com.mapbox.maps;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.interactions.FeatureStateCallback;
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor;

/* JADX INFO: renamed from: com.mapbox.maps.d */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C5522d implements Expected.Action, QueryFeatureStateCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FeatureStateCallback f22034a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TypedFeaturesetDescriptor f22035b;

    public /* synthetic */ C5522d(FeatureStateCallback featureStateCallback, TypedFeaturesetDescriptor typedFeaturesetDescriptor) {
        this.f22034a = featureStateCallback;
        this.f22035b = typedFeaturesetDescriptor;
    }

    @Override // com.mapbox.maps.QueryFeatureStateCallback
    public void run(Expected expected) {
        MapboxMap.getFeatureState$lambda$34(this.f22034a, this.f22035b, expected);
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        MapboxMap.getFeatureState$lambda$34$lambda$33(this.f22034a, this.f22035b, (Value) obj);
    }
}
