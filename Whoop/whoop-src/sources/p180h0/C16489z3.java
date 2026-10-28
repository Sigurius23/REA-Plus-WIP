package p180h0;

import dc3.C11923h;
import e10.C12554k0;
import eg.C13161j;
import go1.C16016a;
import java.util.Collection;
import p003a1.C0107f;
import p005a3.AbstractC0233o;
import p005a3.InterfaceC0200f2;
import p005a3.InterfaceC0225m;
import p133f1.C13952k0;
import p512u2.AbstractC34452c0;
import p512u2.C34462h0;
import p512u2.C34465k;
import p512u2.C34472r;
import p512u2.EnumC34466l;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: h0.z3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16489z3 extends AbstractC0233o implements InterfaceC0200f2, InterfaceC0225m {

    /* JADX INFO: renamed from: Q */
    public InterfaceC16361a4 f63373Q;

    /* JADX INFO: renamed from: R */
    public C16016a f63374R;

    /* JADX INFO: renamed from: S */
    public boolean f63375S = true;

    /* JADX INFO: renamed from: T */
    public final C13161j f63376T = new C13161j(this, 27);

    /* JADX INFO: renamed from: U */
    public final C11923h f63377U = AbstractC30060g.m92111d(Integer.MAX_VALUE, 6, null);

    /* JADX INFO: renamed from: V */
    public C12554k0 f63378V;

    /* JADX INFO: renamed from: W */
    public final C34462h0 f63379W;

    /* JADX INFO: renamed from: X */
    public InterfaceC0200f2 f63380X;

    public C16489z3(InterfaceC16361a4 interfaceC16361a4, C16016a c16016a) {
        this.f63373Q = interfaceC16361a4;
        this.f63374R = c16016a;
        C34462h0 c34462h0M108902a = AbstractC34452c0.m108902a(new C0107f(this, 5));
        m665X0(c34462h0M108902a);
        this.f63379W = c34462h0M108902a;
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: P0 */
    public final void mo285P0() {
        this.f63378V = AbstractC16444q3.m46632n(this);
    }

    @Override // p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: b0 */
    public final void mo465b0() {
        this.f63379W.mo465b0();
        InterfaceC0200f2 interfaceC0200f2 = this.f63380X;
        if (interfaceC0200f2 != null) {
            interfaceC0200f2.mo465b0();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: r0 */
    public final void mo473r0(C34465k c34465k, EnumC34466l enumC34466l, long j7) {
        C12554k0 c12554k0 = this.f63378V;
        if (this.f63375S) {
            ?? r10 = c34465k.f144800a;
            int size = ((Collection) r10).size();
            for (int i13 = 0; i13 < size; i13++) {
                if (((C34472r) r10.get(i13)).f144823i == 2) {
                    if (c12554k0 == null || this.f63380X != null) {
                        break;
                        break;
                    }
                    C34462h0 c34462h0M108902a = AbstractC34452c0.m108902a(new C13952k0(2, this, c12554k0));
                    m665X0(c34462h0M108902a);
                    this.f63380X = c34462h0M108902a;
                    break;
                }
            }
        }
        this.f63379W.mo473r0(c34465k, enumC34466l, j7);
        InterfaceC0200f2 interfaceC0200f2 = this.f63380X;
        if (interfaceC0200f2 != null) {
            interfaceC0200f2.mo473r0(c34465k, enumC34466l, j7);
        }
    }
}
