package p635y2;

import m83.C25272z;
import p005a3.InterfaceC0186c0;
import p005a3.InterfaceC0240p2;
import p026b2.AbstractC2316v;
import p027b3.C2442t0;
import p040c0.C3741g0;

/* JADX INFO: renamed from: y2.o1 */
/* JADX INFO: loaded from: classes.dex */
public final class C39119o1 extends AbstractC2316v implements InterfaceC0186c0, InterfaceC0240p2 {

    /* JADX INFO: renamed from: O */
    public RunnableC39123q f168249O;

    /* JADX INFO: renamed from: P */
    public final C2442t0 f168250P;

    public C39119o1(RunnableC39123q runnableC39123q) {
        this.f168249O = runnableC39123q;
        this.f168250P = new C2442t0(13, this, runnableC39123q);
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(j7);
        return interfaceC39133t0.mo795x0(abstractC39104j1Mo448T.f168211w, abstractC39104j1Mo448T.f168212x, C25272z.f99163w, this.f168250P, new C3741g0(abstractC39104j1Mo448T, 3));
    }

    @Override // p005a3.InterfaceC0240p2
    /* JADX INFO: renamed from: f */
    public final Object mo276f() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }
}
