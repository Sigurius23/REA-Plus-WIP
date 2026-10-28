package com.mapbox.maps.loader;

import android.content.Context;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import com.mapbox.common.core.module.CommonSingletonModuleProvider;
import com.mapbox.maps.MapboxConstants;
import java.util.ArrayList;
import java.util.List;
import p644yb.InterfaceC39377b;

/* JADX INFO: loaded from: classes.dex */
public class MapboxMapsInitializerImpl implements InterfaceC39377b {
    @Override // p644yb.InterfaceC39377b
    public List<Class<? extends InterfaceC39377b>> dependencies() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MapboxSDKCommonInitializerImpl.class);
        return arrayList;
    }

    @Override // p644yb.InterfaceC39377b
    public MapboxMaps create(Context context) {
        CommonSingletonModuleProvider.INSTANCE.getLoaderInstance().load(MapboxConstants.MAP_SHARED_LIBRARY_NAME);
        return MapboxMaps.INSTANCE;
    }
}
