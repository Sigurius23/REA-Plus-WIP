package p208i2;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: renamed from: i2.e */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C17879e implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C17882f f69564w;

    public ComponentCallbacks2C17879e(C17882f c17882f) {
        this.f69564w = c17882f;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i13) {
        if (i13 >= 40) {
            this.f69564w.getClass();
        }
    }
}
