package p132f0;

import android.view.KeyEvent;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import java.util.Collection;
import p003a1.C0109h;
import p005a3.AbstractC0201g;
import p027b3.AbstractC2453v1;
import p027b3.InterfaceC2395j3;
import p180h0.AbstractC16434o3;
import p238j0.C21086l;
import p238j0.InterfaceC21083i;
import p512u2.AbstractC34454d0;
import p512u2.C34462h0;
import p512u2.C34465k;
import p512u2.C34472r;
import p512u2.EnumC34466l;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: f0.w */
/* JADX INFO: loaded from: classes.dex */
public class C13833w extends AbstractC13789h {

    /* JADX INFO: renamed from: k0 */
    public C34472r f49357k0;

    @Override // p132f0.AbstractC13789h, p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: b0 */
    public final void mo465b0() {
        super.mo465b0();
        if (this.f49357k0 != null) {
            this.f49357k0 = null;
            m39152e1();
        }
    }

    @Override // p132f0.AbstractC13789h
    /* JADX INFO: renamed from: b1 */
    public final C34462h0 mo39131b1() {
        return null;
    }

    @Override // p132f0.AbstractC13789h
    /* JADX INFO: renamed from: h1 */
    public final boolean mo39133h1(KeyEvent keyEvent) {
        return false;
    }

    @Override // p132f0.AbstractC13789h
    /* JADX INFO: renamed from: i1 */
    public final void mo39134i1(KeyEvent keyEvent) {
        this.f49202W.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // p132f0.AbstractC13789h, p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: r0 */
    public final void mo473r0(C34465k c34465k, EnumC34466l enumC34466l, long j7) {
        super.mo473r0(c34465k, enumC34466l, j7);
        InterfaceC30057d interfaceC30057d = null;
        int i13 = 0;
        if (enumC34466l != EnumC34466l.f144807x) {
            if (enumC34466l != EnumC34466l.f144808y || this.f49357k0 == null) {
                return;
            }
            ?? r10 = c34465k.f144800a;
            int size = ((Collection) r10).size();
            while (i13 < size) {
                C34472r c34472r = (C34472r) r10.get(i13);
                if (c34472r.m108956l() && !c34472r.equals(this.f49357k0)) {
                    this.f49357k0 = null;
                    m39152e1();
                    return;
                }
                i13++;
            }
            return;
        }
        C34472r c34472r2 = this.f49357k0;
        if (c34472r2 == null) {
            if (AbstractC16434o3.m46606f(c34465k, true, false)) {
                C34472r c34472r3 = (C34472r) c34465k.f144800a.get(0);
                c34472r3.m108946a();
                this.f49357k0 = c34472r3;
                if (this.f49201V) {
                    long jM108949e = c34472r3.m108949e();
                    InterfaceC21083i interfaceC21083i = this.f49196Q;
                    if (interfaceC21083i != null) {
                        C21086l c21086l = new C21086l(jM108949e);
                        if (m39150c1()) {
                            this.f49213h0 = AbstractC3006f0.m8732z(m7158L0(), null, null, new C0109h(interfaceC21083i, c21086l, this, interfaceC30057d, 20), 3);
                            return;
                        } else {
                            this.f49207b0 = c21086l;
                            AbstractC3006f0.m8732z(m7158L0(), null, null, new C13780e(interfaceC21083i, c21086l, null), 3);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        ?? r14 = c34465k.f144800a;
        int size2 = ((Collection) r14).size();
        for (int i14 = 0; i14 < size2; i14++) {
            if (!AbstractC34454d0.m108913d((C34472r) r14.get(i14))) {
                long jMo722D0 = AbstractC0201g.m516p(this).f776X.mo722D0(((InterfaceC2395j3) AbstractC0201g.m506f(this, AbstractC2453v1.f9580s)).getMinimumTouchTargetSize());
                float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jMo722D0 >> 32)) - ((int) (j7 >> 32))) / 2.0f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo722D0 & 4294967295L)) - ((int) (j7 & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
                int size3 = ((Collection) r14).size();
                while (i13 < size3) {
                    C34472r c34472r4 = (C34472r) r14.get(i13);
                    if (c34472r4.m108956l() || AbstractC34454d0.m108917h(c34472r4, j7, jFloatToRawIntBits)) {
                        this.f49357k0 = null;
                        m39152e1();
                        return;
                    }
                    i13++;
                }
                return;
            }
        }
        ((C34472r) r14.get(0)).m108946a();
        if (this.f49201V) {
            long jM108949e2 = c34472r2.m108949e();
            InterfaceC21083i interfaceC21083i2 = this.f49196Q;
            if (interfaceC21083i2 != null) {
                C2996c2 c2996c2 = this.f49213h0;
                if (c2996c2 == null || !c2996c2.isActive()) {
                    C21086l c21086l2 = this.f49207b0;
                    if (c21086l2 != null) {
                        AbstractC3006f0.m8732z(m7158L0(), null, null, new C13780e(c21086l2, interfaceC21083i2, interfaceC30057d, 1), 3);
                    }
                } else {
                    AbstractC3006f0.m8732z(m7158L0(), null, null, new C13774c(this, jM108949e2, interfaceC21083i2, (InterfaceC30057d) null, 1), 3);
                }
                this.f49207b0 = null;
            }
            this.f49202W.invoke();
        }
        this.f49357k0 = null;
    }
}
