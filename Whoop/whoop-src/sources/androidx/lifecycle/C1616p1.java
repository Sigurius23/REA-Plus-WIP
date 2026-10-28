package androidx.lifecycle;

import c93.InterfaceC4339a;
import ld1.AbstractC23865d;

/* JADX INFO: renamed from: androidx.lifecycle.p1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1616p1 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f6296w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC1583f2 f6297x;

    public /* synthetic */ C1616p1(InterfaceC1583f2 interfaceC1583f2, int i13) {
        this.f6296w = i13;
        this.f6297x = interfaceC1583f2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f6296w) {
            case 0:
                return AbstractC1613o1.m5021k(this.f6297x);
            default:
                return AbstractC23865d.m70118c(this.f6297x);
        }
    }
}
