package com.mapbox.maps;

/* JADX INFO: renamed from: com.mapbox.maps.b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C5500b implements CameraChangedCoalescedCallback, StyleDataLoadedCallback {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ MapController f22027w;

    public /* synthetic */ C5500b(MapController mapController) {
        this.f22027w = mapController;
    }

    @Override // com.mapbox.maps.CameraChangedCoalescedCallback
    public void run(CameraChangedCoalesced cameraChangedCoalesced) {
        MapController._init_$lambda$0(this.f22027w, cameraChangedCoalesced);
    }

    @Override // com.mapbox.maps.StyleDataLoadedCallback
    public void run(StyleDataLoaded styleDataLoaded) {
        MapController._init_$lambda$2(this.f22027w, styleDataLoaded);
    }
}
