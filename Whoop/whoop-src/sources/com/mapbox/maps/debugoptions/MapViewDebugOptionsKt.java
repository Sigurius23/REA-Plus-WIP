package com.mapbox.maps.debugoptions;

import com.mapbox.maps.MapDebugOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"$\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"nativeDebugOptions", "", "Lcom/mapbox/maps/MapDebugOptions;", "Lcom/mapbox/maps/debugoptions/MapViewDebugOptions;", "getNativeDebugOptions", "(Ljava/util/Set;)Ljava/util/Set;", "maps-sdk_release"}, m65682k = 2, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapViewDebugOptionsKt {
    public static final Set<MapDebugOptions> getNativeDebugOptions(Set<MapViewDebugOptions> set) {
        MapDebugOptions mapDebugOptionsValueOf;
        AbstractC22676k.m65750j(set, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            try {
                mapDebugOptionsValueOf = MapDebugOptions.valueOf(((MapViewDebugOptions) it.next()).getName$maps_sdk_release());
            } catch (Exception unused) {
                mapDebugOptionsValueOf = null;
            }
            if (mapDebugOptionsValueOf != null) {
                arrayList.add(mapDebugOptionsValueOf);
            }
        }
        return AbstractC25265s.m74103I1(arrayList);
    }
}
