package al0;

import c93.InterfaceC4339a;
import ni0.C26732c;
import t52.C33545a;
import v53.C35709c;

/* JADX INFO: renamed from: al0.h */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C0973h implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3587w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C35709c f3588x;

    public /* synthetic */ C0973h(C35709c c35709c, int i13) {
        this.f3587w = i13;
        this.f3588x = c35709c;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f3587w) {
            case 0:
                return C0975j.m2481F2(this.f3588x);
            case 1:
                return C26732c.m79540R(this.f3588x);
            case 2:
                return C26732c.m79580p0(this.f3588x);
            case 3:
                return C26732c.m79596x0(this.f3588x);
            default:
                return C33545a.m105940o(this.f3588x);
        }
    }
}
