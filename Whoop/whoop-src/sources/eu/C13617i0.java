package eu;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p375op.C28069a;
import p390p1.C28647o;
import p591wp.C37487h;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: eu.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C13617i0 implements InterfaceC13637x {

    /* JADX INFO: renamed from: a */
    public final C28647o f48224a;

    /* JADX INFO: renamed from: b */
    public final C37487h f48225b;

    /* JADX INFO: renamed from: c */
    public final C13619j0 f48226c;

    /* JADX INFO: renamed from: d */
    public Function1 f48227d;

    /* JADX INFO: renamed from: e */
    public Function1 f48228e;

    /* JADX INFO: renamed from: f */
    public Function1 f48229f;

    /* JADX INFO: renamed from: g */
    public Function1 f48230g;

    /* JADX INFO: renamed from: h */
    public Function3 f48231h;

    /* JADX INFO: renamed from: i */
    public Function3 f48232i;

    public C13617i0(C28647o c28647o, C37487h c37487h, C13619j0 markerState, Function1 onMarkerClick, Function1 onInfoWindowClick, Function1 onInfoWindowClose, Function1 onInfoWindowLongClick) {
        AbstractC22676k.m65750j(markerState, "markerState");
        AbstractC22676k.m65750j(onMarkerClick, "onMarkerClick");
        AbstractC22676k.m65750j(onInfoWindowClick, "onInfoWindowClick");
        AbstractC22676k.m65750j(onInfoWindowClose, "onInfoWindowClose");
        AbstractC22676k.m65750j(onInfoWindowLongClick, "onInfoWindowLongClick");
        this.f48224a = c28647o;
        this.f48225b = c37487h;
        this.f48226c = markerState;
        this.f48227d = onMarkerClick;
        this.f48228e = onInfoWindowClick;
        this.f48229f = onInfoWindowClose;
        this.f48230g = onInfoWindowLongClick;
        this.f48231h = null;
        this.f48232i = null;
    }

    @Override // eu.InterfaceC13637x
    /* JADX INFO: renamed from: a */
    public final void mo38425a() {
        this.f48226c.m38433a(this.f48225b);
    }

    @Override // eu.InterfaceC13637x
    /* JADX INFO: renamed from: b */
    public final void mo38426b() {
        this.f48226c.m38433a(null);
        try {
            C28069a c28069a = (C28069a) this.f48225b.f160331a;
            c28069a.m57323l0(c28069a.m57322k0(), 1);
        } catch (RemoteException e5) {
            throw new RuntimeRemoteException(e5);
        }
    }

    @Override // eu.InterfaceC13637x
    /* JADX INFO: renamed from: c */
    public final void mo38427c() {
        this.f48226c.m38433a(null);
        try {
            C28069a c28069a = (C28069a) this.f48225b.f160331a;
            c28069a.m57323l0(c28069a.m57322k0(), 1);
        } catch (RemoteException e5) {
            throw new RuntimeRemoteException(e5);
        }
    }
}
