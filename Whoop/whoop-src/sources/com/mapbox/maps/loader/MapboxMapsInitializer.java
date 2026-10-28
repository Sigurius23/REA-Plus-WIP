package com.mapbox.maps.loader;

import com.mapbox.common.BaseMapboxInitializer;
import p644yb.InterfaceC39377b;

/* JADX INFO: loaded from: classes.dex */
public class MapboxMapsInitializer extends BaseMapboxInitializer<MapboxMaps> {
    @Override // com.mapbox.common.BaseMapboxInitializer
    public Class<? extends InterfaceC39377b> getInitializerClass() {
        return MapboxMapsInitializerImpl.class;
    }
}
