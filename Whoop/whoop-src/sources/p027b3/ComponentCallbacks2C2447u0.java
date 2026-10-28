package p027b3;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import p165g3.C15286a;
import p165g3.C15288c;

/* JADX INFO: renamed from: b3.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C2447u0 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Configuration f9552w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15288c f9553x;

    public ComponentCallbacks2C2447u0(Configuration configuration, C15288c c15288c) {
        this.f9552w = configuration;
        this.f9553x = c15288c;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f9552w;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f9553x.f57433a.entrySet().iterator();
        while (it.hasNext()) {
            C15286a c15286a = (C15286a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (c15286a == null || Configuration.needNewResources(iUpdateFrom, c15286a.f57430b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f9553x.f57433a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i13) {
        this.f9553x.f57433a.clear();
    }
}
