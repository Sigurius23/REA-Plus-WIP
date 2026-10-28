package com.mapbox.maps;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.mapbox.maps.o */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C5545o implements StyleDataLoadedCallback, StyleLoadedCallback, StyleImageMissingCallback {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ WeakReference f22055w;

    public /* synthetic */ C5545o(WeakReference weakReference) {
        this.f22055w = weakReference;
    }

    @Override // com.mapbox.maps.StyleDataLoadedCallback
    public void run(StyleDataLoaded styleDataLoaded) {
        Snapshotter._init_$lambda$5(this.f22055w, styleDataLoaded);
    }

    @Override // com.mapbox.maps.StyleImageMissingCallback
    public void run(StyleImageMissing styleImageMissing) {
        Snapshotter._init_$lambda$11(this.f22055w, styleImageMissing);
    }

    @Override // com.mapbox.maps.StyleLoadedCallback
    public void run(StyleLoaded styleLoaded) {
        Snapshotter._init_$lambda$9(this.f22055w, styleLoaded);
    }
}
