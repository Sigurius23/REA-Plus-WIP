package p439qv;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxLifecycleObserver;
import com.mapbox.maps.MapboxLogger;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qv.b */
/* JADX INFO: loaded from: classes6.dex */
public final class ComponentCallbacks2C30645b implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ MapboxLifecycleObserver f126060w;

    public ComponentCallbacks2C30645b(MapView mapView) {
        this.f126060w = mapView;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        AbstractC22676k.m65750j(newConfig, "newConfig");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f126060w.onLowMemory();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i13) {
        if (i13 == 10 || i13 == 15) {
            MapboxLogger.logW("MapboxLifecyclePlugin", "onTrimMemory with level " + i13 + " is received, reduceMemoryUse will be called.");
            this.f126060w.onLowMemory();
        }
    }
}
