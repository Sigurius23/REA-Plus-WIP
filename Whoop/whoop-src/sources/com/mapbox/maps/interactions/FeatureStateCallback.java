package com.mapbox.maps.interactions;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.interactions.FeatureState;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/mapbox/maps/interactions/FeatureStateCallback;", "Lcom/mapbox/maps/interactions/FeatureState;", "FS", "", "state", "Ll83/a0;", "onFeatureState", "(Lcom/mapbox/maps/interactions/FeatureState;)V", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@MapboxExperimental
public interface FeatureStateCallback<FS extends FeatureState> {
    void onFeatureState(FS state);
}
