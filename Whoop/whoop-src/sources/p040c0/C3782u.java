package p040c0;

import androidx.compose.animation.AbstractC1089a;
import m83.C25272z;
import p077d0.C11397r1;
import p077d0.C11400s1;
import p390p1.InterfaceC28601c1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.C39180l;

/* JADX INFO: renamed from: c0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C3782u extends AbstractC3754k1 {

    /* JADX INFO: renamed from: P */
    public C11400s1 f15423P;

    /* JADX INFO: renamed from: Q */
    public InterfaceC28601c1 f15424Q;

    /* JADX INFO: renamed from: R */
    public C3789x f15425R;

    /* JADX INFO: renamed from: S */
    public long f15426S;

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: R0 */
    public final void mo7159R0() {
        this.f15426S = AbstractC1089a.f4472a;
    }

    @Override // p040c0.AbstractC3754k1, p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        long j13;
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(j7);
        if (interfaceC39133t0.mo781A()) {
            j13 = (((long) abstractC39104j1Mo448T.f168211w) << 32) | (((long) abstractC39104j1Mo448T.f168212x) & 4294967295L);
        } else {
            C11400s1 c11400s1 = this.f15423P;
            if (c11400s1 == null) {
                j13 = (((long) abstractC39104j1Mo448T.f168211w) << 32) | (((long) abstractC39104j1Mo448T.f168212x) & 4294967295L);
                this.f15426S = j13;
            } else {
                long j14 = (((long) abstractC39104j1Mo448T.f168212x) & 4294967295L) | (((long) abstractC39104j1Mo448T.f168211w) << 32);
                C11397r1 c11397r1M30630a = c11400s1.m30630a(new C3779t(this, j14, 0), new C3779t(this, j14, 1));
                this.f15425R.f15452f = c11397r1M30630a;
                j13 = ((C39180l) c11397r1M30630a.getValue()).f168422a;
                this.f15426S = ((C39180l) c11397r1M30630a.getValue()).f168422a;
            }
        }
        return interfaceC39133t0.mo86822W((int) (j13 >> 32), (int) (4294967295L & j13), C25272z.f99163w, new C3776s(this, abstractC39104j1Mo448T, j13));
    }
}
