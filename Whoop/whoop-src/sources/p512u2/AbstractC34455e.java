package p512u2;

import java.util.Collection;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0232n2;
import p005a3.C0228m2;
import p005a3.C0241q;
import p005a3.InterfaceC0200f2;
import p005a3.InterfaceC0225m;
import p005a3.InterfaceC0240p2;
import p026b2.AbstractC2316v;
import p027b3.C2441t;
import p084d8.C11764a;
import p106e2.C12590e;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.C22669g0;

/* JADX INFO: renamed from: u2.e */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34455e extends AbstractC2316v implements InterfaceC0240p2, InterfaceC0200f2, InterfaceC0225m {

    /* JADX INFO: renamed from: O */
    public C0241q f144757O;

    /* JADX INFO: renamed from: P */
    public C34447a f144758P;

    /* JADX INFO: renamed from: Q */
    public boolean f144759Q;

    public AbstractC34455e(C34447a c34447a, C0241q c0241q) {
        this.f144757O = c0241q;
        this.f144758P = c34447a;
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: Q0 */
    public final void mo286Q0() {
        m108926b1();
    }

    @Override // p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: S */
    public final long mo500S() {
        C0241q c0241q = this.f144757O;
        if (c0241q == null) {
            return AbstractC0232n2.f801a;
        }
        InterfaceC39171c interfaceC39171c = AbstractC0201g.m516p(this).f776X;
        int i13 = AbstractC0232n2.f802b;
        return C0228m2.m568c(interfaceC39171c.mo724F(c0241q.f826a), interfaceC39171c.mo724F(c0241q.f827b), interfaceC39171c.mo724F(c0241q.f828c), interfaceC39171c.mo724F(c0241q.f829d));
    }

    /* JADX INFO: renamed from: X0 */
    public final void m108924X0() {
        C34447a c34447a;
        C22669g0 c22669g0 = new C22669g0();
        AbstractC0201g.m519s(this, new C11764a(c22669g0, 13));
        AbstractC34455e abstractC34455e = (AbstractC34455e) c22669g0.f89336w;
        if (abstractC34455e == null || (c34447a = abstractC34455e.f144758P) == null) {
            c34447a = this.f144758P;
        }
        mo108896Y0(c34447a);
    }

    /* JADX INFO: renamed from: Y0 */
    public abstract void mo108896Y0(InterfaceC34469o interfaceC34469o);

    /* JADX INFO: renamed from: Z0 */
    public final void m108925Z0() {
        C22659b0 c22659b0 = new C22659b0();
        c22659b0.f89329w = true;
        AbstractC0201g.m520t(this, new C12590e(c22659b0));
        if (c22659b0.f89329w) {
            m108924X0();
        }
    }

    /* JADX INFO: renamed from: a1 */
    public abstract boolean mo108897a1(int i13);

    @Override // p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: b0 */
    public final void mo465b0() {
        m108926b1();
    }

    /* JADX INFO: renamed from: b1 */
    public final void m108926b1() {
        if (this.f144759Q) {
            this.f144759Q = false;
            if (this.f9141N) {
                C22669g0 c22669g0 = new C22669g0();
                AbstractC0201g.m519s(this, new C2441t(c22669g0, 2));
                AbstractC34455e abstractC34455e = (AbstractC34455e) c22669g0.f89336w;
                if (abstractC34455e != null) {
                    abstractC34455e.m108924X0();
                } else {
                    mo108896Y0(null);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    @Override // p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: r0 */
    public final void mo473r0(C34465k c34465k, EnumC34466l enumC34466l, long j7) {
        if (enumC34466l == EnumC34466l.f144807x) {
            ?? r10 = c34465k.f144800a;
            int size = ((Collection) r10).size();
            for (int i13 = 0; i13 < size; i13++) {
                if (mo108897a1(((C34472r) r10.get(i13)).f144823i)) {
                    int i14 = c34465k.f144805f;
                    if (i14 == 4) {
                        this.f144759Q = true;
                        m108925Z0();
                        return;
                    } else {
                        if (i14 == 5) {
                            m108926b1();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }
}
