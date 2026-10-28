package p040c0;

import androidx.compose.animation.AbstractC1091c;
import bc3.AbstractC3006f0;
import m83.C25272z;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p077d0.InterfaceC11372l;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;
import p636y3.C39180l;

/* JADX INFO: renamed from: c0.q1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3772q1 extends AbstractC3754k1 {

    /* JADX INFO: renamed from: P */
    public InterfaceC11372l f15396P;

    /* JADX INFO: renamed from: Q */
    public long f15397Q;

    /* JADX INFO: renamed from: R */
    public long f15398R;

    /* JADX INFO: renamed from: S */
    public boolean f15399S;

    /* JADX INFO: renamed from: T */
    public final C28633k1 f15400T;

    public C3772q1(InterfaceC11372l interfaceC11372l) {
        super(0);
        this.f15396P = interfaceC11372l;
        this.f15397Q = AbstractC1091c.f4474a;
        this.f15398R = AbstractC39170b.m124770b(0, 0, 15);
        this.f15400T = AbstractC28683x.m87272z(null);
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: P0 */
    public final void mo285P0() {
        this.f15397Q = AbstractC1091c.f4474a;
        this.f15399S = false;
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: R0 */
    public final void mo7159R0() {
        this.f15400T.setValue(null);
    }

    @Override // p040c0.AbstractC3754k1, p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        AbstractC39104j1 abstractC39104j1Mo448T;
        char c3;
        C3763n1 c3763n1;
        long jM124772d;
        C3763n1 c3763n2;
        if (interfaceC39133t0.mo781A()) {
            this.f15398R = j7;
            this.f15399S = true;
            abstractC39104j1Mo448T = interfaceC39124q0.mo448T(j7);
        } else {
            abstractC39104j1Mo448T = interfaceC39124q0.mo448T(this.f15399S ? this.f15398R : j7);
        }
        AbstractC39104j1 abstractC39104j1 = abstractC39104j1Mo448T;
        long j13 = (((long) abstractC39104j1.f168212x) & 4294967295L) | (((long) abstractC39104j1.f168211w) << 32);
        if (interfaceC39133t0.mo781A()) {
            this.f15397Q = j13;
            c3 = ' ';
            jM124772d = j13;
            j13 = jM124772d;
        } else {
            long j14 = !C39180l.m124799a(this.f15397Q, AbstractC1091c.f4474a) ? this.f15397Q : j13;
            C28633k1 c28633k1 = this.f15400T;
            C3763n1 c3763n3 = (C3763n1) c28633k1.getValue();
            if (c3763n3 != null) {
                C11344e c11344e = c3763n3.f15371a;
                c3 = ' ';
                boolean z4 = (C39180l.m124799a(j14, ((C39180l) c11344e.m30549e()).f168422a) || c11344e.m30550f()) ? false : true;
                if (!C39180l.m124799a(j14, ((C39180l) c11344e.f36345e.getValue()).f168422a) || z4) {
                    c3763n3.f15372b = ((C39180l) c11344e.m30549e()).f168422a;
                    c3763n2 = c3763n3;
                    AbstractC3006f0.m8732z(m7158L0(), null, null, new C3766o1(c3763n2, j14, this, null), 3);
                } else {
                    c3763n2 = c3763n3;
                }
                c3763n1 = c3763n2;
            } else {
                c3 = ' ';
                long j15 = 1;
                c3763n1 = new C3763n1(new C11344e(new C39180l(j14), AbstractC11348f.f36374p, new C39180l((j15 << 32) | (j15 & 4294967295L)), 8), j14);
            }
            c28633k1.setValue(c3763n1);
            jM124772d = AbstractC39170b.m124772d(j7, ((C39180l) c3763n1.f15371a.m30549e()).f168422a);
        }
        int i13 = (int) (jM124772d >> c3);
        int i14 = (int) (jM124772d & 4294967295L);
        return interfaceC39133t0.mo86822W(i13, i14, C25272z.f99163w, new C3769p1(this, j13, i13, i14, interfaceC39133t0, abstractC39104j1));
    }
}
