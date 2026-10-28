package com.mapbox.maps;

import com.mapbox.common.Cancelable;
import j93.InterfaceC21493z;
import p157fv.C14802h;

/* JADX INFO: renamed from: com.mapbox.maps.f */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C5526f implements Cancelable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22038a;

    public /* synthetic */ C5526f(int i13) {
        this.f22038a = i13;
    }

    @Override // com.mapbox.common.Cancelable
    public final void cancel() {
        switch (this.f22038a) {
            case 0:
                MapboxMap.getFeatureState$lambda$31();
                break;
            case 1:
                MapboxMap.setFeatureState$lambda$25();
                break;
            case 2:
                MapboxMap.removeFeatureState$lambda$37();
                break;
            default:
                InterfaceC21493z[] interfaceC21493zArr = C14802h.f54931W;
                break;
        }
    }
}
