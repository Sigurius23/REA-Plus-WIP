package p180h0;

import androidx.compose.foundation.gestures.AbstractC1096a;
import bc3.AbstractC3006f0;
import be.C3151d;
import go1.C16016a;
import l83.C23454a0;
import p005a3.AbstractC0201g;
import p028b4.C2698i;
import p077d0.C11347e2;
import p163g1.C15126r0;
import p206i0.AbstractC17833k;
import p238j0.InterfaceC21083i;
import p505ts.AbstractC34132o;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22663d0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: h0.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C16410k extends AbstractC16387f1 {

    /* JADX INFO: renamed from: Z */
    public C16435p f63069Z;

    /* JADX INFO: renamed from: a0 */
    public EnumC16377d2 f63070a0;

    /* JADX INFO: renamed from: b0 */
    public InterfaceC16432o1 f63071b0;

    /* JADX INFO: renamed from: c0 */
    public InterfaceC16432o1 f63072c0;

    /* JADX INFO: renamed from: d0 */
    public InterfaceC39171c f63073d0;

    /* JADX WARN: Illegal instructions before constructor call */
    public C16410k(C16435p c16435p, boolean z4, InterfaceC21083i interfaceC21083i, InterfaceC16432o1 interfaceC16432o1) {
        EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
        super(AbstractC1096a.f4536a, z4, interfaceC21083i, enumC16377d2);
        this.f63069Z = c16435p;
        this.f63070a0 = enumC16377d2;
        this.f63071b0 = interfaceC16432o1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j1 */
    public static final Object m46594j1(C16410k c16410k, float f13, AbstractC32269c abstractC32269c) {
        C16395h c16395h;
        C22663d0 c22663d0;
        if (abstractC32269c instanceof C16395h) {
            c16395h = (C16395h) abstractC32269c;
            int i13 = c16395h.f63036z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16395h.f63036z = i13 - Integer.MIN_VALUE;
            } else {
                c16395h = new C16395h(c16410k, abstractC32269c);
            }
        } else {
            c16395h = new C16395h(c16410k, abstractC32269c);
        }
        Object obj = c16395h.f63034x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c16395h.f63036z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c16410k.f63069Z.getClass();
            C22663d0 c22663d1 = new C22663d0();
            c22663d1.f89331w = f13;
            C16435p c16435p = c16410k.f63069Z;
            C16405j c16405j = new C16405j(c16410k, c22663d1, f13, null);
            c16395h.f63033w = c22663d1;
            c16395h.f63036z = 2;
            if (C16435p.m46611b(c16435p, c16405j, c16395h) == enumC31071a) {
                return enumC31071a;
            }
            c22663d0 = c22663d1;
        } else {
            if (i14 == 1) {
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22663d0 = c16395h.f63033w;
            AbstractC34132o.m107864I(obj);
        }
        return new Float(c22663d0.f89331w);
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: P0 */
    public final void mo285P0() {
        m46597m1(this.f63071b0);
    }

    @Override // p005a3.InterfaceC0229n, p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: c */
    public final void mo466c() {
        mo465b0();
        if (this.f9141N) {
            InterfaceC39171c interfaceC39171c = AbstractC0201g.m516p(this).f776X;
            InterfaceC39171c interfaceC39171c2 = this.f63073d0;
            if (interfaceC39171c2 == null || !interfaceC39171c2.equals(interfaceC39171c)) {
                this.f63073d0 = interfaceC39171c;
                m46597m1(this.f63071b0);
            }
        }
    }

    @Override // p180h0.AbstractC16387f1
    /* JADX INFO: renamed from: e1 */
    public final Object mo46581e1(C16382e1 c16382e1, C16382e1 c16382e2) {
        Object objM46611b = C16435p.m46611b(this.f63069Z, new C3151d(c16382e1, this, (InterfaceC30057d) null), c16382e2);
        return objM46611b == EnumC31071a.f128113w ? objM46611b : C23454a0.f92919a;
    }

    @Override // p180h0.AbstractC16387f1
    /* JADX INFO: renamed from: f1 */
    public final void mo46582f1(long j7) {
    }

    @Override // p180h0.AbstractC16387f1
    /* JADX INFO: renamed from: g1 */
    public final void mo46583g1(long j7) {
        if (this.f9141N) {
            AbstractC3006f0.m8732z(m7158L0(), null, null, new C2698i(this, j7, (InterfaceC30057d) null, 2), 3);
        }
    }

    @Override // p180h0.AbstractC16387f1
    /* JADX INFO: renamed from: h1 */
    public final boolean mo46584h1() {
        return this.f63069Z.f63156h.getValue() != null;
    }

    /* JADX INFO: renamed from: k1 */
    public final boolean m46595k1() {
        return AbstractC0201g.m516p(this).f777Y == EnumC39181m.f168424x && this.f63070a0 == EnumC16377d2.f62972x;
    }

    /* JADX INFO: renamed from: l1 */
    public final void m46596l1(C16435p c16435p, boolean z4, InterfaceC21083i interfaceC21083i, InterfaceC16432o1 interfaceC16432o1) {
        boolean z13;
        boolean z14;
        EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
        this.f63071b0 = interfaceC16432o1;
        if (AbstractC22676k.m65745e(this.f63069Z, c16435p)) {
            z13 = false;
        } else {
            this.f63069Z = c16435p;
            m46597m1(interfaceC16432o1);
            z13 = true;
        }
        if (this.f63070a0 != enumC16377d2) {
            this.f63070a0 = enumC16377d2;
            z14 = true;
        } else {
            z14 = z13;
        }
        m46585i1(this.f63007R, z4, interfaceC21083i, enumC16377d2, z14);
    }

    /* JADX INFO: renamed from: m1 */
    public final void m46597m1(InterfaceC16432o1 interfaceC16432o1) {
        if (interfaceC16432o1 == null) {
            C11347e2 c11347e2 = AbstractC16362b.f62900a;
            C16016a c16016a = AbstractC16362b.f62901b;
            InterfaceC39171c interfaceC39171c = AbstractC0201g.m516p(this).f776X;
            this.f63073d0 = interfaceC39171c;
            interfaceC16432o1 = AbstractC17833k.m51268e(new C16368c(this.f63069Z, c16016a, new C15126r0(2, interfaceC39171c), 0), c11347e2);
        }
        this.f63072c0 = interfaceC16432o1;
    }
}
