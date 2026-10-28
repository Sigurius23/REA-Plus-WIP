package p078d1;

import c93.InterfaceC4339a;
import l83.C23454a0;
import p005a3.AbstractC0201g;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p164g2.C15247s;
import p510u0.C34354s0;

/* JADX INFO: renamed from: d1.c */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C11450c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f36730w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11452e f36731x;

    public /* synthetic */ C11450c(C11452e c11452e, int i13) {
        this.f36730w = i13;
        this.f36731x = c11452e;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        InterfaceC2464x2 interfaceC2464x2;
        switch (this.f36730w) {
            case 0:
                AbstractC0201g.m513m(this.f36731x);
                return C23454a0.f92919a;
            case 1:
                this.f36731x.f36741X.m39778h(true);
                return Boolean.TRUE;
            case 2:
                this.f36731x.f36741X.m39775d(true);
                return Boolean.TRUE;
            case 3:
                this.f36731x.f36741X.m39776f();
                return Boolean.TRUE;
            case 4:
                AbstractC0201g.m513m(this.f36731x);
                return C23454a0.f92919a;
            case 5:
                this.f36731x.f36741X.m39785o();
                return Boolean.TRUE;
            case 6:
                C11452e c11452e = this.f36731x;
                c11452e.f36736S.f144329w.f144372x.f144324r.m108647c(c11452e.f36742Y.f122103e);
                return Boolean.TRUE;
            default:
                C11452e c11452e2 = this.f36731x;
                C34354s0 c34354s0 = c11452e2.f36736S;
                C15247s c15247s = c11452e2.f36743Z;
                boolean z4 = c11452e2.f36737T;
                if (!c34354s0.m108660b()) {
                    C15247s.m43350c(c15247s);
                } else if (!z4 && (interfaceC2464x2 = c34354s0.f144309c) != null) {
                    ((C2463x1) interfaceC2464x2).m7443b();
                }
                return Boolean.TRUE;
        }
    }
}
