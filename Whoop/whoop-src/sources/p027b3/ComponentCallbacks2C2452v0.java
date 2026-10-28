package p027b3;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import p165g3.C15289d;

/* JADX INFO: renamed from: b3.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C2452v0 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C15289d f9561w;

    public ComponentCallbacks2C2452v0(C15289d c15289d) {
        this.f9561w = c15289d;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C15289d c15289d = this.f9561w;
        synchronized (c15289d) {
            c15289d.f57434a.m46c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        C15289d c15289d = this.f9561w;
        synchronized (c15289d) {
            c15289d.f57434a.m46c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i13) {
        C15289d c15289d = this.f9561w;
        synchronized (c15289d) {
            c15289d.f57434a.m46c();
        }
    }
}
