package iw0;

import c93.InterfaceC4339a;
import p353o0.C27341y;
import xq2.AbstractC38554c1;

/* JADX INFO: renamed from: iw0.r */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C20986r implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f79291w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f79292x;

    public /* synthetic */ C20986r(int i13, int i14) {
        this.f79291w = i14;
        this.f79292x = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f79291w) {
            case 0:
                return Integer.valueOf(AbstractC20992x.m58439n0(this.f79292x));
            case 1:
                return new C27341y(this.f79292x, 0);
            default:
                return AbstractC38554c1.m123553G(this.f79292x);
        }
    }
}
