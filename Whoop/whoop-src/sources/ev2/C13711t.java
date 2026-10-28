package ev2;

import bc3.InterfaceC2994c0;
import bm.C3396t;
import p715kotlin.jvm.functions.Function1;
import qu2.AbstractC30640h;

/* JADX INFO: renamed from: ev2.t */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C13711t implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48612w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC2994c0 f48613x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C3396t f48614y;

    public /* synthetic */ C13711t(InterfaceC2994c0 interfaceC2994c0, C3396t c3396t, int i13) {
        this.f48612w = i13;
        this.f48613x = interfaceC2994c0;
        this.f48614y = c3396t;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f48612w;
        int iIntValue = ((Integer) obj).intValue();
        switch (i13) {
            case 0:
                return AbstractC13712u.m38808m0(this.f48613x, this.f48614y, iIntValue);
            default:
                return AbstractC30640h.m94118d0(this.f48613x, this.f48614y, iIntValue);
        }
    }
}
