package com.mapbox.common.geofencing;

import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkotlin/Function1;", "Lcom/mapbox/common/geofencing/GeofenceState$Builder;", "Ll83/a0;", "initializer", "Lcom/mapbox/common/geofencing/GeofenceState;", "geofenceState", "(Lkotlin/jvm/functions/Function1;)Lcom/mapbox/common/geofencing/GeofenceState;", "common_release"}, m65682k = 2, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class GeofenceStateKt {
    public static final /* synthetic */ GeofenceState geofenceState(Function1 initializer) {
        AbstractC22676k.m65750j(initializer, "initializer");
        GeofenceState.Builder builder = new GeofenceState.Builder();
        initializer.invoke(builder);
        return builder.build();
    }
}
