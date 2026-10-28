package p389p0;

import java.util.Comparator;
import p012ab.C0682h0;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: p0.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C28558x implements Comparator {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f115541w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0682h0 f115542x;

    public /* synthetic */ C28558x(C0682h0 c0682h0, int i13) {
        this.f115541w = i13;
        this.f115542x = c0682h0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f115541w) {
            case 0:
                Object key = ((InterfaceC28518e0) obj).getKey();
                C0682h0 c0682h0 = this.f115542x;
                return AbstractC30060g.m92127q(Integer.valueOf(c0682h0.m1699n(key)), Integer.valueOf(c0682h0.m1699n(((InterfaceC28518e0) obj2).getKey())));
            case 1:
                Object key2 = ((InterfaceC28518e0) obj).getKey();
                C0682h0 c0682h1 = this.f115542x;
                return AbstractC30060g.m92127q(Integer.valueOf(c0682h1.m1699n(key2)), Integer.valueOf(c0682h1.m1699n(((InterfaceC28518e0) obj2).getKey())));
            case 2:
                Object key3 = ((InterfaceC28518e0) obj2).getKey();
                C0682h0 c0682h2 = this.f115542x;
                return AbstractC30060g.m92127q(Integer.valueOf(c0682h2.m1699n(key3)), Integer.valueOf(c0682h2.m1699n(((InterfaceC28518e0) obj).getKey())));
            default:
                Object key4 = ((InterfaceC28518e0) obj2).getKey();
                C0682h0 c0682h3 = this.f115542x;
                return AbstractC30060g.m92127q(Integer.valueOf(c0682h3.m1699n(key4)), Integer.valueOf(c0682h3.m1699n(((InterfaceC28518e0) obj).getKey())));
        }
    }
}
