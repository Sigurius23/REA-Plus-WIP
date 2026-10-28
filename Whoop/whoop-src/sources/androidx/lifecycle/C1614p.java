package androidx.lifecycle;

import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import dc3.C11935t;
import dc3.InterfaceC11936u;
import or2.AbstractC28163g0;

/* JADX INFO: renamed from: androidx.lifecycle.p */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1614p implements InterfaceC1633v0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f6294w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f6295x;

    public /* synthetic */ C1614p(Object obj, int i13) {
        this.f6294w = i13;
        this.f6295x = obj;
    }

    @Override // androidx.lifecycle.InterfaceC1633v0
    public final void onChanged(Object obj) {
        switch (this.f6294w) {
            case 0:
                ((C11935t) ((InterfaceC11936u) this.f6295x)).mo32218s(obj);
                break;
            default:
                AbstractC28163g0.m85258n((AbstractComponentCallbacksC1320m0) this.f6295x, (InterfaceC1585g0) obj);
                break;
        }
    }
}
