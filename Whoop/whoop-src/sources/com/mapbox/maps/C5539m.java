package com.mapbox.maps;

/* JADX INFO: renamed from: com.mapbox.maps.m */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C5539m implements MapLoadingErrorCallback {
    @Override // com.mapbox.maps.MapLoadingErrorCallback
    public final void run(MapLoadingError mapLoadingError) {
        NativeObserver.addOnMapLoadErrorListener$lambda$5(null, mapLoadingError);
    }
}
