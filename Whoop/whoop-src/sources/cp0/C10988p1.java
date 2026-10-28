package cp0;

import c93.InterfaceC4351m;
import p181h2.C16617b;
import p512u2.C34472r;

/* JADX INFO: renamed from: cp0.p1 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C10988p1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f34273w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11011y0 f34274x;

    public /* synthetic */ C10988p1(C11011y0 c11011y0, int i13) {
        this.f34273w = i13;
        this.f34274x = c11011y0;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C34472r c34472r = (C34472r) obj;
        C16617b c16617b = (C16617b) obj2;
        switch (this.f34273w) {
            case 0:
                return AbstractC10979m1.b.m29282h(this.f34274x, c34472r, c16617b);
            default:
                return AbstractC10979m1.d.m29290h(this.f34274x, c34472r, c16617b);
        }
    }
}
