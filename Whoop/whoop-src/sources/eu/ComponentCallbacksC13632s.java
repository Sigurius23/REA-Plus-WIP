package eu;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p530up.C35147c;
import p558vp.C36262f;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29938w0;

/* JADX INFO: renamed from: eu.s */
/* JADX INFO: loaded from: classes6.dex */
public final class ComponentCallbacksC13632s implements ComponentCallbacks {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C35147c f48317w;

    public ComponentCallbacksC13632s(C35147c c35147c) {
        this.f48317w = c35147c;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration config) {
        AbstractC22676k.m65750j(config, "config");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        C29938w0 c29938w0 = (C29938w0) this.f48317w.f149132w.f48454a;
        if (c29938w0 != null) {
            try {
                C36262f c36262f = (C36262f) c29938w0.f122261y;
                c36262f.m57323l0(c36262f.m57322k0(), 6);
            } catch (RemoteException e5) {
                throw new RuntimeRemoteException(e5);
            }
        }
    }
}
