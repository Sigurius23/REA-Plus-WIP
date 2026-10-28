package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.EnumC1632v;
import p399pb.InterfaceC29046c;

/* JADX INFO: renamed from: androidx.fragment.app.n0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1324n0 implements InterfaceC29046c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5683a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5684b;

    public /* synthetic */ C1324n0(Object obj, int i13) {
        this.f5683a = i13;
        this.f5684b = obj;
    }

    @Override // p399pb.InterfaceC29046c
    /* JADX INFO: renamed from: a */
    public final Bundle mo4129a() {
        switch (this.f5683a) {
            case 0:
                AbstractActivityC1340r0 abstractActivityC1340r0 = (AbstractActivityC1340r0) this.f5684b;
                abstractActivityC1340r0.markFragmentsCreated();
                abstractActivityC1340r0.mFragmentLifecycleRegistry.m4991g(EnumC1632v.ON_STOP);
                return new Bundle();
            default:
                return ((AbstractC1329o1) this.f5684b).m4160b0();
        }
    }
}
