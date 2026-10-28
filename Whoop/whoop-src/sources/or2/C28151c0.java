package or2;

import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1633v0;
import dc3.InterfaceC11936u;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: or2.c0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28151c0 implements InterfaceC1633v0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f113826w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f113827x;

    public /* synthetic */ C28151c0(Object obj, int i13) {
        this.f113826w = i13;
        this.f113827x = obj;
    }

    @Override // androidx.lifecycle.InterfaceC1633v0
    public final void onChanged(Object obj) {
        switch (this.f113826w) {
            case 0:
                AbstractC28154d0.a.m85195h((InterfaceC11936u) this.f113827x, obj);
                break;
            default:
                AbstractC28163g0.a.m85263b((InterfaceC34116n) this.f113827x, (InterfaceC1585g0) obj);
                break;
        }
    }
}
