package eu;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p375op.C28073e;
import p591wp.C37491l;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: eu.n0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C13627n0 implements InterfaceC13637x {

    /* JADX INFO: renamed from: a */
    public final C37491l f48299a;

    /* JADX INFO: renamed from: b */
    public Function1 f48300b;

    public C13627n0(C37491l c37491l) {
        C13604c c13604c = C13604c.f48148P;
        this.f48299a = c37491l;
        this.f48300b = c13604c;
    }

    @Override // eu.InterfaceC13637x
    /* JADX INFO: renamed from: a */
    public final void mo38425a() {
    }

    @Override // eu.InterfaceC13637x
    /* JADX INFO: renamed from: b */
    public final void mo38426b() {
    }

    @Override // eu.InterfaceC13637x
    /* JADX INFO: renamed from: c */
    public final void mo38427c() {
        C37491l c37491l = this.f48299a;
        c37491l.getClass();
        try {
            C28073e c28073e = (C28073e) c37491l.f160356a;
            c28073e.m57323l0(c28073e.m57322k0(), 1);
        } catch (RemoteException e5) {
            throw new RuntimeRemoteException(e5);
        }
    }
}
