package p041c1;

import androidx.compose.foundation.text.handwriting.AbstractC1114a;
import c93.InterfaceC4339a;
import p003a1.C0107f;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0232n2;
import p005a3.AbstractC0233o;
import p005a3.C0228m2;
import p005a3.C0241q;
import p005a3.InterfaceC0200f2;
import p164g2.EnumC15251w;
import p164g2.InterfaceC15233e;
import p164g2.InterfaceC15248t;
import p512u2.AbstractC34452c0;
import p512u2.C34462h0;
import p512u2.C34465k;
import p512u2.EnumC34466l;
import p636y3.InterfaceC39171c;

/* JADX INFO: renamed from: c1.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C3816a extends AbstractC0233o implements InterfaceC0200f2, InterfaceC15233e, InterfaceC15248t {

    /* JADX INFO: renamed from: Q */
    public InterfaceC4339a f15653Q;

    /* JADX INFO: renamed from: R */
    public boolean f15654R;

    /* JADX INFO: renamed from: S */
    public final C34462h0 f15655S;

    public C3816a(InterfaceC4339a interfaceC4339a) {
        this.f15653Q = interfaceC4339a;
        C34462h0 c34462h0M108902a = AbstractC34452c0.m108902a(new C0107f(this, 1));
        m665X0(c34462h0M108902a);
        this.f15655S = c34462h0M108902a;
    }

    @Override // p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: S */
    public final long mo500S() {
        C0241q c0241q = AbstractC1114a.f4667a;
        InterfaceC39171c interfaceC39171c = AbstractC0201g.m516p(this).f776X;
        c0241q.getClass();
        int i13 = AbstractC0232n2.f802b;
        return C0228m2.m568c(interfaceC39171c.mo724F(c0241q.f826a), interfaceC39171c.mo724F(c0241q.f827b), interfaceC39171c.mo724F(c0241q.f828c), interfaceC39171c.mo724F(c0241q.f829d));
    }

    @Override // p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: b0 */
    public final void mo465b0() {
        this.f15655S.mo465b0();
    }

    @Override // p164g2.InterfaceC15233e
    /* JADX INFO: renamed from: k */
    public final void mo470k(EnumC15251w enumC15251w) {
        this.f15654R = enumC15251w.m43354b();
    }

    @Override // p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: r0 */
    public final void mo473r0(C34465k c34465k, EnumC34466l enumC34466l, long j7) {
        this.f15655S.mo473r0(c34465k, enumC34466l, j7);
    }
}
